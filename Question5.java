import java.util.Scanner;
import java.util.Arrays;
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
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int[] myArray = new int[size];
    for (int i=0; i<size; i++) {
        Scanner input = new Scanner(System.in);
        myArray[i] = input.nextInt();
        }
    int modeCount = 0;
    int mode = 0;
    int currCount = 0;
    
    for(int candidateMode : myArray) {
        currCount = 0;
        for(int element : myArray) {
            if(candidateMode == element) {
                currCount++;
            }
        }
        if(currCount > modeCount) {
            modeCount = currCount;
            mode = (int) candidateMode;
        }
    }
    System.out.print(mode);
   /**for(int i = 0; i <list.size(); i++) 
   {  
      count = 1;  
      for(int j = i+1; j <list.size(); j++) 
      {  
          if(list[i] == list[j] && list[i] != ' ') 
          {  
              count++;  
          }  
        list2.add(count);
      }  
   }
    int pos = 0;
    int maxSoFar = list2[0];
    for (int num : list2)
    {
        if (num > maxSoFar)
        {
            pos = list2.getindexof(num);
        }
    }
    System.out.println(list[pos]);f**/
    
  }
}
