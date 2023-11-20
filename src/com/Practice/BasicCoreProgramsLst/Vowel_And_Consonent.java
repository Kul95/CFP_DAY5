package com.Practice.BasicCoreProgramsLst;

import java.util.Scanner;

public class Vowel_And_Consonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        if((ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')||(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'|| ch=='O'|| ch=='U')){
            System.out.println("Alphabet is Vowel : "+ch);
        }else{
            System.out.println("Alphabet is Consonant: "+ch);
        }
    }
}
