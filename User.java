package lib;
/**
 * The User class represents a library member with a unique ID and name.
 * It provides methods to retrieve user details and display them.
 */
class User {
    private String name;  // The name of the user.
    private String id;  // A unique identifier for the user.

    //Constructor to initialize the user's name and ID
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
    //Retrieves the name of the user.
    public String getName() {
        return name;
    }
    //Retrieves the unique ID of the user.
    public String getId() {
        return id;
    }
    /**
     * Displays the details of the user, including their name and ID.
     */
    public void displayDetails() {
        System.out.println("User: " + name + ", ID: " + id);
    }
}
