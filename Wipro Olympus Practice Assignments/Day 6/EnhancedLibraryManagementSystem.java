import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnhancedLibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        if (ch == 1) {
            Library<Book> bookLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int numpages = scanner.nextInt();
                Book book = new Book(id, name, author, numpages);
                bookLibrary.addItem(book);
            }
            bookLibrary.displayItems();
        } else if (ch == 2) {
            Library<DVD> dvdLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String director = scanner.nextLine();
                int duration = scanner.nextInt();
                DVD dvd = new DVD(id, name, director, duration);
                dvdLibrary.addItem(dvd);
            }

            Library<Magazine> magazineLibrary = new Library<>();
            n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String publisher = scanner.nextLine();
                int issueno = scanner.nextInt();
                Magazine magazine = new Magazine(id, name, publisher, issueno);
                magazineLibrary.addItem(magazine);
            }
            dvdLibrary.displayItems();
            magazineLibrary.displayItems();
        } else if (ch == 3) {
            Library<Book> bookLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int numpages = scanner.nextInt();
                Book book = new Book(id, name, author, numpages);
                bookLibrary.addItem(book);
            }

            // Checking out and returning items
            int itemId = scanner.nextInt();

            if (bookLibrary.checkOutItem(itemId)) {
                System.out.println("Item " + itemId + " checked out successfully.");
            } else {
                System.out.println("Item " + itemId + " not found in the library.");
            }
        } else if (ch == 4) {
            Library<Magazine> magazineLibrary = new Library<>();

            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String publisher = scanner.nextLine();
                int issueno = scanner.nextInt();
                Magazine magazine = new Magazine(id, name, publisher, issueno);
                // Set the magazine initially checked out (as per your original code)
                magazine.checkedOut = true;
                magazineLibrary.addItem(magazine);
            }

            int itemId = scanner.nextInt();

            if (magazineLibrary.returnItem(itemId)) {
                System.out.println("Item " + itemId + " returned successfully.");
            } else {
                System.out.println("Item " + itemId + " not found in the library.");
            }
        }

        scanner.close();
    }
}

class LibraryItem {
    private int itemId;
    private String title;
    private String creator;
    public boolean checkedOut;

    // Constructor
    public LibraryItem(int itemId, String title, String creator) {
        this.itemId = itemId;
        this.title = title;
        this.creator = creator;
        this.checkedOut = false;
    }

    // Getter methods
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    // checkOut: throws ItemAlreadyCheckedOutException if already checked out
    public void checkOut() {
        if (this.checkedOut) {
            throw new ItemAlreadyCheckedOutException(this.itemId);
        }
        this.checkedOut = true;
    }

    // returnItem: throws ItemNotCheckedOutException if not currently checked out
    public void returnItem() {
        if (!this.checkedOut) {
            throw new ItemNotCheckedOutException(this.itemId);
        }
        this.checkedOut = false;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nCreator: " + creator + "\nChecked Out: " + checkedOut;
    }
}

// Custom Exceptions
class ItemAlreadyCheckedOutException extends RuntimeException {
    public ItemAlreadyCheckedOutException(int itemId) {
        super("Item " + itemId + " is already checked out");
    }
}

class ItemNotCheckedOutException extends RuntimeException {
    public ItemNotCheckedOutException(int itemId) {
        super("Item " + itemId + " is not checked out");
    }
}

class Book extends LibraryItem {
    private int numPages;

    // Constructor: itemId, title, author, numPages
    public Book(int itemId, String title, String author, int numPages) {
        super(itemId, title, author);
        this.numPages = numPages;
    }

    // Optional getter
    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Book\nNumber of Pages: " + numPages;
    }
}

class DVD extends LibraryItem {
    private int duration; // in minutes

    // Constructor: itemId, title, director, duration
    public DVD(int itemId, String title, String director, int duration) {
        super(itemId, title, director);
        this.duration = duration;
    }

    // Optional getter
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: DVD\nDuration: " + duration + " minutes";
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    // Constructor: itemId, title, publisher, issueNumber
    public Magazine(int itemId, String title, String publisher, int issueNumber) {
        super(itemId, title, publisher);
        this.issueNumber = issueNumber;
    }

    // Optional getter
    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Magazine\nIssue Number: " + issueNumber;
    }
}

class Library<T extends LibraryItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
            System.out.println("-------------");
        }
    }

    public boolean checkOutItem(int itemId) {
        T item = findItem(itemId);
        if (item == null) {
            return false;
        }
        try {
            item.checkOut();
            return true;
        } catch (ItemAlreadyCheckedOutException ex) {
            // Print the custom exception message (format already set in exception class)
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean returnItem(int itemId) {
        T item = findItem(itemId);
        if (item == null) {
            return false;
        }
        try {
            item.returnItem();
            return true;
        } catch (ItemNotCheckedOutException ex) {
            // Print the custom exception message
            System.out.println(ex.getMessage());
            return false;
        }
    }

    private T findItem(int itemId) {
        for (T item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }
}