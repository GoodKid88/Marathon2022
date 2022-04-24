package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а и b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (a < b) {
                    if (a % 5 == 0 && a % 10 != 0) {
                        System.out.print(a+ " ");
                }
            a++;
            }
        }
    }
}
