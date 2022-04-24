package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Day14");

        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");
            double sum = 0;
            double avg;
            for (String string : stringNumbers) {
                sum += Integer.parseInt(string);
            }
            avg = sum / stringNumbers.length;
            System.out.println(avg + "-->" + new DecimalFormat("#0.000").format(avg));


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
