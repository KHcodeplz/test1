package com.jsp.user.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.jsp.user.model.service.User_Service;

/**
 * Servlet implementation class User_SignUpIdCheckServlet
 */
@WebServlet("/signup_id_Check.cp")
public class User_SignUp_IdCheck_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_SignUp_IdCheck_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean id_Check = false;
		response.setContentType("application/json; charset=UTF-8");
		String user_id = request.getParameter("user_id");
		
		User_Service us = new User_Service();
		
		id_Check = us.id_Check(user_id);
		
		PrintWriter out = response.getWriter();
		
		Gson gs = new Gson();
		
		gs.toJson(id_Check,out);
		
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
