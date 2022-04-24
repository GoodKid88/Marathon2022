package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        try {
            File file = new File("file2.txt");
            random1000numbers();
            avgOf20numbers();
            printResult(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void random1000numbers() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("file1.txt");
        int size = 1000;
        int rand = 100;
        int number;
        for (int i = 0; i <= size; i++) {
            number = (int) (Math.random() * rand);
            pw.write(number + "\n");
        }
        pw.close();
    }

    public static void avgOf20numbers() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("file2.txt");

        File file = new File("file1.txt");
        Scanner scanner = new Scanner(file);

        double avg;
        double sum = 0;
        int counter = 0;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());

            if (counter == 0) {
                avg = sum / 20;
                pw.write(avg + "\n");
                sum = 0;
                counter = 0;
            }
        }

        pw.close();
        scanner.close();
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while (scanner.hasNextLine()) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            scanner.close();
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
