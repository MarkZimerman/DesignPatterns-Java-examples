package strategy.task;

public class DesEncryptor implements Encryptor {
    @Override
    public Object encrypt(Object message) {
        System.out.println("Encrypting message using DES");
        return "Encrypted with DES message: " + message;
    }
}
