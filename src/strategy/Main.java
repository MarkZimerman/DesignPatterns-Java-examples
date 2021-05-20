package strategy;

import strategy.task.ChatClient;
import strategy.task.DesEncryptor;

public class Main {
    public static void main(String[] args) {
        var client = new ChatClient();
        client.send("my letter", null);
    }
}
