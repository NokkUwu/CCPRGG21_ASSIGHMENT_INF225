public class Toothbrush extends Groceryitem {
   
    public  void showItemName() {
        System.out.println(this.name + " is a Toothbrush");
    }  
    public  void showPrice(Groceryitem item) {
        System.out.println("Price " + this.price);
    }
}
