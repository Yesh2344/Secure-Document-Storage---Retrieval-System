import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentManager documentManager = new DocumentManager();

        while (true) {
            System.out.println("\nSecure Document Storage & Retrieval System");
            System.out.println("1. Store Document");
            System.out.println("2. Retrieve Document");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the path to the document: ");
                    String filePathToStore = scanner.nextLine();
                    System.out.print("Enter the password for encryption: ");
                    String passwordToStore = scanner.nextLine();

                    try {
                        documentManager.storeDocument(filePathToStore, passwordToStore);
                        System.out.println("Document stored successfully.");
                    } catch (IOException e) {
                        System.err.println("Error storing document: " + e.getMessage());
                    } catch (Exception e) {
                        System.err.println("Encryption error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter the path to the encrypted document: ");
                    String filePathToRetrieve = scanner.nextLine();
                    System.out.print("Enter the password for decryption: ");
                    String passwordToRetrieve = scanner.nextLine();

                    try {
                        documentManager.retrieveDocument(filePathToRetrieve, passwordToRetrieve);
                        System.out.println("Document retrieved successfully.");
                    } catch (IOException e) {
                        System.err.println("Error retrieving document: " + e.getMessage());
                    } catch (Exception e) {
                        System.err.println("Decryption error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}