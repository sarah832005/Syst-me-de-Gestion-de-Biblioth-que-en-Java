package lib;

/**
 * The LibraryManager class is responsible for managing library items such as Books, Magazines, and DVDs.
 * It provides methods for adding, displaying, searching, and deleting items, as well as displaying items by type.
 */
class LibraryManager {
    private LibraryItem[] items; // Array to store library items.
    private int itemCount;  // Tracks the number of items in the library.

    //Constructor to initialize the LibraryManager with a specified capacity.
    //capacity The maximum number of items the library can hold.
    public LibraryManager(int capacity) {
        items = new LibraryItem[capacity];
        itemCount = 0;
    }
    //Adds a new item to the library inventory.
    public void addItem(LibraryItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
            System.out.println("Item added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more items.");
        }
    }

    /**
     * Displays all items currently in the library.
     * If there are no items, a message is displayed indicating the library is empty.
     */
    public void displayItems() {
        if (itemCount == 0) {
            System.out.println("No items in the library.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                items[i].displayDetails();
            }
        }
    }

    /**
     * Searches for a library item by its unique ID.
     *
     *  id The unique ID of the item to search for.
     */
    public void searchItem(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                System.out.println("Item found:");
                items[i].displayDetails();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    /**
     * Deletes a library item by its unique ID.
     *
     * id The unique ID of the item to be deleted.
     */

    public void deleteItem(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                // Shift items to fill the gap left by the deleted item.
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--itemCount] = null; // Reduce item count and clear the last slot.
                System.out.println("Item deleted successfully!");
                return;
            }
        }
        System.out.println("Item not found.");
    }
    /**
     * Displays all books currently in the library.
     * If no books are found, a message is displayed.
     */
    public void displayBooks() {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] instanceof Book) {
                items[i].displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }
    /**
     * Displays all magazines currently in the library.
     * If no magazines are found, a message is displayed.
     */
    public void displayMagazines() {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] instanceof Magazine) {
                items[i].displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No magazines available.");
        }
    }
    /**
     * Displays all DVDs currently in the library.
     * If no DVDs are found, a message is displayed.
     */
    public void displayDVDs() {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] instanceof DVD) {   //instance of check whether an object is an instance of a specific class or subclass
                items[i].displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVDs available.");
        }
    }
}
