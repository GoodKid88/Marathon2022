package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Введите делимое ");
            double a = sc.nextDouble();
            System.out.printf("Введите делитель ");
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.println("Деление на ноль!");
                i--;
                continue;
            }
            System.out.println(a/b);
        }
    }
}
