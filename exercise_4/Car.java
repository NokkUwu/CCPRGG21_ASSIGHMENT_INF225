public class Car {
    String name;
    Myself owner;

    Car (String carName, Myself ownerName) {
        this.name = carName;
        this.owner = ownerName;
    }

    void showCarOwnerName (Myself owner) {
        System.out.println("My car is " + this.name + " my owner name is " + owner.name);
    }

}
