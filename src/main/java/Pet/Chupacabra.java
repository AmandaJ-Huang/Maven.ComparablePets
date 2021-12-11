package Pet;

public class Chupacabra extends Pet {

    public Chupacabra() {
        super();
    }

    public Chupacabra(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "fear me";
    }
}
