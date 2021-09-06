import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("write a sentence with Email and phoneno: ");
      String sent = sc.nextLine();
      Pattern pattern = Pattern.compile("[0-9]{10}");
      Matcher matcher = pattern.matcher(sent);
      Pattern pattern2 = Pattern.compile("[a-z0-9.]+@[a-z0-9.]*");
      Matcher matcher2 = pattern2.matcher(sent);
      String[] strnum = new String[5];
      String[] strmail = new String[5];
      /*for(int i=0,i<5,i++)
      {
          Strnum[i]=matcher.group();
      }
      for(int j=0,j<5,j++)
      {
          Strmail[j]=matcher2.group();
      }*/
        if(matcher.find() && matcher2.find())
        {
            System.out.println("\n" + "Phone number: " + matcher.group() + " " + "Email is: "+ matcher2.group());
        }
        else
        {
            System.out.println("No email or phone number entered");
        }
   }
}
//my number is 9604860169 and mail id is aayush.ranade@gmail.com