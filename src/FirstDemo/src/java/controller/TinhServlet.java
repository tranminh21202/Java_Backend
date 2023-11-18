/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author minh
 */
//@WebServlet (name = "TinhServlet", urlPatterns = "/tinhtoan")
public class TinhServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dai_raw = request.getParameter("dai_raw");
        String rong_raw = request.getParameter("rong_raw");
        String cv = request.getParameter("cv");
        String dt = request.getParameter("dt");
        double c,d;
        String ms = "";
        PrintWriter out = response.getWriter();
        try {
            c = Double.parseDouble(dai_raw);
            d = Double.parseDouble(rong_raw);
            if(cv == null && dt == null){
                ms = "Chua chon gi!";
            }
            else if(cv != null && dt == null){
                ms = "Chu vi: " + ((c+d)*2) + "!";
            }
            else if(cv == null && dt != null){
                ms = "Dien tich: " + c*d + "!";
            }
            else{
                ms = "Chu vi: " + (c+d)*2 + " " + "Dien tich: " + c*d + "!";
            }
            out.println("<h1>" + ms + "</h1>");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }
    
}
