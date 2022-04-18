import java.util.Scanner;

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
    List<Integer> list = new ArrayList<Integer>(); 
    List<Integer> list2 = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    for(int i = 0; i < x; i++)
    {
      Scanner scan = new Scanner(System.in);
      int y = scan.nextInt();
      list.add(y);
    }
   for(int i = 0; i <list.size(); i++) 
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
    System.out.println(list[pos]);
    
  }
}
