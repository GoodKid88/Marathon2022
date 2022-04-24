package Day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.subscribe(user2);
        user1.isSubscribed(user2);
        user1.isSubscribed(user3);

        user2.subscribe(user1);
        user2.isSubscribed(user1);
        user2.isFriend(user1);

        user1.sendMessage(user2, "Hello!");
        user1.sendMessage(user2, "How ya' doing?");
        user2.sendMessage(user1, "Hey");
        user2.sendMessage(user1, "ok");
        user2.sendMessage(user1, "u?");

        user3.sendMessage(user1, "Hi");
        user3.sendMessage(user1, "Where a u?");
        user3.sendMessage(user1, "Haloooo??");

        user1.sendMessage(user3, "what's up");
        user1.sendMessage(user3, "at home");
        user1.sendMessage(user3, "what's happened?");

        user3.sendMessage(user1, "nothing");


        System.out.println();
        MessageDataBase.showDialog(user1, user2);

        System.out.println();
        MessageDataBase.showDialog(user1, user3);
    }
}
