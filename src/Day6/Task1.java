package Day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2004);
        car.setColor("Black");
        car.setModel("BMW");

        Motorbike bike = new Motorbike(1986, "Red", "Harley Davidson");

        car.info();
        bike.info();

        System.out.println(car.yearDifference(2022));
        System.out.println(bike.yearDifference(2022));
    }
}
