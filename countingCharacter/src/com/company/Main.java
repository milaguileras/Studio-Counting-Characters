package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please type a sentence");
        String myString = input.nextLine().toLowerCase(Locale.ROOT).replaceAll("([^a-zA-Z]|\\\\s)+", "");

        int count = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < myString.length()-1; i++){
            //if (myString.charAt(i) != ' ')
                //count ++;
            if (hashMap.containsKey(myString.charAt(i))) {
                count = hashMap.get(myString.charAt(i));
                hashMap.put(myString.charAt(i), ++count);
            } else{
                hashMap.put(myString.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> character: hashMap.entrySet()){
            System.out.println(character.getKey() + ":" + character.getValue());
        }
    }



}


//dict.forEach((key, value) -> System.out.println("  "+key + " : " + value));