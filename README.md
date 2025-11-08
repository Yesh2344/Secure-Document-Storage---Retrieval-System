# Secure Document Storage & Retrieval System

This project provides a basic system for securely storing and retrieving documents. It focuses on simple encryption and decryption techniques for added security. While not suitable for highly sensitive data without further security hardening, it serves as a good illustration of fundamental concepts.

## Features

*   **Secure Storage:** Documents are stored in an encrypted format.
*   **Document Retrieval:** Documents can be retrieved and decrypted.
*   **AES Encryption:** Uses AES (Advanced Encryption Standard) for encryption and decryption.
*   **Password-Based Key Derivation:** Keys are derived from a user-provided password for encryption and decryption.
*   **Simple CLI Interface:** Command-line interface for interaction.

## Getting Started

1.  **Prerequisites:** Java Development Kit (JDK) version 8 or higher.

2.  **Clone the Repository:**

    ```bash
    git clone <repository_url>
    cd secure-document-storage
    ```

3.  **Build the Project:**

    ```bash
    ./gradlew build
    ```
    (or `gradlew.bat build` on Windows)

4.  **Run the Application:**

    ```bash
    java -jar build/libs/secure-document-storage.jar
    ```

## Usage

The application provides a command-line interface with the following options:

*   **Store Document:** Encrypts and stores a document.
*   **Retrieve Document:** Retrieves and decrypts a document.

Follow the on-screen prompts to specify the document path and password.

## File Structure

*   `src/main/java/`: Contains the Java source code.
    *   `Main.java`: The main entry point of the application.
    *   `DocumentManager.java`: Handles document encryption, storage, and retrieval.
    *   `EncryptionUtil.java`: Provides encryption and decryption utilities.
*   `build.gradle`: Gradle build file.
*   `README.md`: This file.

## Dependencies

*   Bouncy Castle (for AES encryption)

## Security Considerations

*   **Password Strength:** The security of the system relies heavily on the strength of the password used. Use a strong, unique password.
*   **Key Storage:** This implementation derives the encryption key directly from the password.  For enhanced security, consider using a key management system.
*   **Encryption Algorithm:** While AES is a strong algorithm, the specific implementation should be reviewed for vulnerabilities.
*   **No Integrity Protection:** This version does not include integrity checks. Modifications to the encrypted file would not be detected. Adding a MAC (Message Authentication Code) is highly recommended.

## Future Enhancements

*   Implement a proper key management system.
*   Add integrity checks to prevent data tampering.
*   Implement more robust error handling.
*   Add a graphical user interface (GUI).
*   Support different encryption algorithms.
*   Improve password hashing with salt.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.