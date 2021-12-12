package io.zipcoder;


import io.zipcoder.Pet.Cat;
import io.zipcoder.Pet.Chupacabra;
import io.zipcoder.Pet.Dog;
import io.zipcoder.Pet.Pet;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void testCreateCat() {
        // Given
        Application application = new Application();
        Pet oscar = application.createPet("cat", "oscar");

        // Then
        Assert.assertTrue(oscar instanceof Cat);
    }

    @Test
    public void testCreateDog() {
        // Given
        Application application = new Application();
        Pet max = application.createPet("dog", "max");

        // Then
        Assert.assertTrue(max instanceof Dog);
    }

    @Test
    public void testCreateChupacabra() {
        // Given
        Application application = new Application();
        Pet daisy = application.createPet("chupacabra", "daisy");

        // Then
        Assert.assertTrue(daisy instanceof Chupacabra);
    }
}
