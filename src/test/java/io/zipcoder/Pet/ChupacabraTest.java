package io.zipcoder.Pet;

import org.junit.Assert;
import org.junit.Test;

public class ChupacabraTest {

    @Test
    public void testSpeak() {
        // Given
        Chupacabra chupacabra = new Chupacabra();
        String expected = "fear me";

        // When
        String actual = chupacabra.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
