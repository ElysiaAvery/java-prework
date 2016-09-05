import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me two numbers, and I will calculate them for you!");
    String stringAddNumber1 = myConsole.readLine();
    String stringAddNumber2 = myConsole.readLine();

    Integer addNumber1 = Integer.parseInt(stringAddNumber1);
    Integer addNumber2 = Integer.parseInt(stringAddNumber2);
    Integer yourAdditionNumber = addNumber1 + addNumber2;

    String stringYourAdditionNumber = Integer.toString(yourAdditionNumber);
    System.out.println("I added your numbers: " + stringYourAdditionNumber);

    String stringSubtractNumber1 = myConsole.readLine();
    String stringSubtractNumber2 = myConsole.readLine();

    Integer subtractNumber1 = Integer.parseInt(stringSubtractNumber1);
    Integer subtractNumber2 = Integer.parseInt(stringSubtractNumber2);
    Integer yourSubtractionNumber = subtractNumber1 - subtractNumber2;

    String stringYourSubtractionNumber = Integer.toString(yourSubtractionNumber);
    System.out.println("I subtracted your numbers: " + stringYourSubtractionNumber);

    String stringDivideNumber1 = myConsole.readLine();
    String stringDivideNumber2 = myConsole.readLine();

    Integer divideNumber1 = Integer.parseInt(stringDivideNumber1);
    Integer divideNumber2 = Integer.parseInt(stringDivideNumber2);
    Integer yourDivisionNumber = divideNumber1 / divideNumber2;

    String stringYourDivisionNumber = Integer.toString(yourDivisionNumber);
    System.out.println("I divided your numbers: " + stringYourDivisionNumber);

    String stringMultiplyNumber1 = myConsole.readLine();
    String stringMultiplyNumber2 = myConsole.readLine();

    Integer multiplyNumber1 = Integer.parseInt(stringMultiplyNumber1);
    Integer multiplyNumber2 = Integer.parseInt(stringMultiplyNumber2);
    Integer yourMultiplicationNumber = multiplyNumber1 * multiplyNumber2;

    String stringYourMultiplicationNumber = Integer.toString(yourMultiplicationNumber);
    System.out.println("I multiplied your numbers: " + stringYourMultiplicationNumber);
  }
}
