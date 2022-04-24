package Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> mb = new ArrayList<>();
        List<String> RedHotChiliPeppers = new ArrayList<>();
        List<String> ABBA = new ArrayList<>();

        RedHotChiliPeppers.add("Энтони Кидис");
        RedHotChiliPeppers.add("Майкл «Фли»");
        RedHotChiliPeppers.add("Чад Смит");
        ABBA.add("Агнета Фельтског");
        ABBA.add("Бьорн Ульвеус");
        ABBA.add("Бенни Андерссон");
        mb.add(new MusicBand("Red Hot Chili Peppers", 1983, RedHotChiliPeppers));
        mb.add(new MusicBand("ABBA", 1972, ABBA));



        mb.get(0).printMembers();
        mb.get(1).printMembers();
        MusicBand.transferBands(mb.get(0), mb.get(1));
        mb.get(0).printMembers();
        mb.get(1).printMembers();

    }
}
