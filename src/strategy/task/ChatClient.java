package strategy.task;

public class ChatClient {
    public void send(String message, Encryptor encryptionAlgorithm) {
        try {
            String coded = (String) encryptionAlgorithm.encrypt(message);
            System.out.println("Sending the encrypted message..." + coded);
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }

    }
}
