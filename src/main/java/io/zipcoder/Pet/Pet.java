package io.zipcoder.Pet;

public abstract class Pet implements Comparable<Pet> {
    private String name;

    public Pet() {
        this("");
    }

    public Pet(String name) {
        this.name = name;
    }

    public abstract String speak();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
