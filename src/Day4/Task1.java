package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int numbersOver8 = 0;
        int numberEquals1 = 0;
        int odd = 0;
        int even = 0;
        int sum = 0;

        System.out.println("Введите число элементов массива ");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] > 8)
                numbersOver8++;
            if (array[i] == 1)
                numberEquals1++;
            if (array[i] % 2 != 0)
                odd++;
            if (array[i] % 2 == 0)
                even++;
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива " + array.length);
        System.out.println("Количество чисел больше 8 " + numbersOver8);
        System.out.println("Количествог чисел равных 1 " + numberEquals1);
        System.out.println("Количество четных чисел " + even);
        System.out.println("Количество нечетных чисел " + odd);
        System.out.println("Сумма всех элементов массива " + sum);
    }
}