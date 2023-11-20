package com.Practice.BasicCoreProgramsLst;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int powerOfTwo=1;
        int i=0;
        while( i<=num){
            System.out.println(i+" "+powerOfTwo);
            powerOfTwo=2*powerOfTwo;
            i=i+1;
        }
    }
}
