package com.tms.Frontcontroler;

import com.tms.Servis.UserServis;
import com.tms.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

public class UserController {
    UserServis userServis = new UserServis();


    public void getUser (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = userServis.getUser(req);
        Writer writer = resp.getWriter();
       if( user!=null) {
           writer.write("We fond out user!!");
       }else {
           writer.write("We don't have user!!");
       }
    }
    public void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        boolean result = userServis.deleteUser(req);
        Writer writer = resp.getWriter();
        writer.write(result ? "We deleted user!!" : "We don't delete user!!");

    }

    public void createUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = userServis.createUser(req);
        Writer writer = resp.getWriter();
        if(user != null){
            writer.write("User created!");
        }else{
            writer.write("User don't created!");
        }

    }
}
