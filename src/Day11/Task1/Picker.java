package Day11.Task1;

public class Picker implements Worker {
    private final int BONUS = 70000;
    private final int PICKED_ORDERS = 10000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private final int ONE_ORDER_SALARY = 80;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += ONE_ORDER_SALARY;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountPickedOrders() >= PICKED_ORDERS) {
                this.salary += BONUS;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже выплачен");
        }
    }
}
