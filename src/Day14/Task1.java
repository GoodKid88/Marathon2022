package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Day14");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int sum = 0;
            int counter = 0;

            for (String number : numbersString) {
                numbers[counter] = Integer.parseInt(number);
                sum += numbers[counter];
                counter++;
            }
            if (numbersString.length != 10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input file is incorrect");
        }
    }
}
