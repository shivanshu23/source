/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.*;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class update extends HttpServlet {

    String s1;
    String s10,s9,s2,s3,s4,s5,s6,s7,s8;
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
         HttpSession ses=request.getSession();
           s1=(String)ses.getAttribute("uname");
        
           try
       {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:dsn8"); 
        PreparedStatement ps=con.prepareStatement("select first_name,last_name,father_name,dob,address,country,state,city,userid,password from ram where userid=?"); 
      // PreparedStatement ps1=con.prepareStatement("select doj,project_name from projects where userid=?"); 
       //PreparedStatement ps2=con.prepareStatement("select designation,salary from salary1 where userid=?"); 
       ps.setString(1,s1);
       // ps1.setString(1,s1);
        //ps2.setString(1,s1);
        ResultSet rs=ps.executeQuery();
        //ResultSet rs1=ps1.executeQuery();
        //ResultSet rs2=ps2.executeQuery();
        if(rs.next())
        {
           //
            HttpSession ss1=request.getSession();
            s2=rs.getString(1);
             
            s3=rs.getString(2);
            s4=rs.getString(3);
             s5=rs.getString(4);
              s6=rs.getString(5);
               s7=rs.getString(6);
                s8=rs.getString(7);
                 s9=rs.getString(8);
                  s10=rs.getString(10);
            ss1.setAttribute("first",rs.getString(1));
           
            ss1.setAttribute("last",s3);
           ss1.setAttribute("fn",s4);
           ss1.setAttribute("dob",s5);
           ss1.setAttribute("add",s6);
           ss1.setAttribute("country",s7);
           ss1.setAttribute("state",s8);
           ss1.setAttribute("city",s9);
           ss1.setAttribute("passwd",s10);
           
           
            /*out.println("<html>");
            out.println("<title>View_Information</title>");
            out.println("<link href=css/style.css rel=stylesheet type=text/css media=all />");
            //out.println("<link href=main1.css rel=stylesheet type=text/css media=all>");
            out.println("</head>");
            out.println("<p align=left><br><a href=start page/index.html>");
out.println("<img src=images4/home1.jpg height=40 HSPACE=10></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");
out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=orange face=Arial size=+4>Update Record");
out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;</font>");
out.print("<a href=index2.jsp>");
out.println("<img src=images4/b5.png");
 out.println("height=40><FONT COLOR=ORANGE>LOGOUT</FONT></a>");
 out.println("<br><a href= ><font size=+1 color=orange>&nbsp;HOME</font></a></p>");      
out.println("<br />");
    
out.println("<form action = update1 method=get>");
          
    out.println("<center> <table border=0 cellpadding=5 cellspacing=5 height=500 width=600>");
    
          
             
          out.println("<tr>");
           
            out.println("<td align=center>");
            out.println("<input type=text name=t1 size=26 style=width:296px; padding:5px; disabled placeholder="+rs.getString(9)+"");
            out.println("</td>");
            out.println("</tr>"); 
           
          out.println("<tr>");
           out.println(" <td align=center>");
                out.println("<input type=text name=t2 size=26 style=width:296px; padding:5px placeholder="+rs.getString(1)+"");
                
                out.println("</td>");
            out.println("</tr>");
            
            
            out.println("<tr>");
            
            out.println("<td align=center>");
            out.println("<input type=text name=t3 size=26 style=width:296px; padding:5px placeholder="+rs.getString(2)+"");
            
            out.println("</tr>");
            
               out.println("<tr>");
            
            out.println("<td align=center>");
            out.println("<input type=text name=t4 size=26 style=width:296px; padding:5px placeholder="+rs.getString(3)+"");
           
            out.println("</tr>");
                      
             out.println("<tr>");
            out.println("<td align=center>");
            out.println("<input type=text name=d1 size=26 style=width:296px; padding:5px placeholder="+rs.getString(4)+ "");
           
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=center>");
            //out.println("<input type=date name=d2 size=26 disabled style=width:296px; padding:5px placeholder="+rs1.getString(1)+"");
            out.println("</tr>");            
            out.println("<tr>");
             out.println("<td align=center>");
                 out.println("<textarea type=textarea name=ta rows=4 style=width:296px; padding:5px placeholder="+rs.getString(5)+"></textarea>");
                 //out.println("</textarea>");
                
                 out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=center>");
            out.println("<input type=text name=t5 size=26 style=width:296px; padding:5px placeholder="+rs.getString(6)+"");
           
            out.println("</tr>");
            
            out.println("<tr>");
            
            out.println("<td align=center>");
            out.println("<input type=text name=t6 size=26 style=width:296px; padding:5px placeholder="+rs.getString(7)+ "");
           
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=center>");
            out.println("<input type=text name=t7 size=26 style=width:296px; padding:5px placeholder="+rs.getString(8)+"");
           
            out.println("</tr>");
            
           out.println("<tr>");
            out.println("<td align=center>");
             out.println("<input type=email name=t8 size=26 style=width:296px; padding:5px placeholder=hello");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=center>");
            
            out.println("<input type=text name=t9 size=26 style=width:296px; padding:2px placeholder="+rs.getString(10)+"");
           
            out.println("</tr>");
            
            
           
 
           out.println(" <tr>");
            out.println("<td align=center >");
            
            
            out.println("<a href=update1><input type=button name=b1  value=Update  style=width:100px; padding:5px ");
out.println("align=middle /></a>");
            
            
            out.println("</tr>");
            out.println("</table>");
            out.println("</center>");
            out.println("</form>");
            
            out.println("<br />");
            
           
      
   out.println("<div class=footer>");
    out.println("<div class=footer_resize>");
      out.println("<p class=lf>&copy;<a href=#>All Rights Reserved</a>.</p>");
      out.println("<p class=rf>Design by <a href=contact.jsp>KJS</a></p>");
      out.println("<div style=clear:both;></div>");
    out.println("</div>");
out.println("</div>");
out.println("<div class=footer align=center><font color=#FFFFFF>EMPLOYEE PERFORMANCE & IDENTIFICATION PORTAL</font> <a href=index.jsp>EPIP</a></div>");
            out.println("<body>");
            out.println("</html>");
            
            */      /*out.println("<tr>");
            
            
             out.println("<td align=center>");
            // out.println("<input type=text name=t11 size=26 disabled style=width:296px; padding:5px placeholder="+rs2.getString(1)+"");
            out.println("</tr>");*/
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
