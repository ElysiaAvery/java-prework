import java.io.Console;

public class Grade {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What grade did you get in your last class?");
    String userGrade = myConsole.readLine();
    boolean a = userGrade == "A";
    boolean b = userGrade == "B";
    boolean c = userGrade == "C";
    boolean d = userGrade == "D";
    boolean f = userGrade == "F";
    if (a || b) {
      System.out.println("Keep up the good work!");
    } else if (c) {
      System.out.println("Consider studying more for your next class!");
    } else if (d || f) {
      System.out.println("Join a study group, and ask a teacher for help!");
    }
  }
}
