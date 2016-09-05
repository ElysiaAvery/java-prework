import java.io.Console;

public class Shipping {
  public static void main(String[] args) {
    shippingCost("weight");
    shippingCost("travel distance");
  }
  public static void shippingCost(String shipping) {
    Console myConsole = System.console();
    System.out.println("What is your package's  " + shipping + " ?");
    String yourPackageWeight = myConsole.readLine();
    String yourPackageDistance = myConsole.readLine();
    Integer yourNewPackageWeight = Integer.parseInt(yourPackageWeight);
    Integer yourNewPackageDistance = Integer.parseInt(yourPackageDistance);
    Integer priceModifier = 2;
    Integer shippingTotal = (yourNewPackageWeight / 10) + (yourNewPackageDistance / 5) * priceModifier;
    String yourTotal = Integer.toString(shippingTotal);
    System.out.println("Your total shipping cost is: $" + yourTotal);
  }
}
