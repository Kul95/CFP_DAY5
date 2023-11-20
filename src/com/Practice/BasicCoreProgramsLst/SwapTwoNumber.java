package com.Practice.BasicCoreProgramsLst;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Before swapping: "+num1+ "  and  "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping: "+num1+" and "+num2);
    }
}
