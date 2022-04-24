package Day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int playersStamina = 90 + random.nextInt(Player.MAX_STAMINA - 90 + 1);

        Player player1 = new Player(playersStamina);
        Player player2 = new Player(playersStamina);
        Player player3 = new Player(playersStamina);
        Player player4 = new Player(playersStamina);
        Player player5 = new Player(playersStamina);
        Player player6 = new Player(playersStamina);
        Player player7 = new Player(playersStamina);
        Player player8 = new Player(playersStamina);

        System.out.println(player1.stamina);
        int a = player2.getStamina();
        for (int i = 0; i <= a; i++) {
            player2.run();
        }
        System.out.println(player2.stamina);
        Player.info();
    }
}
