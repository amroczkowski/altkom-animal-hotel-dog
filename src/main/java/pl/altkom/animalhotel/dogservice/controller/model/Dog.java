package pl.altkom.animalhotel.dogservice.controller.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Dog {

    private Long id;

    private String name;
    private LocalDate dateOfBirth;
    private String breed;
    private Long ownerId;
}
