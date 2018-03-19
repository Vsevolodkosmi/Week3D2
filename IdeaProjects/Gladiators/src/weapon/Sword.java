package weapon;

public class Sword extends Weapon {

    private Sword() {
        super(3, 6, true);
    }

    private static Sword sword = new Sword();

    public static Sword getSword() {
        return sword;
    }
}

