import java.util.Scanner;
import java.util.ArrayList;
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

    Scanner in = new Scanner(System.in);
    Integer quantity = in.nextInt();
    ArrayList<Integer> array = new ArrayList<Integer>();
    ArrayList<Integer> frequency = new ArrayList<Integer>();
    
    for (int i = 0; i < quantity; i++)
    {
      Integer next = in.nextInt();
      array.add(next);
    }
    
    for (int j = 0; j < quantity; j++)
    {
      Integer comparison = array.get(j);
      Integer count = 0;
      for (int x : array)
      {
        if (comparison == x)
        {
          count += 1;
        }
      }
      frequency.add(count);
    }

    Integer index = 0;
    for (int y = 0; y < quantity; y++)
    {
      if (y == 0)
      {
        index = frequency.get(y);
        continue;
      }
      if (frequency.get(y) > index)
      {
        index = frequency.get(y);
      }
    }

    System.out.println(array.get(index));
  }
}
