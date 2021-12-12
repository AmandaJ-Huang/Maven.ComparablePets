package io.zipcoder.Pet;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testSpeak() {
        // Given
        Cat cat = new Cat();
        String expected = "meow";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
