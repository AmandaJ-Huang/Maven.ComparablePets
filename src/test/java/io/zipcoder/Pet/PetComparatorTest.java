package io.zipcoder.Pet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class PetComparatorTest {
    private Pet[] petArr;

    private Cat cat1 = new Cat("Stella");
    private Cat cat2 = new Cat("Duce");
    private Cat cat3 = new Cat("Jon");

    private Dog dog1 = new Dog("Max");
    private Dog dog2 = new Dog("Ellie");
    private Dog dog3 = new Dog("Pepper");

    private Chupacabra chupa1 = new Chupacabra("Charlie");
    private Chupacabra chupa2 = new Chupacabra("Daisy");
    private Chupacabra chupa3 = new Chupacabra("Bob");


    @Before
    public void setUp() throws Exception {
        petArr = new Pet[]{cat1, chupa3, dog1, chupa2, cat2, dog3, chupa1, cat3, dog2};
    }

    @Test
    public void testComparison() {
        // Given
        List<Pet> petList = new ArrayList<>();
        petList.addAll(Arrays.asList(petArr));
        PetComparator petComparator = new PetComparator();
        String expected = "[Duce, Jon, Stella, Bob, Charlie, Daisy, Ellie, Max, Pepper]";

        // When
        Collections.sort(petList, petComparator);
        String actual = petList.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
