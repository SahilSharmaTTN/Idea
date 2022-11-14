package com.sahil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

//        System.out.println("Hello world!");
//
//
//
////        Map<String,Integer> map = new HashMap<>();
////
////
////        map.put("one",1);
////        map.put("two",2);
////
////        map.forEach((k,v) -> System.out.println(k +" " +v));
//
//        int num = 45;
//         int temp = num;
//
//        String str = num * num + "";
//
//        int count_digits = 0;
//
//        while (num != 0)
//        {
//            count_digits++;
//            num /= 10;
//        }
//
//        System.out.println(str);
//
//        int l = Integer.parseInt(str.substring(0,count_digits/2+1));
//        int r = Integer.parseInt(str.substring(count_digits/2+1));
//
//        System.out.println(l + "   " +r);
//
//
//        if(l+r == temp){
//            System.out.println(true);
//        }
//        else System.out.println(false);
//
//
//        System.out.println("----------------------");
//        final String string = "Take";
//        String sahil = string + "";
//
//        System.out.println(string == sahil);
//
//        sahil = sahil.intern();
//        System.out.println(string == sahil);
//
//
//
//        String string1 = "Take";
//        String sahil1 = new String("Take");
//
//        System.out.println(string1 == sahil1);
//
//        sahil1 = sahil1.intern();
//        System.out.println(string1 == sahil1);
//
//        Map<Integer,Integer> map = new HashMap<>();

            // Driver code
            public static void main(String args[])
            {
                Scanner scan = new Scanner(System.in);

                String s;
                String answer="";

                System.out.print("Enter the string : ");
                s = scan.next();

                System.out.print("\nAll possible strings are : ");
                permute(s, answer);
            }


    static void permute(String s , String answer)
    {
        if (s.length() == 0)
        {
            System.out.print(answer + " ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }




}