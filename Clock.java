public class Clock
{
  public static void main(String[] args)
  {
    timeOfDay(12); //implementing the procedure here
  }

  public static void timeOfDay (int time) //this is a procedure
  {
    if (time == 0){
      System.out.println("midnight");
    }
    else if (time == 12){
      System.out.println("noon");
    }
    else if (time == 18){
      System.out.println("dusk");
    }
    else if (time > 0 & time < 12){
      System.out.println("morning");
    }
    else if (time > 12 & time < 18){
      System.out.println("afternoon");
    }
    else if (time > 18 & time < 24){
      System.out.println("evening");
    }
  }

}
