
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String email[]= new String[3];
        System.out.print("Enter e-mail ID: ");
        
        for(int i=0;i<email.length;i++)
        {
            email[i]= scan.nextLine();
        }
        System.out.println("\nChecking validation..");
        for(int j=0;j<email.length;j++)
        {
            if (email[j].endsWith("@gmail.com"))
            {
                System.out.println("Valid email");
            
            }
            else
            {
                System.out.println("Invalid email");
            }
        }
    }
}