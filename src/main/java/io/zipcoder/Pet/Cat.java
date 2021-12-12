package io.zipcoder.Pet;

public class Cat extends Pet {

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
        super.setType("Cat");
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
