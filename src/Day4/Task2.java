package Day4;

public class Task2 {
    public static void main(String[] args) {
        int arraysLength = 100;
        int[] array = new int[arraysLength];
        int maxRandom = 10000;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * maxRandom);
        }
        int max = array[0];
        int min = array[0];
        int numberEndBy0 = 0;
        int sumOfNumbersEndsBy0 = 0;
        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 10 == 0) {
                numberEndBy0 = i;
                sumOfNumbersEndsBy0 += numberEndBy0;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(numberEndBy0);
        System.out.println(sumOfNumbersEndsBy0);
    }
}
