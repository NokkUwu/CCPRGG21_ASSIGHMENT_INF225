public class App {
    public static void main(String[] args) throws Exception {
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Shifu";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.attack();


        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.attack();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Tigris";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.attack();

        Weapon sword = new Weapon();

        sword.name = "Lightsaber";
        sword.damage = 1000000;
        sword.rarity = "Ultimate";
        sword.sayMyWeapon();
        sword.sayMyWeaponStrengt();
        sword.sayMyWeaponRarity();

        Character jedi = new Character();

        jedi.strength = 100;
        jedi.agility = 80;
        jedi.intelligence = 100;
        jedi.name = "Anakin";
        jedi.sayMyName();
        jedi.sayMyStrength();
        jedi.attack();

    }
}
