package College;

// Importing required classes
import java.util.Scanner;

// Class
public class Book {

    // Class data members
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    // Creating object of Scanner class to
    // read input from users
    private static Scanner input = new Scanner(System.in);

    // Constructor
    // To add book details
    public Book() {
        // Display message for taking input later
        // taking input via
        // nextInt() and nextLine() standard methods
        System.out.println("Enter Serial No of Book:");
        this.sNo = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.println("Enter Book Name:");
        this.bookName = input.nextLine();

        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();

        System.out.println("Enter Quantity of Books:");
        this.bookQty = input.nextInt();
        bookQtyCopy = this.bookQty;
    }

    // Method to close the Scanner object
    public static void closeScanner() {
        input.close();
    }
}