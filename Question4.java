import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    String string1 = "*";
    Scanner input = new Scanner (System.in);
    int rows = input.nextInt();
    for (int x = rows; x > 0; x--)
    {
      for(int i = rows-1;i > 0; i--)
        {
          System.out.print(string1.trim());
        }
      System.out.println(string1.trim());
      rows--;
    }
    
  }
}
