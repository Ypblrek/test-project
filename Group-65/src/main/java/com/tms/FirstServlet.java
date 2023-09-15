package com.tms;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

//на какой путь?
@WebServlet("/c65new2")
public class FirstServlet extends HttpServlet {
    //GET POST PUT DELETE ....

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //request - запрос
        //response - ответ

//        resp.setContentType("text/html");//как браузеру отобразить полученную информацию
/*        HttpSession session = req.getSession();
        String name =(String) session.getAttribute("name");
        PrintWriter writer = resp.getWriter();
        if (name == null) {
            session.setAttribute("name", "Vaserman");
            writer.print("Hello, I don't know why are you...");
        } else {
            writer.print("Hello my dear" + session.getAttribute("name"));
        }
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1> HELLO WORLD! From c65 </h1>");
        req.setAttribute("name", "Bill Gates");*/
//        req.getRequestDispatcher("WEB-INF/pages/my-first-html.html").forward(req,resp);
//    }
////    @Override
////    public void init()
//
    }
}