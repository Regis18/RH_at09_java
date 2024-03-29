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
     * @param name String.
     */
    public Person(final String name) {
        this.name = name;
        new GrowthList();
    }

    /**
     * Get Name.
     * @return name String.
     */
    public String getName() {
        return name;
    }
}
