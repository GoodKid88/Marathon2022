package Day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(1986, "Red", "Harley Davidson");
        System.out.println(bike.getYear() + " " + bike.getColor() + " " + bike.getModel());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
}