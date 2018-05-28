package com.websocket.controller;


import java.io.*;
import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MulticastViewServlet
 */
//@WebServlet("/multiView.do")
public class MulticastViewServlet extends HttpServlet {
	
	public static ArrayList<String> roomList;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MulticastViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ServletContext application = request.getServletContext();
		
		roomList = (ArrayList<String>)application.getAttribute("roomList");
		
		System.out.println(roomList);
		
		if (roomList == null || roomList.isEmpty()) {
			roomList = new ArrayList<String>();
			
			roomList.add("room1");
			roomList.add("room2");
			roomList.add("room3");
			
			application.setAttribute("roomList", roomList);
		}
		
		if (!roomList.isEmpty()) response.sendRedirect("views/multicast.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
