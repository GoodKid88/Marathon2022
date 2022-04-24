package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File outputFile = new File("missing_shoes.txt");
        File inputFile = new File("shoes.csv");
        try {
            PrintWriter pw = new PrintWriter(outputFile);
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[2]) == 0) {
                    //pw.write(shoes[0] + ", " + shoes[1] + ", " + shoes[2] + " \n");
                    pw.write(String.format(String.format("%1$s, %2$s, %3$s" + "\n", shoes[0], shoes[1], shoes[2])));
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect input or output file");
        }
    }
}
