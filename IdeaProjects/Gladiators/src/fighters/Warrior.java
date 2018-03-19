package fighters;

public class Warrior extends Gladiator {


    public Warrior(int health, int mana,
                   int crit, int dodge, int block, int strength, int spellStrength) {
        super(health, mana, crit, dodge, block, strength, spellStrength);
    }


    @Override
    public int hill() {
        return getHealth();
    }

}
