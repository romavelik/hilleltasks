package lesson2.task2;

public class PalindromeVerifier
{
  public boolean verify(String word)
  {
    boolean result = true;
    int j = word.toCharArray().length-1;
    int i = 0;
    while(j>=word.toCharArray().length/2 && i<=word.toCharArray().length/2 && result){
      if (word.toCharArray()[i] != word.toCharArray()[j])
      {
        result = false;
      }
      else
      {
        result = true;
        j--;
        i++;
      }
    }
    System.out.println(result);
    return result;
  }

  public static void main(String[] args)
  {
    PalindromeVerifier verifier = new PalindromeVerifier();

    boolean result = verifier.verify("abba");
  }
}


