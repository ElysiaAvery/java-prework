import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class Shelter {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Animal cat = new Animal("Lucy", 10, "Calico", "Cat", "Turtle", 50, "Not Adopted");
    Animal dog = new Animal("Felix", 7, "Shar Pei", "Dog", "Apricot", 100, "Not Adopted");
    Animal iguana = new Animal("Gomez", 10, "Cuban Rock Iguana", "Lizard", "Dark Green", 75, "Not Adopted");
    Animal bird = new Animal("Morticia", 1, "Canary", "Bird", "Yellow", 50, "Not Adopted");

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(cat);
    allAnimals.add(dog);
    allAnimals.add(iguana);
    allAnimals.add(bird);

    boolean programRunning = true;

    while(programRunning){
      System.out.println("Welcome to Elysia's Animal Shelter! Enter one of the following options: All Animals, Search by Age, Search by Adoption, Add Animal, or Exit");

      String navigationChoice = myConsole.readLine();

    if(navigationChoice.equals("All Animals")){
      for(Animal individualAnimal : allAnimals) {
        System.out.println("------------");
        System.out.println(individualAnimal.mName);
        System.out.println(individualAnimal.mAge);
        System.out.println(individualAnimal.mBreed);
        System.out.println(individualAnimal.mAnimalType);
        System.out.println(individualAnimal.mColor);
        System.out.println(individualAnimal.mPrice);
        System.out.println(individualAnimal.mAdopted);
      }
    } else if(navigationChoice.equals("Search by Age")){
    System.out.println("What is your max age?");
    String stringUserMaxAge = myConsole.readLine();
    int userMaxAge = Integer.parseInt(stringUserMaxAge);
    System.out.println("Here is what is available for you:");
    for(Animal individualAnimal : allAnimals) {
      if(individualAnimal.worthAge(userMaxAge)){
          System.out.println("------------");
          System.out.println(individualAnimal.mName);
          System.out.println(individualAnimal.mAge);
          System.out.println(individualAnimal.mBreed);
          System.out.println(individualAnimal.mAnimalType);
          System.out.println(individualAnimal.mColor);
          System.out.println(individualAnimal.mPrice);
          System.out.println(individualAnimal.mAdopted);
      }
    }
    }else if(navigationChoice.equals("Search by Adoption")){
     System.out.println("Who would you like to adopt?");
        String animalName = myConsole.readLine();
        Animal adoptee = null;
        for(Animal userPick : allAnimals){
          if(animalName.equals(userPick.mName)){
            if(userPick.mAdopted){
              System.out.println("We're sorry! They were adopted!");
            } else {
              adoptee = userPick;
              userPick.gotAdopted();
            }
          }
        }
        if(adoptee != null){
          System.out.println("You are adopting: ");
          System.out.println("Name: " + adoptee.mName);
        } else {
          System.out.println("Can not find specified animal.");
        }
    }else if(navigationChoice.equals("Add Animal")) {
      System.out.println("Let's help you put an animal up for adoption! What is the animal's name?");
      String userInputName = myConsole.readLine();
      System.out.println("What is your animal's age?");
      int userInputAge = Integer.parseInt(myConsole.readLine());
      System.out.println("What is your animal's breed?");
      String userInputBreed = myConsole.readLine();
      System.out.println("What type of animal are you puttin up for adoption?");
      String userInputAnimalType = myConsole.readLine();
      System.out.println("What color is your animal?");
      String userInputColor = myConsole.readLine();
      System.out.println("How much do you think the adoption fee should be?");
      int userInputPrice = Integer.parseInt(myConsole.readLine());
      Animal userAnimal = new Animal(userInputName, userInputAge, userInputBreed, userInputAnimalType, userInputColor, userInputPrice);
      System.out.println("Here is the animal that you have put up for adoption.");
      System.out.println( "----------------------" );
      System.out.println(userInputName.mName);
      System.out.println(userInputAge.mAge);
      System.out.println(userInputBreed.mBreed);
      System.out.println(userInputAnimalType.mAnimalType);
      System.out.println(userInputColor.mColor);
      System.out.println(userInputPrice.mPrice);
  } else if (navigationChoice.equals("Exit")){
      programRunning = false;
  } else {
      System.out.println("I'm sorry, we don't recognize your input");
    }
  }
  }
}
