package comportamentale.mediator;

public abstract class User {
    protected String name;
    protected ChatMediator chat;

    public User(String name, ChatMediator chat) {
        this.name = name;
        this.chat = chat;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);

}
