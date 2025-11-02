public class Answer3 {

    public static void main(String[] args) {

        // Creating two book objects
        Book book1 = new Book();  // using default constructor
        Book book2 = new Book("Java Programming", "Sakshi", 2024);  // using parameterized constructor

        // Displaying book details
        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println("Book 2:");
        book2.displayInfo();
    }
}

// Book class definition
class Book {
    // Instance variables
    String title;
    String author;
    int year;

    // Default constructor
    public Book() {
        this.title = "Not specified";
        this.author = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
