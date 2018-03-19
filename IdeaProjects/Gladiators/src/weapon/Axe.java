package weapon;


public class Axe extends Weapon {


    public Axe() {
        super(4, 4, true);
    }

    private static Axe axe = new Axe();

    public static Axe getAxe() {
        return axe;
    }
}


