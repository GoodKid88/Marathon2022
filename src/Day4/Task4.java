package Day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int randomMax = 10;
        int[] array = new int[arrayLength];
        int index = 0;
        int sumMax = 0;
        int amountOfElements = 3;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * randomMax);
        }
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = 0; j < amountOfElements; j++) {
                sum += array[i + j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                index = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(index);
        System.out.println(sumMax);
    }
}
