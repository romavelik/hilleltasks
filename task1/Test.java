package lesson2.task1;

public class Test
{
  public static void main(String[] args)
  {
    int to = 10;
    int from = 10;
    printMultiplicationTable(to, from);
  }

  public static void printMultiplicationTable(int to, int from)
  {
    for (int i = from; i < to; i++)
    {
      printTableForNumber(i);
      System.out.println();
    }
  }

  private static void printTableForNumber(int number)
  {
    for (int j = 1; j < 10; j++)
    {
      System.out.printf("%d * %d = %d\n", number, j, number * j);
    }
  }
}
