package fighters;

import weapon.Weapon;

public abstract class Gladiator {
    int health;
    int mana;
    int crit;
    int dodge;
    int block;
    int strength;
    int spellStrength;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpellStrength() {
        return spellStrength;
    }

    public void setSpellStrength(int spellStrength) {
        this.spellStrength = spellStrength;
    }

    public Gladiator(int health, int mana, int crit, int dodge, int block, int strength, int spellStrength) {
        this.health = health;
        this.mana = mana;
        this.crit = crit;
        this.dodge = dodge;
        this.block = block;
        this.strength = strength;
        this.spellStrength = spellStrength;
    }

    private Weapon weapon;

    public abstract int bit(int strength,int spellStrength);

    public abstract int hill(int health);

    public abstract int defence(int damage);

    public abstract int dodge(int damage);

    public abstract boolean isAlive();

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}

