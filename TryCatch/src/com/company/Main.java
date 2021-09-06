package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter num1");
        n1=sc.nextInt();
        System.out.println("please enter num2");
        n2=sc.nextInt();
        try {
            n3 = n1 / n2;
            System.out.println(n3);
            System.out.println("end of try block");
        }
        catch (ArithmeticException e) {
            System.out.println("should not divide a number by zero");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("everything looks good");
    }
}
