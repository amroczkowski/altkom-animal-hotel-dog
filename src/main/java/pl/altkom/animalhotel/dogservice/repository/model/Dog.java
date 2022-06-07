package pl.altkom.animalhotel.dogservice.repository.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDate dateOfBirth;
    private String breed;
    private Long ownerId;
}
