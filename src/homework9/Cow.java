package homework9;

class Cow extends AbstractAnimal {
    public Cow(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " can't fly");
    }

    public void voice() {
        System.out.println(getName() + " Moo");
    }

    public void eat() {
        System.out.println(getName() + " eats grass");
    }
}
