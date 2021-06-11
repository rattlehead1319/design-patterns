package Exercises.src.com.codewithmosh.strategy;

public class StrategyImpl {
    public static void main(String[] args) {
        ChatClient cc = new ChatClient(new AESEncryption());
        cc.send();
    }
}
