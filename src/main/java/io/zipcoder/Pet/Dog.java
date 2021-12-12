package io.zipcoder.Pet;

public class Dog extends Pet {

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
        super.setType("Dog");
    }

    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
