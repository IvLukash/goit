package module6;

public class BFG {
    private int ammo;
    private int damage;
    private String name;

    public int getAmmo() {
        return ammo;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }

    public BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int ammo, int damage) {
        this(ammo, damage, "BFG");
    }

    public BFG(int ammo) {
        this(ammo, 50, "BFG");
    }

    public BFG() {
        this(1000, 50, "BFG");
    }

    @Override
    public String toString() {
        return name + ", ammo: " + ammo + ", damage: " + damage;
    }
}
