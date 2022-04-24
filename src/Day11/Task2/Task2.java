package Day11.Task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physAttack(paladin);
        paladin.physAttack(magician);
        shaman.healTeammate(magician);
        magician.magicAttack(paladin);
        shaman.physAttack(warrior);
        paladin.healHimSelf();
        System.out.println();

        warrior.physAttack(magician);
        warrior.physAttack(magician);
        warrior.physAttack(magician);
        warrior.physAttack(magician);
        warrior.physAttack(magician);


    }
}
