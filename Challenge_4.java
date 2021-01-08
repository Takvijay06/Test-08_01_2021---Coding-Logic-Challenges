package com.vijay.javaplace2020;

import java.util.Scanner;

public class Main {
    public static String SpecialInstruction(String s1){
        s1=s1.trim();// always after triming
        int i,n=s1.length();
        if(s1.charAt(0)=='a' && s1.charAt(n-1)=='d'){
            s1="mango"; // sample test case is s1="and","anand","anant devdud",
        }
        else {
            int flag_for_i_and_f=0;
            for (i = 0; i < n; i++) {
                if(s1.charAt(i)=='o' || s1.charAt(i)=='u'){
                    s1=s1.toUpperCase();
                    break;
                }
                else {
                    if (s1.charAt(i) == 'i') {
                        flag_for_i_and_f++;
                    }
                    if (s1.charAt(i) == 'f') {
                        flag_for_i_and_f++;
                    }
                }
                if(flag_for_i_and_f==2){
                    String st="";
                    st=st+s1.charAt(0);
                    st=st.toUpperCase();
                    st=s1.substring(1,n);
                    s1=st;
                    break;
                }
            }
        }
        return s1;
    }
    public static void main(String[] args) {
        System.out.println("Challenge 4");
        Scanner s =new Scanner(System.in);
        // Input can be "Anand is mad","aaaaaaaaaaaaadddddddddd","aaaaaaaaaad","dana",etc
        // Input can be "our", "oooooooo","uuuuuuuuu","owl is bird", "vijay",etc
        // Input can be "iphone","fan","Cricket",etc
        String st = s.nextLine(); //String that have to passed to function
        st=SpecialInstruction(st);
        System.out.println(st);

    }
}
