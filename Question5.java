import java.util.Scanner;
import java.util.HashMap;4

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

    HashMap<Integer, Integer> intCounter = new HashMap<Integer, Integer>();

    System.out.print("Number of integers to enter: ");
    Scanner in = new Scanner(System.in);
    int integerNum = in.nextInt();

    for (int i = 0; i < integerNum; i++) 
    {
      int number = new Scanner(System.in).nextInt();
      if (intCounter.get(number) == null) 
      {
        intCounter.put(number, 1);
      }
      else
      {
        intCounter.put(number, intCounter.get(number)+1);
      }
    }

    int highestOccurenceNum = 0;
    int highestOccurence = 0;
    for (int number : intCounter.keySet())
    {
      if (intCounter.get(number) > highestOccurence)
      {
        highestOccurenceNum = number;
        highestOccurence = intCounter.get(number);
      }
    }

    System.out.println("Highest occurence: " + highestOccurenceNum);
  }
}
