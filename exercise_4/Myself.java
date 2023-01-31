public class Myself {
    String name;
    int age; 

    Myself (String myselfName, int myselfAge) {
        this.name = myselfName;
        this.age = myselfAge; 
    }

    void addFriend (Person girlfriend) {
        System.out.println("I am the boyfriend of " + girlfriend.name);
    }
}
