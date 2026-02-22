package core.oop;

import java.util.Scanner;

public class RuntimePolymorphismDemo_V51 {
    public static void main(String[] args) {
        //Polymorphism (Çok Biçimlilik)
        //Runtime Polymorphism
        //Dynamic Binding

        Scanner scanner = new Scanner(System.in);

        Animal_51 animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog_51();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat_51();
            animal.speak();
        }
        else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
