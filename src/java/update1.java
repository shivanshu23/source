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
import javax.servlet.http.HttpSession;
import java.sql.*;
import javax.sql.*;
/**
 *
 * @author DELL
 */
public class update1 extends HttpServlet {
     
    String s2,s3,s4,s1,s5,s6,s7,s8,s9,s10;
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
        /*HttpSession ses1=request.getSession();
           s2=(String)ses1.getAttribute("first");
           s3=(String)ses1.getAttribute("last");
           s4=(String)ses1.getAttribute("fn");
           s5=(String)ses1.getAttribute("dob");
           s6=(String)ses1.getAttribute("add");
           s7=(String)ses1.getAttribute("country");
           s8=(String)ses1.getAttribute("state");
           s9=(String)ses1.getAttribute("city");
           s10=(String)ses1.getAttribute("passwd");
           HttpSession ses=request.getSession();
           s1=(String)ses.getAttribute("uname");
           out.print(s1);
           try {
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:dsn8"); 
        PreparedStatement ps=con.prepareStatement("update ram set first_name=s2,last_name=s3,father_name=s4,dob=s5,address=s6,country=s7,state=s8,city=s9,password=s10 where userid=?");
            ps.setString(1, s1);
            int t=ps.executeUpdate();*/
             //if(t>0)
             {
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
out.println("Updated</font></p></td>");
out.println("<td>");
out.println("<img src=images4/t2.jpg width=127 height=120></td>");
out.println("</tr>");
out.println("</table><br>");
out.println("<br>");
out.println("<center><font size=+2><a href=index2.html>&lt;&lt;Back</a></font>");
out.println("</body>");
out.println("</html>");
             }
           }/*
catch(Exception e)
        {}
    } */
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
    
