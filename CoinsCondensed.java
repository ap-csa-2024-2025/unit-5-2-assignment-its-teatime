public class CoinsCondensed {
  public static void main(String[] args)
  {
    coinConverter(1234);
  }

  public static void coinConverter(int pennies)
  {
    int pennies2 = coinCalculation("Dollar bills", 100, pennies);
    pennies2 = coinCalculation("Quarters", 25, pennies2);
    pennies2 = coinCalculation("Dimes", 10, pennies2);
    pennies2 = coinCalculation("Nickels", 5, pennies2);
    pennies2 = coinCalculation("Pennies", 1, pennies2);
  }

  public static int coinCalculation(String moneyType, int pennyValue, int pennies)
  {
      System.out.println(moneyType + ": " + pennies/pennyValue);
      pennies %= pennyValue;
      return (pennies);
  }
    
}
