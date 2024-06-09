package homework9;

abstract class AbstractAnimal implements Animal {
    private String name;
    private int id;

    public AbstractAnimal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}