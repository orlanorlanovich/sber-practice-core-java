package reflection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo("cat1", "url1"));
        photos.add(new Photo("cat2", "url2"));

        Pet pet = new Pet("PetName", Status.AVAILABLE, photos);
        Animal animal = PetToAnimalConverter.convertToAnimal(pet);

        System.out.println(animal);
    }
}