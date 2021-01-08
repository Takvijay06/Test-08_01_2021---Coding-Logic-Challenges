package com.vijay.javaplace2020;

import java.util.Scanner;

public class Main {
    public static String SpecialInstructionForNumber(String s1){
        s1=s1.trim();// always after triming
        int i,n=s1.length();
        String st="";
        for(i=0;i<n;i++){
            char ch = s1.charAt(i);
            if(i%2==0 && ch=='0'){
                continue;
            }
            else{
                st=st+ch;
            }
        }
        s1=st;
        st="";
        n=s1.length();
        for(i=0;i<n;i++){
            char ch = s1.charAt(i);
            if(i%2!=0 && ch=='2'){
                st=st+"0";
            }
            else{
                st=st+ch;
            }
        }
        s1=st;
        st="";
        n=s1.length();
        for(i=0;i<n-1;i++){
            char ch = s1.charAt(i);
            if(s1.charAt(i)==s1.charAt(i+1)){
                while(i<n-1 && s1.charAt(i)==s1.charAt(i+1)){
                    i++;
                }
                st=st+ch;
            }
            else{
                st=st+ch;
            }

        }
        s1=st;
        st="";
        n=s1.length();
        int count=0;
        for(i=0;i<n;i++){
            if(count==3){
                st=st+",";
                count=0;
            }
            st=st+s1.charAt(i);
            count++;
        }
        s1=st;
        return s1;
    }
    public static void main(String[] args) {
        System.out.println("Challenge 2");
        Scanner s =new Scanner(System.in);
        String st = s.nextLine(); //String that have to passed to function
        st=SpecialInstructionForNumber(st);
        System.out.println(st);

    }
}
