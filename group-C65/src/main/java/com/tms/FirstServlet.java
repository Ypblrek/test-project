package com.tms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//на какой путь?
@WebServlet("/c65new")
public class FirstServlet extends HttpServlet {
    //GET POST PUT DELETE ....

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //request - запрос
        //response - ответ

        resp.setContentType("text/html"); //как браузеру отобразить полученную информацию
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1> HELLO WORLD! From c65 </h1>");
        printWriter.close();
    }
    @Override
    public void init()

}
    жизненный цикл
//    1 init() - когда мы к нему оброщается 1 раз
//    2 service()- выполнится каждый раз при вызове сервлета
//    3 destroy()-  когда приложение умерает