package Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplan airplan = new Airplan("Boeing", 2005, 2400, 10000);
        airplan.setYear(2020);
        airplan.setLength(3200);
        airplan.fuelUp(500);
        airplan.fuelUp(200);
        airplan.info();
    }
}

class Airplan {
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
}