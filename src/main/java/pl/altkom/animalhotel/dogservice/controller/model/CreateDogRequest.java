package pl.altkom.animalhotel.dogservice.controller.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class CreateDogRequest {

    @NotNull
    private String name;
    @NotNull
    private LocalDate dateOfBirth;
    @NotNull
    private String breed;
    private Long ownerId;
}
