package L1;
import java.util.Scanner;
public class Addition {
    public static void main(String [] args) { // a variable
        // For reading user input
        Scanner input = new Scanner (System.in);

        int a = input.nextInt (); //declare variable
        a = 45;
        System.out.print("Enter the second number");
        int b = input.nextInt ();

        int c = a+b;
        System.out.printf ("%d is the sum of a and b", c);
        System.out.printf(" \n%d + %d = %d", a, b, c);
        System.out.printf("/ %s", c, "is the sum of both numbers");
    }
}
