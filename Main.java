import java.util.Scanner;
/**
 * This program tell if all digits of a number are odd
 * @author Thomas Quigley
 */
public class Main {
  // tells if all the digits are odd in a number
  public static void oddDigits(int userNumber) {
    // a loop that repeats as long as there is a digit to look at 
    while (userNumber > 0) {
      // create the variable that tells if the number is odd or even
      int oddEven = userNumber % 2;

      // if a digit is even then tell the user and end the program, if not do nothing
      if (oddEven == 0) {
        System.out.println("Your number has an even digit!");
        return;
      }

      // divide by 10 and go onto the next digit
      userNumber = userNumber / 10;
    }
    // all digits are odd so tell user and end
    System.out.println("Your number has only odd digits in it!");
    return ;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask for the users number
    System.out.println("What number would you like to tell if all it's digits are odd?");
    int userNumber = input.nextInt();
    
    // start the oddDigit method
    oddDigits(userNumber);
    
  }
}
