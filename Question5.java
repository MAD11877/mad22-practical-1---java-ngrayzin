import java.util.Scanner;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int x = 0;x < num; x++)
      {
        int num2 = in.nextInt();
        if (list.containsKey(num2))
        {
          list.put(num2, list.get(num2)+1);
        }
        else
        {
          list.put(num2,1);
        }
      }
    int number = 0;
    int numberoftimes = 0;
    for (int x : list.keySet())
    {
      if (list.get(x) > number)
      {
        number = x;
        numberoftimes = list.get(x);
      }
    }

    System.out.println(numberoftimes);
  }
}
