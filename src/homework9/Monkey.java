package homework9;

class Monkey extends AbstractAnimal {
    public Monkey(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " can't fly");
    }

    public void voice() {
        System.out.println(getName() + " Y-A-Y");
    }

    public void eat() {
        System.out.println(getName() + " eats fruit");
    }
}
