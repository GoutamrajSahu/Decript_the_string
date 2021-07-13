package com.company;

import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Str = ");
        String str = Sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            char N = str.charAt(i+1);
             int num = Character.getNumericValue(N);
                 for(int j = 0;j < num;j++){
                     System.out.print(ch);
                 }
                 i++;
        }
    }
}
