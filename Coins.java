public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(1234);
  }

  public static void coinConverter(int pennies)
  {
    System.out.println("Dollar bills: " + pennies/100);
    pennies %= 100;
    System.out.println("Quarters: " + pennies/25); //  34/25 = 1
    pennies %= pennies % 25;                       //  34 - 25 = remainder 9
    System.out.println("Dime: " + pennies/10);  // 0 dime
    pennies %= pennies % 10;                     // remainder 9
    System.out.println("Nickels: " + pennies/5); // 1 nickel
    pennies %= pennies % 5;                      // remainder 4
    System.out.println("Pennies: " + pennies); 
  }
}
