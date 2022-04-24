package Day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("dushi.txt");
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

        int counter = 0;
        for (String word : list) {
//            if (word.equals("Чичиков")) {
//                counter++;
//            }
            if (!word.isEmpty()) {
                Integer count = map.get(word);
                if (count == null) {
                    count = 0;
                }
                map.put(word, ++count);
            }
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());
        for (String word : map.keySet()) {
            treeMap.put(map.get(word), word);
        }

        treeMap.entrySet().stream().limit(100).forEach(System.out::println);

    }
}
