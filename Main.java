import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
   Scanner input = new Scanner (System.in);
    
    // how many chromebook chargers 
    System.out.println("How many chromebook chargers?");
    
    //ammount of chargers 
      int A = input.nextInt();

    // ammount of motherboards 
    System.out.println("How many motherboards?");

    //ammount of motherboards 
    int B = input.nextInt();
    
    //amount mice
    System.out.println("How many mice?");
    
    //number of mice
    int C = input.nextInt();
  
  double total= (A* 34.99 + B * 127.50 + C * 18.00);
  System.out.println(" Subtotal= " + "$" + total );
  
  double tax = ( total * 0.13);
  
  System.out.println("Taxes=" + "$" + tax );

    double total1 = (tax+ total);
  
  System.out.println("Total=" + "$"+ total1);
  }
}
