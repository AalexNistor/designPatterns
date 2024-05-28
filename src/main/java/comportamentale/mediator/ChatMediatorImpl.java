package comportamentale.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<User> users = new ArrayList<>();
    @Override
    public void sendMessage(String message, User user) {
        for (User u : users){
            if (!u.equals(user)){
                u.receiveMessage(message);
                System.out.println(user.name + " to everyone : " + message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
