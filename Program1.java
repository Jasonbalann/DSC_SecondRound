import java.util.*;
public class Sentence_Sort
 {
  public static void main(String [] Args)
   {
    Scanner sc = new Scanner (System.in);
    int i = 0, j = 0;
    String temp, str;
    str = sc.nextLine();
    String arr[] = str.split(" ");
    System.out.print("Original Sentence: ");
    int n = arr.length;
    for(i = 0; i < n; i++)
     {
      System.out.print(arr[i] + " ");
     }
    temp = arr[0];
    for(i = 0; i < n; i++)
     {
      for(j = 0; j < n - 1; j++)
       {
        if(arr[j].length() > arr[j + 1].length())
         {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
         }
       }
     }
    System.out.print("\nSorted Sentence: ");
    for(i = 0; i < n; i++)
     {
      System.out.print(arr[i] + " ");
     }
   }
 }