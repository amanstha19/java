package OOP;
// static ra public method hunxa hamro 
// stati

/*    

public class staticpublic  {
    
    // Static method
    static void mymethod()
    {
        System.out.println("HEllo WOrld");
    }
     public static void main(String[] args) {
        mymethod();
     }

}*/

// static vs public 


public class staticpublic{
    // static method 
    static void mystaticmethod()
    {
        System.out.println("Static method can be called without creating an object");

    }

    // Public method 
    public void mypublicmethod()
    {
        System.out.println("Public method must be called by creating an object ");

    }
     
    // Main method 
     public static void main(String[] args) {
        mystaticmethod();

        staticpublic object1 = new staticpublic();
        object1.mypublicmethod();

     }
}
