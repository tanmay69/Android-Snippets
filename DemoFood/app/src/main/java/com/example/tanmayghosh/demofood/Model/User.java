package com.example.tanmayghosh.demofood.Model;

/**
 * Created by Tanmay Ghosh on 22-03-2018.
 */

public class User {

    private  String Name;
    private  String Password;

    public User()
    {}


    public User(String name, String password)
    {
        Name = name;
        Password = password;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getPassword()
    {
        return Password;
    }

}
