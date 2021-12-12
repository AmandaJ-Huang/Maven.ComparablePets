package io.zipcoder;


import io.zipcoder.Pet.Cat;
import io.zipcoder.Pet.Chupacabra;
import io.zipcoder.Pet.Dog;
import io.zipcoder.Pet.Pet;

import java.util.ArrayList;
import java.util.List;

public class Application implements Runnable {
    private final IOConsole ioConsole = new IOConsole();
    private final List<Pet> petList = new ArrayList<>();

    public void run() {
        Integer numberOfPets = ioConsole.getIntegerInput("How many pets do you have?");

        for (int i = 0; i < numberOfPets; i++) {
            String petType = ioConsole.getStringInput("What kind of pet is pet " + (i+1) + "?" +
                    "\n[ cat ] [ dog ] [ chupacabra ]");
            String petName = ioConsole.getStringInput("What is the name of that pet?");

            petList.add(i, createPet(petType, petName));
        }
        String allPets = "";
        for (Pet pet : petList) {
            allPets += ("\n" + pet.getName() + " says: " + pet.speak());
        }
        System.out.println(allPets);
    }

    public Pet createPet(String petType, String petName) {
        if (petType.equalsIgnoreCase("cat")) {
            return new Cat(petName);
        } else if (petType.equalsIgnoreCase("dog")) {
            return new Dog(petName);
        } else if (petType.equalsIgnoreCase("chupacabra")) {
            return new Chupacabra(petName);
        }
        return null;
    }

}
