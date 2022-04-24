package Day11.Task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private int healHimSelf;
    private int healTeammate;
    public int magicAtt;

    public Shaman() {
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.physAtt = 10;
        this.healHimSelf = 50;
        this.healTeammate = 30;
        this.magicAtt = 15;
    }

    @Override
    public void healHimSelf() {
        if (this.health <= HEALTH_MAX) {
            this.health += healHimSelf;
            if (this.health >= HEALTH_MAX) {
                this.health = HEALTH_MAX;
            }
        }
        System.out.println("Герой не нуждается в лечении");
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
    public void magicAttack(Hero hero) {
        if (hero.health > HEALTH_MIN) {
            hero.health -= magicAtt - magicAtt * hero.magicDef;
            if(hero.health <= HEALTH_MIN){
                hero.health = HEALTH_MIN;
            }
        } else {
            System.out.println("Герой погиб");
        }
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + this.health +
                '}';
    }
}
