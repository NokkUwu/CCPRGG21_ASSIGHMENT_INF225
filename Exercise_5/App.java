public class App {

    public static void main(String[] args) throws Exception {
        Person Me = new Person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Jeiel Jeremy Raguini");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

        //--------------------------------------------------------------------------------

        Me.setccNum(123456);

        int myccNumber = Me.getccNum();

        System.out.println("My credit card number is " + myccNumber);

        //=================================================================================

        Son me = new Son();

        System.out.println("My family name is: " + me.surname);

    }

}

