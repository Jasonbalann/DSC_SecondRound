import java.util.*;
public class Cartons 
 {
  public static void main(String [] Args)
   {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    System.out.print(n/48 + " Xl");
    if((n %= 48) != 0)
     {
      System.out.print(", " + n/24 + " Large");
      if((n %= 24) != 0)
       {
        System.out.print(", " + n/12 + " Medium");
        if((n %= 12) != 0)
         {
          System.out.print(", " + n/6 + " Small");
          if((n %= 6) != 0)
           System.out.print("\nBottles Left = " + n);
         }
       }
     }
   }
 }