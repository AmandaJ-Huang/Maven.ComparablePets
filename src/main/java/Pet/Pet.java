package Pet;

public abstract class Pet {
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
