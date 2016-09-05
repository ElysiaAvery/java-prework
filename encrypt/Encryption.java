import java.io.Console;

public class Encryption {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a sentence so that I can encrypt it!");
    String yourSentence = myConsole.readLine();
    String myEncryptedResults = yourSentence.replaceAll("[aeiou]","-" );
    System.out.println(myEncryptedResults);
  }
}
