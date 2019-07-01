package org.gradle;

import org.apache.commons.collections.list.GrowthList;

/**
* Person.
* @author Regis Humana.
*/
public class Person {
    private final String name;

    /**
     * Constructor.
     */
    public Person(final String name) {
        this.name = name;
        new GrowthList();
    }

    /**
     * Get Name.
     */
    public String getName() {
        return name;
    }
}
