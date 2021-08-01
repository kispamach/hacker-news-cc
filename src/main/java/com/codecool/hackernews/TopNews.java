package com.codecool.hackernews;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "topNewsServlet", urlPatterns = {"/api/top-news"}, loadOnStartup = 2)
public class TopNews extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        String pageParam = request.getParameter("page");
        int page = pageParam != null ? Integer.parseInt(pageParam) : 1;
        System.out.println(page);

        out.print(HttpRequest.getContent("https://api.hnpwa.com/v0/news/" + page +".json"));
    }
}
