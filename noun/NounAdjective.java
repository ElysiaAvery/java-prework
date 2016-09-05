import java.io.Console;

public class NounAdjective {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a noun:");
    System.out.println("Enter an adjective:");

    String noun = myConsole.readLine();
    String adjective = myConsole.readLine();
    System.out.println("The" + noun + "was very" + adjective + ".");
  }
}
