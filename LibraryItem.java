package lib;
/**
 * The LibraryItem class serves as an abstract base class for all items in the library.
 * It provides common properties and methods for its subclasses, such as Books, Magazines, and DVDs.
 */
abstract class LibraryItem {
    private String title;    // The title of the library item.
    private String id;       // A unique identifier for the library item.

    //Constructor to initialize the title and ID of the library item.
    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }
    /**
     * Abstract method to display the details of the library item.
     * Subclasses must implement this method to provide specific details about the item.
     */
    public abstract void displayDetails();
}