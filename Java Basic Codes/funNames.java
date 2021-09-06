
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Main
{
    static String getFullName(String fName, String lName){
        String fullName=fName + " " + lName;
        return fullName;
    }
    static String getFullName(String fName, String lName, String mName){
        String fullName1=fName + " " + mName + " " + lName;
        return fullName1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName=scan.nextLine();
        System.out.print("Middle Name: ");
        String mName=scan.nextLine();
        System.out.print("Last Name: ");
        String lName=scan.nextLine();
        
        String fullName=getFullName(fName,lName);
        System.out.print("\nWithout Middle Name :" + fullName);
        
        String fullName1=getFullName(fName,lName,mName);
        System.out.print("\n\nWith Middle Name :" + fullName1);
        
        
    }
}
