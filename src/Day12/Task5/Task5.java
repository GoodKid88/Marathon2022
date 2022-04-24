package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> mb = new ArrayList<>();
        List<MusicArtist> RedHotChiliPeppers = new ArrayList<>();
        List<MusicArtist> ABBA = new ArrayList<>();

        mb.add(new MusicBand("Red Hot Chili Peppers", 1983, RedHotChiliPeppers));
        mb.add(new MusicBand("ABBA", 1972, ABBA));

        RedHotChiliPeppers.add(new MusicArtist("Энтони Кидис", 50));
        RedHotChiliPeppers.add(new MusicArtist("Майкл «Фли»", 51));
        RedHotChiliPeppers.add(new MusicArtist("Чад Смит", 52));

        ABBA.add(new MusicArtist("Агнета Фельтског", 53));
        ABBA.add(new MusicArtist("Бьорн Ульвеус", 54));
        ABBA.add(new MusicArtist("Бенни Андерссон", 55));


        mb.get(0).printMembers();
        mb.get(1).printMembers();
        MusicBand.transferBands(mb.get(0), mb.get(1));
        mb.get(0).printMembers();
        mb.get(1).printMembers();
    }
}
