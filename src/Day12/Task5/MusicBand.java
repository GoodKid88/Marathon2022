package Day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists;

    public MusicBand(String name, int year, List<MusicArtist> artists) {
        this.name = name;
        this.year = year;
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public static void transferBands(MusicBand bandA, MusicBand bandB) {
        bandA.getArtists().addAll(bandB.getArtists());
        bandB.getArtists().clear();
    }

    public void printMembers() {
        System.out.println(getArtists());
    }
}
