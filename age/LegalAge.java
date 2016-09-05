import java.io.Console;

public class LegalAge {
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("How old are you?");
    String stringUserAge = myConsole.readLine();
    Integer integerUserAge = Integer.parseInt(stringUserAge);

    if (integerUserAge >= 21) {
      System.out.println("You can legally drink alcohol!");
    } else {
      System.out.println("You need to wait until you are 21 to legally drink alcohol.");
    }
  }
}
