package org.dstu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AssessmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String[] lastNames = req.getParameterValues("lastName");
        String[] score = req.getParameterValues("score");
        int scores = Integer.parseInt(score[0]);
        if (lastNames[0].equals("Паниотов") & (scores < 3)) {
            req.getRequestDispatcher("notfoundassessment.jsp").forward(req, resp);
       }
    }
}
