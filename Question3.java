import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    Int num1 = in.nextInt();
    Int num2 = num1 * num1;
    System.out.println(num2);
    
    
  }
}
