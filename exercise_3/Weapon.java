public class Weapon {
    
    String name;
    int damage;
    String rarity;

    public void sayMyWeapon() {
        System.out.println("You picked up " + name);
    }
    
    public void sayMyWeaponStrengt() {
        System.out.println("My damage is " + damage);
    }
    
    public void sayMyWeaponRarity() {
        System.out.println("My rarity is " + rarity);
    }
    
}
