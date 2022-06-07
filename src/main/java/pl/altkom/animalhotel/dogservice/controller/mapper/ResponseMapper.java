package pl.altkom.animalhotel.dogservice.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import pl.altkom.animalhotel.dogservice.controller.model.Dog;

public class ResponseMapper {
    public static List<Dog> map(
            final List<pl.altkom.animalhotel.dogservice.repository.model.Dog> dogs) {
        return dogs.stream()
                .map(ResponseMapper::map)
                .collect(Collectors.toList());
    }

    public static Dog map(final pl.altkom.animalhotel.dogservice.repository.model.Dog dog) {
        return Dog.builder()
                .id(dog.getId())
                .name(dog.getName())
                .dateOfBirth(dog.getDateOfBirth())
                .breed(dog.getBreed())
                .ownerId(dog.getOwnerId())
                .build();
    }
}
