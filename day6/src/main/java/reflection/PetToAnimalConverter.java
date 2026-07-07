package reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetToAnimalConverter {

    public static Animal convertToAnimal(Pet pet) {
        Animal animal = new Animal();

        try {
            Field[] petFields = Pet.class.getDeclaredFields();

            for (Field petField : petFields) {
                petField.setAccessible(true);
                Object value = petField.get(pet);

                String fieldName = petField.getName();

                switch (fieldName) {
                    case "name":
                        setField(animal, "title", value);
                        break;
                    case "status":
                        setField(animal, "isAvailable", statusToBoolean(value, "AVAILABLE"));
                        setField(animal, "isSold", statusToBoolean(value, "SOLD"));
                        break;
                    case "photosList":
                        setField(animal, "photosMap", photosListToMap(value));
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return animal;
    }

    private static void setField(Object obj, String fieldName, Object value) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            // пропускаем
        }
    }

    private static boolean statusToBoolean(Object status, String target) {
        if (status == null) return false;
        return status.toString().equals(target);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, String> photosListToMap(Object photosList) {
        Map<String, String> map = new HashMap<>();
        if (photosList == null) return map;

        List<Photo> list = (List<Photo>) photosList;
        for (Photo photo : list) {
            map.put(photo.getName(), photo.getURL());
        }
        return map;
    }
}