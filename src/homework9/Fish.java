package homework9;

class Fish extends AbstractAnimal {
    public Fish(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " can't fly");
    }

    public void voice() {
        System.out.println(getName() + " doesn't make a sound");
    }

    public void eat() {
        System.out.println(getName() + " eats seaweed");
    }
}
