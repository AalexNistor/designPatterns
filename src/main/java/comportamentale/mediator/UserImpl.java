package comportamentale.mediator;

public class UserImpl extends User{
    public UserImpl(String name, ChatMediator chat) {
        super(name, chat);
    }

    @Override
    public void sendMessage(String message) {
//        System.out.println(this.name + " sending message: " + message);
        System.out.println("You to everyone: " + message);
        chat.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.print("[" + this.name +"] ");
    }
}
