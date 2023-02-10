public class Cashier {
    public void checkOut(Groceryitem item) {
        System.out.println("You have purchased " + item.name);
    }

    public void showPrice(Groceryitem item) {
        System.out.println( "The pirce of this item is " + item.price);
    }
    
}
