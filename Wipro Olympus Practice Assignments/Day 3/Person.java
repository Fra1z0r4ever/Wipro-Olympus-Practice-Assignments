import java.util.Scanner;

public class Person {
    // Member variables
    String name;
    int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        // Creating Person object using user input
        Person person = new Person(name, age);

        // Displaying the details
        person.displayDetails();

        scanner.close();
    }
}
