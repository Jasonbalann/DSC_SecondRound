import java.util.*;
public class Stack
 { 
  int top = -1, n = 20, arr[] = new int[n]; 
  
  void push(int x) 
   { 
    if (top >= (n - 1))
      System.out.println("Stack Overflow"); 
    else 
     { 
      arr[++top] = x; 
      System.out.println(x + " pushed into stack"); 
     } 
   } 

  int pop() 
   { 
    if (top < 0) 
     { 
      System.out.println("Stack Underflow"); 
      return 0; 
     } 
    else 
     { 
      int x = arr[top--]; 
      return x; 
     } 
   } 

  int peek() 
   { 
    if (top < 0)
     { 
      System.out.println("Stack Underflow"); 
      return 0; 
     } 
    else 
     { 
      int x = arr[top]; 
      return x; 
     } 
   } 
  
  public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     Stack obj = new Stack(); 
     System.out.println("|      Stack Operations:   |");
     System.out.println("|       1 for Pushing      |");
     System.out.println("|       2 for Popping      |");
     System.out.println("|       3 for Peeking      |");
     System.out.println("|      4 for Termination   |");
     for(;;)
      {
       System.out.print("Choice: ");
       switch(sc.nextInt())
        {
         case 1:
          System.out.print("Enter number to be pushed: ");
          obj.push(sc.nextInt());
          break;
         case 2:
          System.out.println(obj.pop() + " has been popped");
          break;
         case 3:
          System.out.println(obj.peek() + " is the topmost element");
          break;
         case 4:
          System.out.print("Program has been terminated");
          System.exit(0);
          break;
         default:
          System.out.println("Enter a valid option!");
          break;
        }
      }
    } 
 