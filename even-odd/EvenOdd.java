import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a number!");
    String stringNumber = myConsole.readLine();
    Integer userNumber = Integer.parseInt(stringNumber);
    for (Integer eOrO = 1; eOrO < userNumber; eOrO++) {
      if (eOrO % 2 == 0){
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  }
}
