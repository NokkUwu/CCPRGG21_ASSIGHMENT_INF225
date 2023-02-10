public class Person {

    // Private variable
    // Private variables are only accessible within the class where they are
    // declared. They are not accessible outside of this class.
    private String name;

    private int ccnum;

    // get() method

    public String getName(){
    return this.name;
    }
    // set() method
    public void setName(String newName){
    this.name = newName;
    }
//----------------------------------------------------------------
    // get() method
    public int getccNum(){
    return this.ccnum;
    }
    // set() method

    public void setccNum(int newccNum){
    this.ccnum = newccNum;
    }

}

