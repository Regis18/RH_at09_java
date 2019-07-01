package org.gradle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * PersonTest.
 * @author Regis Humana.
 */
public class PersonTest {

    /**
     * Verify if the method can constuct a person with name.
     */
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
