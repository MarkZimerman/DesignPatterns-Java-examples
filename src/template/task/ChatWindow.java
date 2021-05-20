package template.task;

public class ChatWindow extends Window {
    @Override
    protected void onClosed() {
        System.out.println("Disconnect");
    }
}
