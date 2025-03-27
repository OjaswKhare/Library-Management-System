import java.util.ArrayList;
import java.util.Scanner;


public class LibrarySystem {
    
    static class Book {
        private String id;
        private String title;
        private String author;
        private String genre;
        private boolean available;

        public Book(String id, String title, String author, String genre, boolean available) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
        }

        // Getters and setters
        public String getId() { return id; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getGenre() { return genre; }
        public boolean isAvailable() { return available; }

        public void setTitle(String title) { this.title = title; }
        public void setAuthor(String author) { this.author = author; }
        public void setGenre(String genre) { this.genre = genre; }
        public void setAvailable(boolean available) { this.available = available; }

        @Override
        public String toString() {
            return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + 
                   "\nGenre: " + genre + "\nAvailable: " + (available ? "Yes" : "No") + "\n";
        }
    }

    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nDigital Library Book Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete a Book Record");
            System.out.println("6. Exit System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: addBook(); break;
                case 2: viewAllBooks(); break;
                case 3: searchBook(); break;
                case 4: updateBook(); break;
                case 5: deleteBook(); break;
                case 6: 
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    //Method Implementations
    private static void addBook() {
        System.out.println("\nAdd a New Book");
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                System.out.println("A book with this ID already exists.");
                return;
            }
        }
        
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Is the book available? (yes/no): ");
        boolean available = scanner.nextLine().equalsIgnoreCase("yes");

        Book newBook = new Book(id, title, author, genre, available);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    private static void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("\nNo books in the library.");
            return;
        }

        System.out.println("\nAll Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // All other methods (searchBook, updateBook, deleteBook) 
    private static void searchBook() {
        System.out.println("\nSearch Book");
        System.out.println("1. Search by ID");
        System.out.println("2. Search by Title");
        System.out.print("Enter your choice: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine();

        if (searchChoice == 1) {
            System.out.print("Enter Book ID: ");
            String id = scanner.nextLine();
            boolean found = false;
            
            for (Book book : books) {
                if (book.getId().equalsIgnoreCase(id)) {
                    System.out.println("\nBook Found:");
                    System.out.println(book);
                    found = true;
                    break;
                }
            }
            
            if (!found) System.out.println("No book found with ID: " + id);
        } else if (searchChoice == 2) {
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            boolean found = false;
            
            System.out.println("\nSearch Results:");
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(book);
                    found = true;
                }
            }
            
            if (!found) System.out.println("No books found with title: " + title);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void updateBook() {
        System.out.println("\nUpdate Book Details");
        System.out.print("Enter Book ID to update: ");
        String id = scanner.nextLine();
        
        boolean found = false;
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                found = true;
                System.out.println("Current Book Details:");
                System.out.println(book);
                
                System.out.println("\nEnter new details (leave blank to keep current value):");
                
                System.out.print("New Title (" + book.getTitle() + "): ");
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) book.setTitle(newTitle);
                
                System.out.print("New Author (" + book.getAuthor() + "): ");
                String newAuthor = scanner.nextLine();
                if (!newAuthor.isEmpty()) book.setAuthor(newAuthor);
                
                System.out.print("New Genre (" + book.getGenre() + "): ");
                String newGenre = scanner.nextLine();
                if (!newGenre.isEmpty()) book.setGenre(newGenre);
                
                System.out.print("Change Availability? (yes/no): ");
                String changeAvail = scanner.nextLine();
                if (changeAvail.equalsIgnoreCase("yes")) {
                    System.out.print("Is the book available now? (yes/no): ");
                    boolean newAvail = scanner.nextLine().equalsIgnoreCase("yes");
                    book.setAvailable(newAvail);
                }
                
                System.out.println("Book details updated successfully!");
                break;
            }
        }
        
        if (!found) System.out.println("No book found with ID: " + id);
    }

    private static void deleteBook() {
        System.out.println("\nDelete a Book");
        System.out.print("Enter Book ID to delete: ");
        String id = scanner.nextLine();
        
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equalsIgnoreCase(id)) {
                books.remove(i);
                removed = true;
                System.out.println("Book deleted successfully!");
                break;
            }
        }
        
        if (!removed) System.out.println("No book found with ID: " + id);
    }
}