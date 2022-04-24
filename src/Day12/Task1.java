package Day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("Tesla");
        list.add("Kia");

        System.out.println(list);

        list.add(2, "Opel");
        list.remove(0);

        System.out.println(list);

    }
}
