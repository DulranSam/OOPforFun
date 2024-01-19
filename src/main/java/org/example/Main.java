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
        System.out.println("\n");
        recursivefr(5);

        System.out.println("\n");
        int total = sumUp(5);
        System.out.println("The total is -> "+total);
        System.out.println("\n");
        System.out.println(whateverTf("Holyy"));
        newUser.similarArray();
    }

    public static String whateverTf(String term){
        if(term.length()>=5){
            return "Valid";
        }
        return "Invalid!";
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

    public static void recursivefr(int steps){
        if(steps==0){
            return;
        }
        System.out.println("You have taken -> "+steps);
        recursivefr(steps-1);

    }

    public static int sumUp(int n){
        int sum = n*(n+1)/2;
        return sum;
    }



}