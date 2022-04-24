package Day11.Task2;

public class Paladin extends Hero implements Healer {

    private int healHimSelf;
    private int healTeammate;

    public Paladin() {
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;
        this.healHimSelf = 25;
        this.healTeammate = 10;
    }

    @Override
    public void healHimSelf() {
        if (this.health <= HEALTH_MAX) {
            this.health += healHimSelf;
            if (this.health >= HEALTH_MAX) {
                this.health = HEALTH_MAX;
            }
        } else {
            System.out.println("Герой не нуждается в лечении");
        }
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health <= HEALTH_MAX) {
            hero.health += healTeammate;

            if (hero.health >= HEALTH_MAX) {
                hero.health = HEALTH_MAX;
            }
        } else {
            System.out.println("Герой не нуждается в лечении");
        }
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + this.health +
                '}';
    }
}
