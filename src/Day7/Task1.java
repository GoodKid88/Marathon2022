package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplan airplan1 = new Airplan<>("Boeing", 2010, 2500, 10000);
        Airplan airplan2 = new Airplan<>("Tu-154", 1980, 2000, 1000);

        Airplan.compareAirplanes(airplan1, airplan2);
    }
}
