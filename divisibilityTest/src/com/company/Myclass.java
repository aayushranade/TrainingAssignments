package com.company;

import java.util.Scanner;

class Myclass {
    int num;
    int sum=0;

    public void input() //to accept an integer from user
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer:");
        num = sc.nextInt();
    } //end of input method

    public void divisors() //finds and prints divisors
    {
        for(int i=1; i<num; i++)
        {
            if(num%i==0)                    //6 6/1 6/2... 6/5
            {
                sum=sum+i;                  //1,2,3
                System.out.println(i);
            }
        }
        System.out.println("addition of divisors:" + sum);
    } //end of divisor method

    public void decision() //to decide if sum is 'super' or 'normal' number
    {
        if(sum%2==0)
        {
            System.out.println("Sum is even thus, super number");
        }
        else {
            System.out.println("Sum is odd thus, normal number");
        }
    } //end of decision method
} //end of Myclass