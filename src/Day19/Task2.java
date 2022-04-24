package Day19;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers19.txt");
        Scanner sc = new Scanner(file);
        HashSet set = new HashSet<>();
        while(sc.hasNext()){
            set.add(Integer.parseInt(sc.nextLine()));
        }
        int counter = 0;
        for(int i = 500000000; i<=600000000; i++){
            if(set.contains(i)){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
