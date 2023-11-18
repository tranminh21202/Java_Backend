/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.NhaCCDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import model.NhaCC;

/**
 *
 * @author lap
 */
public class NhaCCServlet extends HttpServlet {

    private NhaCCDAO nhaccdao;

    @Override
    public void init() {
        nhaccdao = new NhaCCDAO();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NhaCCServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NhaCCServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertNhaCC(request, response);
                    break;
                case "/delete":
                    deleteNhaCC(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateNhaCC(request, response);
                    break;
                case "/cal":
                    view(request, response);
                    break;
                default:
                    listNhaCC(request, response);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void listNhaCC(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        ArrayList<NhaCC> listNhacc = nhaccdao.getListNhaCC();
        request.setAttribute("data", listNhacc);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }

    private void insertNhaCC(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String maNhaCC = request.getParameter("ma");
        String tenNhaCC = request.getParameter("name");
        String diaChi = request.getParameter("address");
        String dienThoai = request.getParameter("phone");
        NhaCC x = new NhaCC(maNhaCC, tenNhaCC, diaChi, dienThoai);
        nhaccdao.insert(x);
        listNhaCC(request, response);
    }

    private void deleteNhaCC(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String maNhaCC = String.valueOf(request.getParameter("id"));
        nhaccdao.delete(maNhaCC);
        listNhaCC(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String maNhaCc = request.getParameter("id");
        NhaCC x = nhaccdao.getNhaCC(maNhaCc);
        request.setAttribute("nhaCC", x);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    private void updateNhaCC(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String maNhaCC = request.getParameter("ma");
        String tenNhaCC = request.getParameter("name");
        String diaChi = request.getParameter("address");
        String dienThoai = request.getParameter("phone");
        NhaCC x = new NhaCC(maNhaCC, tenNhaCC, diaChi, dienThoai);
        nhaccdao.update(x);
        listNhaCC(request, response);
    }

    private void view(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
//        String ma = request.getParameter("id");
//        String maVT = request.getParameter("mavt");
//        int sl = nhaccdao.calcTK(ma, maVT);
//        request.setAttribute("data", sl);
//        request.getRequestDispatcher("calculateTK.jsp").forward(request, response);
        NhaCCDAO d = new NhaCCDAO();
        Map<String, Integer> dataMap = d.showKQ();
        request.setAttribute("dataMap", dataMap);
        request.getRequestDispatcher("viewDHT2.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
