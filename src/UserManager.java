package lib;
/**
 * The UserManager class is responsible for managing a collection of users in the library system.
 * It provides methods to add new users and display all registered users.
 */
class UserManager {
    private User[] users; // Array to store registered users.
    private int userCount;  // Tracks the number of registered users.

    /**
     * Constructor to initialize the UserManager with a specified capacity.
     *
     * capacity The maximum number of users that can be registered.
     */
    public UserManager(int capacity) {
        users = new User[capacity];
        userCount = 0;
    }

    /**
     * Adds a new user to the user list if there is available space.
     *
     *  user The user to be added.
     */
    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user; // Add the user and increment the count
            System.out.println("User added successfully!");
        } else {
            System.out.println("User list is full. Cannot add more users.");
        }
    }
    /**
     * Displays details of all registered users.
     * If no users are registered, a message is displayed.
     */
    public void displayUsers() {
        if (userCount == 0) {
            System.out.println("No users registered.");
        } else {
            for (int i = 0; i < userCount; i++) {
                users[i].displayDetails(); // Call the displayDetails method of each user.
            }
        }
    }
    /**
     * Deletes a user from the user list based on their unique ID.
     *
     * @param id The unique ID of the user to delete.
     */
    public void deleteUser(String id) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId().equals(id)) {
                // Shift users to fill the gap left by the deleted user.
                for (int j = i; j < userCount - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[--userCount] = null; // Reduce user count and clear the last slot.
                System.out.println("User deleted successfully!");
                return;
            }
        }
        System.out.println("User not found.");
    }

}
