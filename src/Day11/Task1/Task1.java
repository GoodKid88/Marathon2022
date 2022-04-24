package Day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Picker picker1 = new Picker(warehouse);
        Picker picker2 = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        Courier courier2 = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(picker1);
        businessProcess(picker2);
        businessProcess(courier);
        businessProcess(courier2);
        System.out.println(picker.toString());
        System.out.println(picker1.toString());
        System.out.println(picker2.toString());
        System.out.println(courier.toString());
        System.out.println(courier2.toString());

        System.out.println(warehouse.toString());
    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
