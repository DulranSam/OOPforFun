package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class User {
    protected String username;
    protected String password;

   ArrayList<User> users;

    public User(String userUsername,String userPassword){
        username = userUsername;
        password = userPassword;
        users = new ArrayList<>();
    }

    public void changeUsername(String newUsername){
        this.username = newUsername;
    }

    public String displayName(){
        return username;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public String toString(){
        return "username -> "+username+"\nPassword -> "+password;
    }

    public void newUser(User newUser){
        if(!users.contains(newUser)){
            users.add(newUser);
        }else{
            System.out.println("User already exists!");
        }
        try{
            File userData = new File("userData.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(userData,users);
            System.out.println("Stored for backup in -> "+userData);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void removeUser(String username){
        if(users.isEmpty()){
            return;
        }
        for(User x : users){
            if(Objects.equals(x.username, username)){
                users.remove(username);
            }else{
                System.out.println("Invalid User!");
            }
        }
    }

    public void similarArray(){
        String[] test = new String[users.size()];
        int length = test.length;
        if(length>0){
            System.out.println("Your length is -> "+length);
        }else{
            System.out.println("Your array is small -> "+length);
        }
    }


}
