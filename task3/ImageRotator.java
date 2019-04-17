package lesson2.task3;

public class ImageRotator
{
  public static int[][] rotate(int[][] img)
  {
    int[][] turned= new int[img.length][img.length];
    for (int i=0; i<img.length; i++){
      for (int j = 0; j<img.length;j++){
        turned[img.length-1-i][j]=img[j][i];
      }
    }
    return turned;
  }

  public static void main(String[] args)
  {
    int[][] img = new int[][]{{3, 6, 9},{2, 5, 8}, {1, 4, 7}};
    System.out.println("Original");
    for(int i = 0; i<img.length; i++){
      for (int j = 0; j<img.length;j++){
        System.out.print(img[i][j]);
      }
      System.out.println();
    }
    System.out.println("\nTurned");
    for(int i = 0; i<rotate(img).length; i++){
      for (int j = 0; j<rotate(img).length;j++){
        System.out.print(rotate(img)[i][j]);
      }
      System.out.println();
    }
  }
}
