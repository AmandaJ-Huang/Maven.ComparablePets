package io.zipcoder.Pet;

public abstract class Pet implements Comparable<Pet> {
    private String name;
    private String type;

    public Pet() {
        this("noname");
    }

    public Pet(String name) {
        this.name = name;
        this.type = "";
    }

    public abstract String speak();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return name;
    }
}
