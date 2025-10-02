package lib;
/**
 * The Book class represents a specific type of library item that includes information about the author.
 * It inherits common properties and behaviors from the LibraryItem class.
 */
class Book extends LibraryItem {
    private String author; // The author of the book.

    public Book(String title, String id, String author) { // Constructor to initialize the book's title, ID, and author.
        super(title, id); // Call the constructor of the parent class (LibraryItem).
        this.author = author;
    }
    /**
     * Overrides the displayDetails method from the LibraryItem class.
     * Displays the specific details of the book, including its title, ID, and author.
     */
    @Override
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + ", ID: " + getId() + ", Author: " + author);
    }
}
