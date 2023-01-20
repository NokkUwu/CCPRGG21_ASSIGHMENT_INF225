public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }

    public void attack() {
        System.out.println("I'm attacking");
    }

    public void defend() {
        System.out.println("I'm difending");
    }
    
}
