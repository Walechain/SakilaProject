package com.example.sakila.converter;

import com.example.sakila.entites.Rating;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.lang.annotation.Annotation;
import java.util.logging.Logger;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating, String> {

    Logger log = Logger.getLogger(RatingConverter.class.getSimpleName());

    @Override
    public String convertToDatabaseColumn(Rating rating) {
        switch (rating){
            case G:
                return "G";

            case PG:
                return "PG";
            case PG_13:
                return "PG-13";
            case R:
                return "R";
            case NC_17:
                return "NC-17";
            default:
                throw new IllegalArgumentException("Rating" + " " + rating +" " +"not supported.");
        }
    }

    @Override
    public Rating convertToEntityAttribute(String s) {
        switch (s) {
            case "G":
                return Rating.G;
            case "PG":
                return Rating.PG;
            case "PG-13":
                return Rating.PG_13;
            case "R":
                return Rating.R;
            case "NC-17":
                return Rating.NC_17;
            default:
                throw new IllegalArgumentException("Rating" + " " + s +" " +"not supported.");


        }
    }
}

