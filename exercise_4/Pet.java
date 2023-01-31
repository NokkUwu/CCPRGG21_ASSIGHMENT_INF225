public class Pet {
    String name; 
    Person owner; 

    Pet (String petName, Person ownerName) {
        this.name = petName;
        this.owner = ownerName; 
    }

    void showOwnerName () {
        System.out.println("My name is " + this.name + " my owner name is " + owner.name);
    }
}
