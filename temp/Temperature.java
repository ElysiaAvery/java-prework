import java.io.Console;

public class Temperature {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What is the current temperature?");
    String userInput = myConsole.readLine();
    Integer userTemp = Integer.parseInt(userInput);
    if (userTemp >= 80 && userTemp <= 100) {
      System.out.println("Wear shorts and a tanktop!");
    } else if (userTemp >= 60 && userTemp <= 79) {
      System.out.println("Wear a t-shirt and shorts, maybe pants.");
    } else if (userTemp >= 40 && userTemp <= 59) {
      System.out.println("Wear pants and a sweater.");
    } else {
      System.out.println("You should wear a jacket and mittens.");
    }
  }
}
