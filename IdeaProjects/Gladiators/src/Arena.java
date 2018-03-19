import fighters.Gladiator;
import fighters.Mage;
import fighters.Warrior;
import weapon.Axe;
import weapon.Dagger;
import weapon.Sword;
import weapon.Weapon;


public final class Arena {

        private Arena(){
        }

        private static final Arena INSTANCE;

        static {
            INSTANCE = new Arena();
        }

        public static Arena getInstance() {
            return INSTANCE;
        }
            public Weapon getWarriorWeapon() {
            Weapon[] warriorWeapons = {Sword.getSword(),new Axe()};
                int warriorWeapon = (int) (Math.random() * (warriorWeapons.length-1));
                return warriorWeapons[warriorWeapon];
        }


    public Weapon getMageWeapon() {
        Weapon[] mageWeapons = {Dagger.getDagger()};
        int mageWeapon = (int) (Math.random() * (mageWeapons.length-1));
        return mageWeapons[mageWeapon];
        }

        public void fight(Gladiator mage, Gladiator warrior){

            while (mage.isAlive() && warrior.isAlive()){
                int mageDamage = mage.bit();
            System.out.println("Mage sents frost Bold");
                warrior.defence(mageDamage);
                int warriorDamage = warrior.bit();
            System.out.println("Warrior makes blade storm");
                mage.defence(warriorDamage);
            }

            if (mage.isAlive()){
                System.out.println("Mage won!!!");
            }
            else if (warrior.isAlive()){
                System.out.println("Warrior won!!!");
            }
            else {
                System.out.println("Draw!!");
            }
        }

        public void start() {
            //create 2 Gladiator
            Gladiator mage = new Mage(100,25,2,1,
                    5,2,15);
            Gladiator warrior = new Warrior(150,0,10,5,
                    2,20,0);
            System.out.println("Welcome the new fighters on Arena!!!");
            INSTANCE.fight(mage,warrior);

        }

    }

