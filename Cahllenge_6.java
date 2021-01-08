package com.vijay.javaplace2020;

import java.util.Scanner;

public class Main {
    public static void HTMLparser(String s1){
        int i,n=s1.length();
        for(i=0;i<n;i++){
            if(s1.charAt(i)=='>'){
                System.out.print(s1.charAt(i));
                System.out.println();
                System.out.print("  ");
            }
            else{
                System.out.print(s1.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Challenge 6");
        Scanner s =new Scanner(System.in);
        String st = s.nextLine(); //String that have to passed to function
        HTMLparser(st);
    }
}
