package Day11.Task2;

public class Warrior extends Hero {

    public Warrior() {
        this.physDef = 0.8;
        this.physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
