package homework9;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int n = getArraySizeFromUser();
            Animal[] animals = generateRandomAnimals(n);

            printAnimals(animals);

            flyAll(animals);
            voiceAll(animals);
            eatAll(animals);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int getArraySizeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            throw new IllegalArgumentException("array size must be positive ");
        }

        return size;
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
            System.out.println(animal);
        }

        System.out.println();
    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose action:");
        System.out.println("1. Fly");
        System.out.println("2. Voice");
        System.out.println("3. Eat");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 3) {
            throw new IllegalArgumentException("Error, try again");
        }

        return choice;
    }

    private static void performAction(int choice, Animal[] animals) {
        switch (choice) {
            case 1:
                flyAll(animals);
                break;
            case 2:
                voiceAll(animals);
                break;
            case 3:
                eatAll(animals);
                break;
        }
    }

    private static void flyAll(Animal[] animals) {
        System.out.println("Fly:");

        for (Animal animal : animals) {
            animal.fly();
        }

        System.out.println();
    }

    private static void voiceAll(Animal[] animals) {
        System.out.println("Voice:");

        for (Animal animal : animals) {
            animal.voice();
        }

        System.out.println();
    }

    private static void eatAll(Animal[] animals) {
        System.out.println("Eat:");

        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println();
    }
}