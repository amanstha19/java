package OOP;
// Create main class
public class methodaccess {

    public void fullthrottle(){
        System.out.println("THe car is going as fast as it can ");

    }
// Create a speed() method and add a parameter 
 public void speed(int maxSpeed)
 {
    System.out.println("Max speed is" + maxSpeed);
 }
 public static void main(String[]args){
    methodaccess mycar = new methodaccess();
    mycar.fullthrottle();
    mycar.speed(200);
 }
    

}
