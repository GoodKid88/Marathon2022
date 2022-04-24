package Day19.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Integer, Point> map = new HashMap<>();
        while (scanner.hasNextLine()){
            int[] car = new int[3];
            for (int i = 0; i < car.length; i++){
                car[i] = Integer.parseInt(scanner.next());
            }
            map.put(car[0], new Point(car[1], car[2]));
        }

        System.out.println("Введите координаты квадрата(x1, y1, x2, y2): ");
        scanner.close();
        Scanner scanner1 = new Scanner(System.in);
        int[] coordinates = new int[4];
        for (int i = 0; i < coordinates.length; i++){
            coordinates[i] = scanner1.nextInt();
        }
        int counter = 0;
        for (Map.Entry<Integer, Point> entry : map.entrySet()){
            if(entry.getValue().getX() > coordinates[0] && entry.getValue().getX() < coordinates[2] && entry.getValue().getY() > coordinates[1] && entry.getValue().getY() < coordinates[3]){
                System.out.print(entry.getKey()+ " ");
                counter++;
            }
        }
        System.out.println("Всего машин в квадрате: " + counter);
        scanner1.close();
    }
}
