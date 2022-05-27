package com.example.logindemo;

import dao.LoginDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    private LoginDao loginDao;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname=request.getParameter("uname");
        String password=request.getParameter("pass");
        loginDao = new LoginDao();
        if(loginDao.check(uname,password)){
            HttpSession session= request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("welcome.jsp");
        }
        else {
            response.sendRedirect("login.jsp");
        }
    }


}
