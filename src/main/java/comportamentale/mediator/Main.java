package comportamentale.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator groupChat = new ChatMediatorImpl();
        User user1 = new UserImpl("Alex", groupChat);
        User user2 = new UserImpl("Maria", groupChat);
        User user3 = new UserImpl("Robert", groupChat);
        User user4 = new UserImpl("Ramona", groupChat);

        groupChat.addUser(user1);
        groupChat.addUser(user2);
        groupChat.addUser(user3);
        groupChat.addUser(user4);

        user1.sendMessage("Salut");
    }
}
