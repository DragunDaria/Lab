package com.example.lab_7;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        ((PrintWriter) out).println("<html><body>");
        ((PrintWriter) out).println("<h1>" + message + "</h1>");
        ((PrintWriter) out).println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CheckService checkService = new CheckService();
        String username = req.getParameter("username");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        ((PrintWriter) out).println("<html><body>");
        ((PrintWriter) out).println("<h2> POST </h2>");
        out.println("<h1>" + checkService.addString(username) + "</h1>");
        out.println("</body></html>");    }

    public void destroy() {
    }
}