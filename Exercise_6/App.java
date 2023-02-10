public class App {
    public static void main(String[] args) throws Exception {
        Groceryitem item1 = new Groceryitem();
        item1.name = "Tissue";
        item1.price = 31;
        item1.showItemName();


        Groceryitem item2 = new Toothbrush();
        item2.name = "Cologate";
        item2.price = 30;
        item2.showItemName();
        

        Groceryitem item3 = new Toothpaste();        
        item3.name = "Pepsodent";
        item3.price = 50;
        item3.showItemName();
        

        Cashier c1 = new Cashier();
        c1.checkOut(item2);
        c1.showPrice(item2);

        c1.checkOut(item3);
        c1.showPrice(item3);


        Groceryitem[] itemArray = new Groceryitem[2];
        itemArray[0] = item2;
        itemArray[1] = item2;

        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
        }

        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk(); 
        myLion.run();
    }
}
