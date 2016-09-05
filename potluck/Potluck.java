public class Potluck {
  public static void main(String[] args){
    String[] userName = {"Wally", "Julianna", "Lillie"};
    for(String name:userName) {
    Integer firstLetter = name.compareTo("Z");
    if (firstLetter <= -10 && firstLetter >= 0) {
      System.out.println("should bring fajitas!");
    } else if (firstLetter <= -19 && firstLetter >= -11) {
      System.out.println("should bring fruit salad!");
    } else if (firstLetter <= -26 && firstLetter >= -20) {
      System.out.println("should bring gumbo!");
    }
    }
  }
}
