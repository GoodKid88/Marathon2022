package Day11.Task2;

public abstract class Hero implements PhysAttack {
    int health;
    final static int HEALTH_MIN = 0;
    final static int HEALTH_MAX = 100;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physAttack(Hero hero) {
        if (hero.health > HEALTH_MIN) {
            hero.health -= physAtt - physAtt * hero.physDef;
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
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
