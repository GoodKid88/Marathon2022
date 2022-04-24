package Day7;

public class Player {
    int stamina;
    static final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers <= 6) {
            countPlayers = 6;
        } else {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (getStamina() > MIN_STAMINA) {
            System.out.println("Игрок бежит");
            this.stamina--;
        } else {
            System.out.println("Игрок устал");
            countPlayers--;
        }
    }

    public static void info() {
        int a = 6 - countPlayers;
        String s = null;
        if (a == 1) {
            s = " свободное место";
        } else if (a == 2 && a == 3 && a == 4) {
            s = " свободных места";
        } else if (a == 5 && a == 6) {
            s = " свободных мест";
        }
        if (countPlayers < 6) {
            System.out.printf("Команды непоные, на поле есть еще " + a + s);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
