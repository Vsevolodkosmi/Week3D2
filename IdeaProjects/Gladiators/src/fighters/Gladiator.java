package fighters;

import weapon.Weapon;

public abstract class Gladiator {
    private int health;
    private int mana;
    private int crit;
    private int dodge;
    private int block;
    private int strength;
    private int spellStrength;

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

    public Gladiator(int health, int mana,
                     int crit,
                     int dodge, int block, int strength, int spellStrength) {
        this.health = health;
        this.mana = mana;
        this.crit = crit;
        this.dodge = dodge;
        this.block = block;
        this.strength = strength;
        this.spellStrength = spellStrength;
    }

    public int bit() {
        int x = spellStrength + strength;
        return x;
    }


    public abstract int hill();

    public int defence(int bit) {
        int x = health - bit;
        return x;
    }

    public int dodge(int bit) {
        int x = health - bit + dodge;
        return x;
    }

    public String isAlive() {
        if (health > 0)
            return "Gladiator is alive";
        return "Gladiator is dead";
    }

    public void changeWeapon(Weapon weapon) {
    }

}

