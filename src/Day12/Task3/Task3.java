package Day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Red Hot Chili Peppers", 1983));
         bands.add(new MusicBand("ABBA", 1972));
         bands.add(new MusicBand("Кино", 1981));
         bands.add(new MusicBand("Nirvana", 1987));
         bands.add(new MusicBand("Boney M", 1975));
         bands.add(new MusicBand("Led Zeppelin", 1968));
         bands.add(new MusicBand("БИ-2", 1988));
         bands.add(new MusicBand("Queen", 1973));
         bands.add(new MusicBand("The Rolling Stones", 1962));
         bands.add(new MusicBand("The Beatles", 1960));

        System.out.println(bands);
        groupsAfter1980(bands);
        System.out.println(groupsAfter1980(bands));

    }

    public static List<MusicBand> groupsAfter1980(List<MusicBand> bands){
        List<MusicBand> after1980 = new ArrayList<>();
        for (MusicBand musicBand : bands){
            if(musicBand.getYear() >= 1980){
                after1980.add(musicBand);
            }
        }
        return after1980;
    }
}
