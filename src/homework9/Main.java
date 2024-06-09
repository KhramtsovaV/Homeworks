package homework9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        Animal[] animals = generateRandomAnimals(n);

        printAnimals(animals);

        flyAll(animals);
        voiceAll(animals);
        eatAll(animals);
    }


    private static Animal[] generateRandomAnimals(int n) {
        Random random = new Random();
        Animal[] animals = new Animal[n];

        for (int i = 0; i < n; i++) {
            int animalType = random.nextInt(7);
            String name = "Animal" + (i + 1);
            int id = i + 1;

            switch (animalType) {
                case 0:
                    animals[i] = new Cat(name, id);
                    break;
                case 1:
                    animals[i] = new Fish(name, id);
                    break;
                case 2:
                    animals[i] = new Crow(name, id);
                    break;
                case 3:
                    animals[i] = new Cow(name, id);
                    break;
                case 4:
                    animals[i] = new Monkey(name, id);
                    break;
                case 5:
                    animals[i] = new Spider(name, id);
                    break;
                default:
                    animals[i] = new Cat(name, id);
                    break;
            }
        }

        return animals;
    }

    private static void printAnimals(Animal[] animals) {
        System.out.println("All animals:");
        for (Animal animal : animals) {
            System.out.println();
        }

        System.out.println();
    }

    private static void flyAll(Animal[] animals) {
        System.out.println("Fly:");

        for (Animal animal : animals) {
            animal.fly();
        }

        System.out.println();
    }

    private static void voiceAll(Animal[] animals) {
        System.out.println("voice");

        for (Animal animal : animals) {
            animal.voice();
        }

        System.out.println();
    }


    private static void eatAll(Animal[] animals) {
        System.out.println("eat");

        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println();
    }
}
