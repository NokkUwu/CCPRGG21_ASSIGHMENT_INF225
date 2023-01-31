public class App {
    public static void main(String[] args) throws Exception {
        
        Person girlfriend = new Person("christine", 20); 

        Myself me = new Myself("ben", 18);

        me.addFriend(girlfriend);

        Pet cat = new Pet ("Puss", girlfriend); 

        cat.showOwnerName();

        Car car = new Car ("GTR", me);

        car.showCarOwnerName(me);
    }
}
