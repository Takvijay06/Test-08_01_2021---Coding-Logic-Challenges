package com.vijay.javaplace2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void occurence(String s1){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int i,n=s1.length();
        for(i=0;i<n;i++){
            int charAscii = (int) s1.charAt(i);
            if((charAscii>=48 && charAscii<=57) || (charAscii>=65 && charAscii<=90) || (charAscii>=97 && charAscii<=122)) {
                if (!hashMap.containsKey(s1.charAt(i))) {
                    hashMap.put(s1.charAt(i), 1);
                } else {
                    int c = hashMap.get(s1.charAt(i));
                    hashMap.put(s1.charAt(i), c + 1);
                }
            }
        }
        for(Map.Entry<Character,Integer> val: hashMap.entrySet()){
            char character=val.getKey();
            int frequency=val.getValue();
            //Character corresponding with their frequency is printed
            System.out.println(character+"-"+frequency);
        }
    }
    public static void main(String[] args) {
        System.out.println("Challenge 3");
        Scanner s =new Scanner(System.in);
        String st = s.nextLine(); //String that have to passed to function
        occurence(st);

    }
}
