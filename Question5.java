import java.util.Scanner;
import java.util.HashMap;
class Main {
  public static void main(String[] args) {
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
