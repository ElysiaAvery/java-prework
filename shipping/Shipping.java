import java.io.Console;

public class Shipping {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What is your package's shipping weight ?");
    String yourPackageWeight = myConsole.readLine();
    System.out.println("What is your package's shipping distance ?");
    String yourPackageDistance = myConsole.readLine();
    Integer yourNewPackageWeight = Integer.parseInt(yourPackageWeight);
    Integer yourNewPackageDistance = Integer.parseInt(yourPackageDistance);
    Integer priceModifier = 2;
    Integer shippingTotal = (yourNewPackageWeight / 10) + (yourNewPackageDistance / 5) * priceModifier;
    String yourTotal = Integer.toString(shippingTotal);
    System.out.println("Your total shipping cost is: $" + yourTotal);
  }
}
