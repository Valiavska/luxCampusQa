package Animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class TestCat {
    // аннотация @Test
    @Test
    public void checkCatSound() {
        //GIVEN
        // create object "cat"
        Cat cat = new Cat("testCat", 4, "pet");
        String expectedSound = "meow meow";
        //WHEN
        // call method "makeSound" which will tested
        String actualSound = cat.makeSound();
        //THEN
        // compare results
        Assertions.assertEquals(expectedSound, actualSound,
                                String.format("Expected '%s', but was '%s' ", expectedSound, actualSound));
    }

    // using reflection "getSimpleName()"
    @Test
    public void checkCatClass() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedSimpleName = "Cat";
        //WHEN
        String actualSimpleName = cat.getClass().getSimpleName();
        //THEN
        Assertions.assertEquals(expectedSimpleName, actualSimpleName);
    }

    // check reflection "getName()"
    @Test
    public void checkCatNameClass() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedClassName = "Animals.Cat";
        //WHEN
        String actualClassName = cat.getClass().getName();
        //THEN
        Assertions.assertEquals(expectedClassName, actualClassName);
    }

    // check, Is Class public?
    @Test
    public void checkPublicClass() {
        //GIVEN
        int name = Cat.class.getModifiers();
        boolean expectedClassPublic = true;
        //WHEN
        boolean actualClassPublic = Modifier.isPublic(name);
        //THEN
        Assertions.assertEquals(expectedClassPublic, actualClassPublic);
    }
}