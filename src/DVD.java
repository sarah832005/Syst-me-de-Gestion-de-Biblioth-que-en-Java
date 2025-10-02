package lib;
/**
 * The DVD class represents a specific type of library item that includes information about its duration.
 * It inherits common properties and behaviors from the LibraryItem class.
 */
class DVD extends LibraryItem {
    private String duration; // The duration of the DVD (e.g., in hours and minutes)

    public DVD(String title, String id, String duration) { //Constructor to initialize the DVD's title, ID, and duration.
        super(title, id); // Call the constructor of the parent class (LibraryItem).
        this.duration = duration;
    }
    /**
     * Overrides the displayDetails method from the LibraryItem class.
     * Displays the specific details of the DVD, including its title, ID, and duration.
     */
    @Override
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + ", ID: " + getId() + ", Duration: " + duration);
    }
}
