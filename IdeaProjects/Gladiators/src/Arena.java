import fighters.Gladiator;
import weapon.Weapon;


    public final class Arena {

        private Arena(){
        }

        private static final Arena INSTANCE;

        private Gladiator Warrior;
        private Gladiator Mage;

        private Weapon[] weapons = new Weapon[] {};


        static {
            INSTANCE = new Arena();
        }

        public static Arena getInstance() {
            return INSTANCE;
        }

        public void start() {
            while (Warrior.getHealth()>0 || Mage.getHealth()>0){
                Warrior.bit(Warrior.getStrength(),Warrior.getSpellStrength());
                Mage.bit(Mage.getStrength(),Mage.getSpellStrength());
                Mage.defence(Warrior.bit(Warrior.getStrength(),Warrior.getSpellStrength()));

                Warrior.defence(Mage.bit(Mage.getStrength(),Mage.getSpellStrength()));
            }
        }

    }

