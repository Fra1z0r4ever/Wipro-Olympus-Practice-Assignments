import java.util.*;

public class Main {

    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
   String text = s.nextLine();
		    System.out.println("Original string: "+text);
			  try {
		      // String text = s.nextLine();
        //write your answer here
          checkVowels(text);
          // System.out.println("Original string: "+text);
          System.out.println("String contains vowels");

        }catch(NoVowelsException e){
          System.out.println(e.getMessage());
        }
    }
    
      public static void checkVowels(String text) throws NoVowelsException
      {
        text = text.toLowerCase();
        if (!(text.contains("a") || text.contains("e") || text.contains("i") || text.contains("o") || text.contains("u"))) {
            throw new NoVowelsException("String does not contain any vowels");
        }

      }
}
class NoVowelsException extends Exception
{
  public NoVowelsException(String message){
    super(message);
  }
}
