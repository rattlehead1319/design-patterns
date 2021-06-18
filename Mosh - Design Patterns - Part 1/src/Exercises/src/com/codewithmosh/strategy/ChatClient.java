package Exercises.src.com.codewithmosh.strategy;

public class ChatClient {
    private Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send() {
        encryptionAlgorithm.encrypt();
        System.out.println("Sending the encrypted message...");
    }
}
