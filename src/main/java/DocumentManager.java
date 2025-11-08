# Minor edit
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DocumentManager {

    public void storeDocument(String filePath, String password) throws Exception, IOException {
        byte[] fileContent = Files.readAllBytes(Paths.get(filePath));
        byte[] encryptedContent = EncryptionUtil.encrypt(fileContent, password);

        // Store the encrypted content back to the same file (overwriting)
        // For a real system, store it with a new filename or location
        Files.write(Paths.get(filePath), encryptedContent);

    }

    public void retrieveDocument(String filePath, String password) throws Exception, IOException {
        byte[] encryptedContent = Files.readAllBytes(Paths.get(filePath));
        byte[] decryptedContent = EncryptionUtil.decrypt(encryptedContent, password);

        // Write the decrypted content back to the same file (overwriting)
        // Again, for a real system, store it with a new filename or location

        Files.write(Paths.get(filePath), decryptedContent);
    }
}