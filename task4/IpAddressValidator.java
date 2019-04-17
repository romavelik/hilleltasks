package lesson2.task4;

public class IpAddressValidator
{
  public  boolean isValid(String ipAdress){
    boolean isValid = true;
    String[] words = ipAdress.split("\\.");
    for (int i = 0; i < words.length; i++)
    {
      if (words.length > 4 || Integer.valueOf(words[i]) > 255 || Integer.valueOf(words[i]) < 0)
      {
        isValid = false;
        break;
      }
      else
      {
        isValid = true;
      }
    }
    return isValid;
  }

  public static void main(String[] args)
  {
    IpAddressValidator ipAddressValidator = new IpAddressValidator();
    System.out.println(ipAddressValidator.isValid("255.255.0.250"));
  }
}
