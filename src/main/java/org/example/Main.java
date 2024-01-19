package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        User newUser = new User("velo","velo123");
        System.out.println(newUser);
        System.out.println("\n");
        Health userHealth = new Health();
        userHealth.miniShield();
        userHealth.miniShield();
        System.out.println(userHealth);


        String [] data = {"Hello","Im","awesome"};
        System.out.println(existence(data,"Hellox"));

    }

    public static String existence(String[] array,String word){
        if(array.length==0){
            return "No data in array";
        }

        for(String item : array){
            if(Objects.equals(item, word)){
                return "Word Exists!";
            }
        }
        return "word not found!";
    }
}