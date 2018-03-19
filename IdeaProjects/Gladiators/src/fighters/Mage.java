package fighters;

import weapon.Weapon;

public class Mage extends Gladiator {


    @Override
    public int hill() {
        int x = getHealth() + 1;
        return x;
    }

    @Override
    public void changeWeapon(Weapon weapon) {
        super.changeWeapon(weapon);
    }

    public Mage(int health, int mana, int crit,
                int dodge, int block, int strength, int spellStrength) {
        super(health, mana, crit, dodge, block, strength, spellStrength);
    }
}



