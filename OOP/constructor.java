package OOP;

// constructor pani method nai ho k ho tara 
//special method ho object lai initialized garna use hunxa 

// create class main 
public class constructor {
    int x;

    public constructor()
    {
        x = 10000;

    }

    public static void main(String[] args) {
        constructor object  =new constructor();
        System.out.println(object.x);
        

    }
}