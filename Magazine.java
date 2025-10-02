package lib;
/**
 * The Magazine class represents a specific type of library item that includes information about its issue.
 * It inherits common properties and behaviors from the LibraryItem class.
 */
class Magazine extends LibraryItem {
    private String issue;  // The issue identifier or edition of the magazine.
   // Constructor to initialize the magazine's title, ID, and issue.
    public Magazine(String title, String id, String issue) {  // Call the constructor of the parent class (LibraryItem).
        super(title, id);
        this.issue = issue;
    }
    /**
     * Overrides the displayDetails method from the LibraryItem class.
     * Displays the specific details of the magazine, including its title, ID, and issue.
     */
    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + ", ID: " + getId() + ", Issue: " + issue);
    }
}
