// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
    public static void main(String[] args) {
      //creating intiials out of initials
      System.out.println("       AAAA          MMMMM        MMMMM");
      System.out.println("      AAAAAA         MMMMMM      MMMMMM");
      System.out.println("     AAA  AAA        MMM MMM    MMM MMM");
      System.out.println("    AAA    AAA       MMM  MMM  MMM  MMM");
      System.out.println("   AAAAAAAAAAAA      MMM   MMMMMM   MMM");
      System.out.println("  AAA        AAA     MMM            MMM");
      System.out.println(" AAA          AAA    MMM            MMM");
      System.out.println("AAA            AAA   MMM            MMM");
      System.out.println("---------------------------------------");

      //taking 5 character input and reversing it without first and last character
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a 5-character string");

      String UserInput = input.nextLine();
      char result1 = UserInput.charAt(1);//input at index 1
      char result2 = UserInput.charAt(2);//input at index 2
      char result3 = UserInput.charAt(3);//input at index 3

      //Farenheit to celsius converter
      Scanner input1 = new Scanner(System.in);
      System.out.println("Enter a number in Fahrenheit");

      Double Fahrenheit = input1.nextDouble();
      Double Celsius = (Fahrenheit - 32) / 1.8;

      //Random number generator
      Random generator = new Random();
      Integer num = generator.nextInt(16384) + 32;
      System.out.println("Random number generated. Continuing...");

      //Print combination of last steps
      System.out.println("Your new string is " + Celsius + result3 + result2 + result1 + num);

      input.close();
      input1.close();
    }
}
