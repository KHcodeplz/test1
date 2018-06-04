package com.jsp.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.service.Board_Service;
import com.jsp.board.model.vo.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/board_insert.cp")
public class Board_Insert_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Board_Insert_Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String savePath=getServletContext().getRealPath("/upload");
		int maxSize = 1024 * 1024 * 10;
		
		MultipartRequest mrequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
		
		int category = Integer.parseInt(mrequest.getParameter("category"));
		String title = mrequest.getParameter("title");
		String tag = mrequest.getParameter("tag");
		String content = mrequest.getParameter("content");
		String file = mrequest.getFilesystemName("file");
		
		System.out.println(category);
		System.out.println(title);
		System.out.println(tag);
		System.out.println(content);
		System.out.println(file);
		
		Board board = new Board();
		board.setBoard_category_index(category);
		board.setBoard_title(title);
		board.setBoard_tags(tag);
		board.setBoard_content(content);
		board.setBoard_file(file);
		
		int result = new Board_Service().insertBoard(board);
		
		if(result == 1) {
			System.out.println("insert 성공 !");
		} else {
			System.out.println("insert 실패 !");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
