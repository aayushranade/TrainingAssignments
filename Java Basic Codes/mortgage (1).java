
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Mortgage
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter principal amt :");
        double principal = scan.nextDouble();
        System.out.print("enter rate of interest :");
        double rate = scan.nextDouble();
        rate =(rate/100)/12;
        System.out.print("enter time :");
        int time = scan.nextInt();
        time = time*12;
        double annualPay = (principal * rate)/(1-Math.pow(1-rate, time))*12;
        System.out.println("payment:" + annualPay);
        
    }
}