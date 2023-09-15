package com.tms.Servis;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;



public class NewsServis {
        public ArrayList<String> getAllNews(HttpServletRequest req) throws IOException {
            //logic for find all news...
            //connect to db and get news
            return new ArrayList<>();
        }

        public String getOneNews(HttpServletRequest req) throws IOException {
            //logic for update news...
            //connect to db and update news
            return "One news!";
        }

}
