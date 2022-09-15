package com.example.homework_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "cartServlet", value = "/cart")
public class CartServlet extends HttpServlet {
    List<String> cart = Arrays.asList("T-shirt", "Ring", "Socks", "Boots", "Earrings");

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        writer.println("<html><body>");
        writer.println(cart);
        writer.println("<body></html>");
    }

    public void destroy() {
    }
}
