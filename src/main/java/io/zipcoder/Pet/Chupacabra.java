package io.zipcoder.Pet;

public class Chupacabra extends Pet {

    public Chupacabra() {
        super();
    }

    public Chupacabra(String name) {
        super(name);
        super.setType("Chupacabra");
    }

    @Override
    public String speak() {
        return "fear me";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
