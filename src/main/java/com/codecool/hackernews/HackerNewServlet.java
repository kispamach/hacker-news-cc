package com.codecool.hackernews;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hackerNewsServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class HackerNewServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String title = "Michael Hackson news";

        out.println(
                "<html>\n" +
                        "<head>" +
                        "   <meta charset=\"UTF-8\">" +
                        "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=\">" +
                        "  <title>" + title + "</title>" +
                        " <!--    Bootstrap-->\n" +
                        "   <link href=\"/docs/5.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
                        "   <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
                        "   <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n" +
                        "   <link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />" +
                        "   <link href=\"sticky-footer.css\" rel=\"stylesheet\">" +
                        "\n" +
                        "   <script src=\"/static/js/main.js\" defer></script>" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<div class=\"container-md\">\n" +
                        "    <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\n" +
                        "       <a href=\"/\" id=\"home\" class=\"btn btn-warning\">Hackers news</a>\n" +
                        "       <a href=\"/api/top-news?page=1\" id=\"top-news\" class=\"btn btn-warning\" name=\"page\" value=\"1\">Top news</a>\n" +
                        "       <a href=\"/api/newest?page=1\" id=\"newest\" class=\"btn btn-warning\">Newest</a>\n" +
                        "       <a href=\"/api/jobs?page=1\" id=\"jobs\" class=\"btn btn-warning\">Jobs</a>\n" +
                        "   </div>" +
                        "</div>\n" +
                        "\n" +
                        "<div class=\"container-md\">\n" +
                        "   <div id=\"page-switcher\" class=\"btn-group\" role=\"group\" aria-label=\"Basic outlined example\">\n" +
                        "       <button type=\"button\" id=\"prev-btn\" class=\"btn btn-outline-secondary\">Previous</button>\n" +
                        "       <button type=\"button\" id=\"next-btn\" class=\"btn btn-outline-secondary\">Next</button>\n" +
                        "   </div>" +
                        "</div>\n" +
                        "<div class=\"container-md\">\n" +
                        "   <div id=\"page-body\" class=\"row\">" +
                        "   </div>\n" +
                        "</div>\n" +
                        "<footer class=\"footer mt-auto py-3 bg-light\">\n" +
                        "  <div class=\"container-md\">\n" +
                        "    <span class=\"text-muted\">David Fazekas, fazekasdav@gmail.com <strong>2021</strong></span>\n" +
                        "  </div>\n" +
                        "</footer>" +
                        "</body></html>"
        );
    }
}
