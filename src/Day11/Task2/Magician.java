package Day11.Task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    @Override
    public void magicAttack(Hero hero) {
        if (hero.health > HEALTH_MIN) {
            hero.health -= magicAtt - magicAtt * hero.magicDef;
            if (hero.health <= HEALTH_MIN) {
                hero.health = HEALTH_MIN;
            }
        } else {
            System.out.println("Герой погиб");
        }
        System.out.println(hero);
    }



    @Override
    public String toString() {
        return "Magician{" +
                "health=" + this.health +
                '}';
    }
}
