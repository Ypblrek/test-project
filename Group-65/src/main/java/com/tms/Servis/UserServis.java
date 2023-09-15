package com.tms.Servis;


import com.tms.User;
import jakarta.servlet.http.HttpServletRequest;

public class UserServis {

    public User getUser(HttpServletRequest req) {
        //logic for find User...
        //get id from path
        //connect to db and load user
        return new User(1, "Sasha");
    }

    public boolean deleteUser(HttpServletRequest request) {
        //logic for deleting User...
        //get id from path
        //connect to db and delete user;
        return true;
    }

    public User createUser(HttpServletRequest request) {
        //logic for creating user...
        return new User(2,"Dima");
    }
}
