package Day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void transferBands(MusicBand bandA, MusicBand bandB) {
        bandA.getMembers().addAll(bandB.getMembers());
        bandB.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(getMembers());
    }
}
