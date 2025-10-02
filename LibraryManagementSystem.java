package lib;
import java.util.Scanner;

/**
 * The LibraryManagementSystem class serves as the entry point for the library management application.
 * It provides a menu-driven interface for managing library items and users.
 */

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager(100); // Manages library items.
        UserManager userManager = new UserManager(50);           // Manages library users.
        // Main program loop for navigating the menu system.
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Manage Items");
            System.out.println("2. Manage Users");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:  // Item Management Menu
                    while (true) {
                        System.out.println("\nItem Management Menu:");
                        System.out.println("1. Add a Book");
                        System.out.println("2. Add a Magazine");
                        System.out.println("3. Add a DVD");
                        System.out.println("4. Display All Items");
                        System.out.println("5. Search for an Item");
                        System.out.println("6. Delete an Item");
                        System.out.println("7. Display Only Books");
                        System.out.println("8. Display Only Magazines");
                        System.out.println("9. Display Only DVDs");
                        System.out.println("10. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int itemChoice = scanner.nextInt();
                        scanner.nextLine();  // Consume newline.

                        if (itemChoice == 10) break;

                        switch (itemChoice) {
                            case 1: // Add a Book
                                System.out.print("Enter book title: ");
                                String bookTitle = scanner.nextLine();
                                System.out.print("Enter book ID: ");
                                String bookId = scanner.nextLine();
                                System.out.print("Enter book author: ");
                                String author = scanner.nextLine();
                                libraryManager.addItem(new Book(bookTitle, bookId, author));
                                // This line creates a new Book object with the specified title, ID, and author,
                                // and then adds it to the library's inventory using the addItem method of the LibraryManager class.
                                break;
                            case 2: // Add a Magazine
                                System.out.print("Enter magazine title: ");
                                String magTitle = scanner.nextLine();
                                System.out.print("Enter magazine ID: ");
                                String magId = scanner.nextLine();
                                System.out.print("Enter magazine issue: ");
                                String issue = scanner.nextLine();
                                libraryManager.addItem(new Magazine(magTitle, magId, issue));
                                break;
                            case 3:  // Add a DVD
                                System.out.print("Enter DVD title: ");
                                String dvdTitle = scanner.nextLine();
                                System.out.print("Enter DVD ID: ");
                                String dvdId = scanner.nextLine();
                                System.out.print("Enter DVD duration: ");
                                String duration = scanner.nextLine();
                                libraryManager.addItem(new DVD(dvdTitle, dvdId, duration));
                                break;
                            case 4: // Display All Items
                                libraryManager.displayItems();
                                break;
                            case 5: // Search for an Item
                                System.out.print("Enter item ID to search: ");
                                String searchId = scanner.nextLine();
                                libraryManager.searchItem(searchId);
                                break;
                            case 6: // Delete an Item
                                System.out.print("Enter item ID to delete: ");
                                String deleteId = scanner.nextLine();
                                libraryManager.deleteItem(deleteId);
                                break;
                            case 7: // Display Only Books
                                libraryManager.displayBooks();
                                break;
                            case 8: // Display Only Magazines
                                libraryManager.displayMagazines();
                                break;
                            case 9: // Display Only DVDs
                                libraryManager.displayDVDs();
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
                    break;
                case 2: // User Management Menu
                    while (true) {
                        System.out.println("\nUser Management Menu:");
                        System.out.println("1. Add a User");
                        System.out.println("2. Display All Users");
                        System.out.println("3. Delete a User"); // New option for deleting a user
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        int userChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (userChoice == 4) break; // Exit to Main Menu

                        switch (userChoice) {
                            case 1: // Add a User
                                System.out.print("Enter user name: ");
                                String userName = scanner.nextLine();
                                System.out.print("Enter user ID: ");
                                String userId = scanner.nextLine();
                                userManager.addUser(new User(userName, userId));
                                break;
                            case 2: // Display All Users
                                userManager.displayUsers();
                                break;
                            case 3: // Delete a User
                                System.out.print("Enter user ID to delete: ");
                                String deleteUserId = scanner.nextLine();
                                userManager.deleteUser(deleteUserId); // Call deleteUser method
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
                    break;

                case 3: // Exit the program.
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}