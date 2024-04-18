package com.example.sakila.controllers;

import com.example.sakila.assembler.ActorModelAssembler;
import com.example.sakila.dto.input.ActorInput;
import com.example.sakila.dto.input.ValidationGroup;
import com.example.sakila.dto.output.ActorOutput;
import com.example.sakila.entites.Actor;
import com.example.sakila.repositories.ActorRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.sakila.dto.input.ValidationGroup.Create;

@RestController
@RequestMapping("/actors")
public class ActorController {
    @Autowired
    private ActorRepository actorRepository;

    private ActorModelAssembler assembler;


//    @GetMapping
//    public List<ActorOutput> readAll() {
//        final var actors = actorRepository.findAll();
//        return actors.stream()
//                .map(ActorOutput::from)
//                .collect(Collectors.toList());
//    }

    ActorController(ActorRepository actorRepository, ActorModelAssembler assembler) {
        this.actorRepository = actorRepository;
        this.assembler = assembler;
    }
    @GetMapping
    public CollectionModel<EntityModel<ActorOutput>> readAll() {
        List<EntityModel<ActorOutput>> actors = actorRepository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

        Link selfLink = WebMvcLinkBuilder.linkTo(ActorController.class).withSelfRel();
        return CollectionModel.of(actors, selfLink);
    }
    @GetMapping("/{id}")
    public ActorOutput readById(@PathVariable Short id) {
        return actorRepository.findById(id)
                .map(ActorOutput::from)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("No such actor with id %d", id)
                ));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ActorOutput create(@Validated(Create.class) @RequestBody ActorInput data) {
        final var actor = new Actor();
        actor.setFirstName(data.getFirstName());
        actor.setLastName(data.getLastName());
        final var saved = actorRepository.save(actor);
        return ActorOutput.from(saved);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ActorOutput update(@PathVariable Short id, @Validated(ValidationGroup.Update.class) @RequestBody ActorInput data) {
        Actor actor = actorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Actor with id does not exist" + id));
        if (data.getFirstName() != null) {
            actor.setFirstName(data.getFirstName());
        } else if (data.getLastName() != null) {
            actor.setLastName(data.getLastName());
        }
        Actor updatedActor = actorRepository.save(actor);
        return ActorOutput.from(updatedActor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ActorOutput update(@PathVariable short id){
        Actor actor = actorRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Actor with id does not exist" + id));
        actorRepository.delete(actor);
        return null;
    }

}
