 package fighters;

public class Warrior {


    Gladiator Warrior = new Gladiator(150,0,34,20,
            10,30,0) {

        @Override
        public int bit(int strength, int spellStrength) {
            return Warrior.getHealth();
        }

        @Override
        public int hill(int health) {
            return health;
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
        public boolean isAlive() {
            return health > 0;
        }

    };

}
