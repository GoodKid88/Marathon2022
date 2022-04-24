package Day7;

class Airplan<airplan1> {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplan(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + " , год выпуска: " + year + " , длина: " + length + " , вес" + weight + " , количество топлива в баке: " + fuel);
    }

    public int fuelUp(int n) {
        return fuel += n;
    }

    public static void compareAirplanes(Airplan airplan1, Airplan airplan2) {
        if (airplan1.length > airplan2.length) {
            System.out.println(airplan1.producer + " длинее");
        } else if (airplan1.length < airplan2.length) {
            System.out.println(airplan2.producer + " длинее");
        } else {
            System.out.println("Самолеты равной длины");
        }
    }
}