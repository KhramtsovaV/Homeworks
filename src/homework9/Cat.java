package homework9;

class Cat extends AbstractAnimal {
    public Cat(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " can't fly");
    }

    public void voice() {
        System.out.println(getName() + " muay");
    }

    public void eat() {
        System.out.println(getName() + " eat mouses");
    }
}
