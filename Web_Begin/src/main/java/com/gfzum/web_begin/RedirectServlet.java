package com.gfzum.web_begin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RedirectServlet", value = "/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet2");
        response.sendRedirect("/web_begin/hello-servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name.equals("admin")){
            System.out.println("right one");
            Cookie cookie = new Cookie("key1","valuet");
            response.addCookie(cookie);
        }
        else System.out.println("wrong");
    }

}
