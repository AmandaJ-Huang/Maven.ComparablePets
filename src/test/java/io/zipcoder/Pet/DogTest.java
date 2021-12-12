package io.zipcoder.Pet;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testSpeak() {
        // Given
        Dog dog = new Dog();
        String expected = "woof";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
