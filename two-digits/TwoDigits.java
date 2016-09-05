import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a number and I will tell you if it is a two digit number!");
    String stringNumber = myConsole.readLine();
    Integer integerNumber = Integer.parseInt(stringNumber);
    if (integerNumber >= 10 || integerNumber <= 99) {
      System.out.println("Your number has two digits!");
    } else {
      System.out.println("Your number is not a two digit number.");
    }
  }
}
