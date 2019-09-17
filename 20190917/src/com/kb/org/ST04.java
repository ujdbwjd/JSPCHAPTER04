package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST04")
public class ST04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ST04() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
//		String dansu = request.getParameter("dansu"); //Ex01.jsp에서 구구단확인 버튼 클릭 시 dansu를 받아온다.  
//		int dansu_int = Integer.parseInt(dansu); //받은 dansu가 String이므로 형변환
		
		int dansu = Integer.parseInt(request.getParameter("dansu"));
		
		for(int i = 0; i < 10; i++) 
			System.out.println(dansu + " * " + i + " = " + dansu*i);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"); //한글처리방식
		out.println("</head>");
		out.println("<body>");
		
		for(int i = 0; i < 10; i++) 
			out.println(dansu + " * " + i + " = " + dansu*i +"<br/>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		System.out.println("name = " + name);
		System.out.println("password = " + password);
		System.out.println("gender = " + gender);
		
		PrintWriter out = response.getWriter();
		
		out.println("name = " + name);
		out.println("password = " + password);
		out.println("gender = " + gender);
		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"); //한글처리방식
//		out.println("</head>");
//		out.println("<body>");
//		
//		out.println("name = " + name);
//		out.println("password = " + password);
//		out.println("gender = " + gender);
//		
//		out.println("</body>");
//		out.println("</html>");
	}

}
