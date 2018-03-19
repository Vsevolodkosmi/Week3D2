package weapon;

public class Dagger extends Weapon {

    public Dagger() {
        super(2, 4, false);
    }

    private static Dagger dagger = new Dagger();

    public static Dagger getDagger() {
        return dagger;
    }
}



