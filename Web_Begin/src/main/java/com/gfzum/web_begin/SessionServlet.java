package com.gfzum.web_begin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        try {
            // 获取action业务鉴别字符串，获取相应的业务 方法反射对象
            Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
//            System.out.println(method);
            // 调用目标业务 方法
            method.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createSession(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Boolean isNew = session.isNew();

        PrintWriter writer = response.getWriter();
        writer.write(isNew + " " + "life:" + " " + session.getMaxInactiveInterval() + "\n");
        writer.write(session.getId());
    }

    public void zeroTest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(-1);

        PrintWriter writer = response.getWriter();
        writer.write("life:" + " " + session.getMaxInactiveInterval() + "\n");
        writer.write(session.getId());
    }

    public void deleteSession(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        PrintWriter writer = response.getWriter();
        writer.write("delete" + " " + session.getId());
        writer.write("life:" + " " + session.getMaxInactiveInterval() + "\n");
    }
}
