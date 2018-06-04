package com.jsp.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/board_insert_image.cp")
public class Board_Insert_Image_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Board_Insert_Image_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String savePath=getServletContext().getRealPath("/upload"); // 저장할 디렉토리 (절대경로)
		int sizeLimit = 5 * 1024 * 1024 ; // 5메가까지 제한 넘어서면 예외발생
		
		PrintWriter out = response.getWriter();
		
		try{
		MultipartRequest multi=new MultipartRequest(request, savePath, sizeLimit, new DefaultFileRenamePolicy());
		Enumeration formNames=multi.getFileNames();  // 폼의 이름 반환
		String formName=(String)formNames.nextElement(); // 자료가 많을 경우엔 while 문을 사용
		String fileName=multi.getFilesystemName(formName); // 파일의 이름 얻기
		
		System.out.println(formNames);
		System.out.println(formName);
		System.out.println(fileName);
		
		if(fileName == null) {   // 파일이 업로드 되지 않았을때
		out.print("파일 업로드 되지 않았음");
		} else {  // 파일이 업로드 되었을때
		fileName=new String(fileName.getBytes("8859_1"),"UTF-8"); // 한글인코딩 - 브라우져에 출력

		out.print(fileName);
		
		out.flush();
		out.close();
		} // end if

		} catch(Exception e) { e.printStackTrace();}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
