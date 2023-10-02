package com.example.demo1;

import javax.servlet.Servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class Product extends HttpServlet {
    private String message;

    public void init() {
        message = "List product";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

int a =Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));
int c = a + b;
PrintWriter out = response.getWriter();
out.println("<h1>" + c + "<h1>");
    }

public void doPost(HttpServletRequest request, HttpServletResponse resp) {

}
}
