package io.zipcoder.Pet;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet petOne, Pet petTwo) {

        // Comparing Pets
        int comparePetNames = petOne.getName().compareTo(petTwo.getName());
        int comparePetTypes = petOne.getType().compareTo(petTwo.getType());

        return (comparePetTypes == 0) ? comparePetNames : comparePetTypes;
    }
}
