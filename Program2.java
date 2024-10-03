import java.util.*;
public class Duplicate 
 {
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), arr[] = new int[n], arr1[] = new int[n], j = 0;
    boolean check = true;
     
    for (int i = 0; i < n; i++)
     {
      arr[i] = sc.nextInt();
     }
    
    System.out.print("Original: ");  
    for (int i = 0; i < n; i++)
     {
      System.out.print(arr[i] + ", ");
     }
     
    for (int i = 0; i < n - 1; i++) 
     {
	  if (arr[i] != arr[i + 1])
	    arr1[j++] = arr[i];
	 }
	  
	 for (int i = 0; i < j; i++)
	  {
	   arr[i] = arr1[i];
	  }
	 
	 System.out.print("\nAfter Duplicates Removed: ");  
     for (int i = 0; i < n; i++)
      {
       if(arr1[i] == 0)
         break;
       System.out.print(arr1[i] + ", ");
      }
   } 
 }