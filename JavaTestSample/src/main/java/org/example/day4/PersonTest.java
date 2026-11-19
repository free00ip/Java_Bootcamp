package org.example.day4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {


    private Person person;

    @Before

    public void setUp() throws Exception {

        // TODO: Initialize person object

        person = new Person();

    }

    @After

    public void tearDown() throws Exception {

        // TODO: Tear down person object (set to null)

        person = null;
    }

    @Test

    public void testGettersAndSetters() {

        // TODO: Test setWeight/getWeight and setHeight/getHeight

        person.setWeight(65);
        assertEquals(65, person.getWeight());

        person.setHeight(1.65f);
        assertEquals(1.65f, person.getHeight(), 0.0001f);

    }

    @Test

    public void testGetBodyMassIndex() {

        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)

        assertEquals("Underweight", person.getBodyMassIndex(60, 2));
        assertEquals("Normal weight", person.getBodyMassIndex(74, 1.73f));
        assertEquals("Overweight", person.getBodyMassIndex(75, 1.63f));
        assertEquals("Obese", person.getBodyMassIndex(113, 1.63f));

        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)

        assertEquals("Invalid input", person.getBodyMassIndex(0, 2));
        assertEquals("Invalid input", person.getBodyMassIndex(-1, 2));
        assertEquals("Obese", person.getBodyMassIndex(600, 2));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 2));

        assertEquals("Invalid input", person.getBodyMassIndex(68, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(68, -1));
        assertEquals("Underweight", person.getBodyMassIndex(130, 3));
        assertEquals("Invalid input", person.getBodyMassIndex(168, 3.01f));


        /* + some extra to check BMI boundaries points - 18.5 , 25, 30
        assertEquals("Normal weight", person.getBodyMassIndex(18.5, 1));
        assertEquals("Overweight", person.getBodyMassIndex(100, 2));
        assertEquals("Obese", person.getBodyMassIndex(120, 2));
        */

    }

}
