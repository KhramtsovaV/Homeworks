package homework9;

class Crow extends AbstractAnimal {
    public Crow(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " can fly");
    }

    public void voice() {
        System.out.println(getName() + " caws");
    }

    public void eat() {
        System.out.println(getName() + " eats small animals");
    }
}

