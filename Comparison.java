
// use brackets after if-else statement
package L1;
import java.util.Scanner;
public class Comparison {
    public static void main(String [] args) { // a variable
        // For reading user input
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number");
        int a = input.nextInt (); //declare variable
        System.out.print("Enter the second number");
        int b = input.nextInt ();
        // see what number is larger
        if (a>b) {
            System.out.print("The first number is larger");

        } else if (b>a) {
            System.out.print("The second number is larger");
        } else {
            System.out.print("Both numbers are equal");
        }
        }
    }



