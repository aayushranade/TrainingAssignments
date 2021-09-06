
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double principal,rate,annualPay;
        int time;
        do{
            System.out.print("enter principal amt :");
            principal = scan.nextDouble();
        }
        while(principal<100000 || principal>1000000);
        
        do{
            System.out.print("enter rate of interest :");
            rate = scan.nextDouble();
        }
        while(rate<3 || rate>30);
        rate =(rate/100)/12;
        
        do{
            System.out.print("enter time :");
            time = scan.nextInt();
        }
        while(time<5 || time>30);
        time = time*12;
        
        annualPay = (principal * rate)/(1-Math.pow(1-rate, time))*12;
        System.out.println("payment:" + annualPay);
        
    }
}