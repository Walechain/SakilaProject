package com.example.sakila.assembler;

import com.example.sakila.controllers.ActorController;
import com.example.sakila.dto.output.ActorOutput;
import com.example.sakila.entites.Actor;
import jakarta.validation.constraints.NotNull;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class ActorModelAssembler implements RepresentationModelAssembler<Actor, EntityModel<ActorOutput>> {

    @Override
    public EntityModel<ActorOutput> toModel(Actor actor) {
        ActorOutput actorOutput = ActorOutput.from(actor);
        return EntityModel.of(actorOutput,
                linkTo(methodOn(ActorController.class).readAll()).withRel("actors"));
    }
}