package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2002);
        car.setColor("Black");
        car.setModel("BMW");

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYear());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}