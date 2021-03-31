package login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        String user = request.getParameter("userName");
        String pass = request.getParameter("userPassword");
        pw.println("Login Success...");
        if (user.equals("mca123") && pass.equals("mca123"))
            pw.println("Login Success...");
        else
            pw.println("Login Failed...");
        pw.close();
    }
}

// https://docs.oracle.com/javaee/7/tutorial/servlets002.htm
// https://docs.oracle.com/cd/E13222_01/wls/docs92/webapp/configureservlet.html
// https://docs.oracle.com/cd/E13222_01/wls/docs92/webapp/configureservlet.html
