package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите делимое: ");
            double a = sc.nextDouble();
            System.out.println("Введите делитель: ");
            double b = sc.nextDouble();
            if(b == 0)
                break;
            System.out.println(a/b);
        }
    }
}
