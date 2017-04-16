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
import javax.servlet.*;
import javax.sql.*;
import java.sql.*;
import javax.servlet.http.*;
/**
 *
 * @author DELL
 */
public class login1 extends HttpServlet {

    int flag=0,t;
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
        String s1=(String)request.getParameter("user");
        String s2=(String)request.getParameter("p1");
        
        if((s1.equals("admin@gmail.com"))) 
        {
            response.sendRedirect("admin1.html");
            flag=1;
        }
        else
        {
        try
        {
        
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:dsn8"); 
        PreparedStatement ps=con.prepareStatement("select first_name,last_name,father_name,dob,address,country,state,city,userid,password from ram where userid=?"); 
        ps.setString(1,s1);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
           HttpSession ses=request.getSession();
           ses.setAttribute("uname",s1);
           response.sendRedirect("EMP1.HTML"); 
        }
        else
        {
            out.println("Sorry you username/passworsd is wrong");
        }   
        }
        catch(Exception e)
        {}

        }
                
            
    
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