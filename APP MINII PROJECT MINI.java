import javax.swing.*;
import java.awt.event.ActionEvent;
import
java.awt.event.ActionListener;
import java.util.ArrayList;
class Book {
private String title;
private String author;
public Book(String title, String author) {
this.title = title;
this.author = author;
}
public String getTitle() {
return title;
}
public String getAuthor() {
return author;
}
public String toString() {
return "Book [title=" + title + ", author=" + author + "]";
}
}
class Library {
private ArrayList<Book> books;
public Library() {
this.books = new ArrayList<>();
}
public void addBook(Book book)
{ books.add(book);
}
public ArrayList<Book> getBooks() {
return books;
}
}
public class LibrarySystemGUI {
private static Library library = new Library();
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> createAndShowGUI());
}
private static void createAndShowGUI() {
JFrame frame = new JFrame("Library Management System");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton addBookButton = new JButton("Add Book");
JButton displayBooksButton = new JButton("Display Books");
addBookButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
String title = JOptionPane.showInputDialog(frame, "Enter book title:");
String author = JOptionPane.showInputDialog(frame, "Enter author name:");
Book newBook = new Book(title, author);
library.addBook(newBook);
JOptionPane.showMessageDialog(frame, "Book added successfully!");
}
});
displayBooksButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
StringBuilder bookList = new StringBuilder("List of Books:\n");
for (Book book : library.getBooks()) {
bookList.append(book).append("\n");
}
JOptionPane.showMessageDialog(frame, bookList.toString());
}
});
JPanel panel = new JPanel();
panel.add(addBookButton);
panel.add(displayBooksButton);
frame.getContentPane().add(panel);
frame.setSize(300, 200);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
}