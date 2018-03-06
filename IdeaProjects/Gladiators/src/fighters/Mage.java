package fighters;

import weapon.Weapon;

public class Mage {

        Gladiator Noaagodxx = new Gladiator(150,0,34,20,
                10,30,0) {

            @Override
            public int bit(int strength, int spellStrength) {
                return Noaagodxx.getHealth();
            }

            @Override
            public int hill(int health) {
                return health + 5;
            }

            @Override
            public int defence(int damage) {
                return  health + block - damage;
            }

            @Override
            public int dodge(int damage) {
                    return health - damage + damage;
            }

            @Override
            public void changeWeapon(Weapon weapon) {
                super.changeWeapon(weapon);
            }

            @Override
            public boolean isAlive() {
                return health > 0;
            }

        };

    }

