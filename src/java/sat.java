/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;
/**
 *
 * @author DELL
 */
public class sat extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                 String s1=(String)request.getParameter("t1");     
        String s2=(String)request.getParameter("t2");
        String s3=(String)request.getParameter("t3");
        String s4=(String)request.getParameter("t4");
        String s5=(String)request.getParameter("t5");
        String s6=(String)request.getParameter("t6");
        String s7=(String)request.getParameter("t7");
        String s8=(String)request.getParameter("t8");
        String s9=(String)request.getParameter("t9");
        String s10=(String)request.getParameter("t10");
        
        try
        {
            
            
            
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:dsn8"); 
            PreparedStatement ps=con.prepareStatement("insert into ram values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,s1);
            ps.setString(2,s2);
            ps.setString(3,s3);
            ps.setString(4,s4);
            ps.setString(5,s5);
            ps.setString(6,s6);
            ps.setString(7,s7);
            ps.setString(8,s8);
            ps.setString(9,s9);
            ps.setString(10,s10);
           int t= ps.executeUpdate();
    
        if(t>0)
              {
                 // out.print("incerted");
                  out.println("<html");
                  out.println("<body>");
out.println("<br>");
out.println("<br>");
out.println("<br>");
out.println("<br><br><br><br><br>");
out.println("<table align=center>");
out.println("<tr>");
out.println("<td>");
out.println("<p align=center><font size=50>Successfuly"); 
out.println("Registered</font></p></td>");
out.println("<td>");
out.println("<img src=images4/t2.jpg width=127 height=120></td>");
out.println("</tr>");
out.println("</table><br>");
out.println("<br>");
out.println("<center><font size=+2><a href=index2.html>&lt;&lt;Back</a></font>");
out.println("</body>");
out.println("</html>");
              }
        }
       catch(Exception e)
       {}
    }
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    
