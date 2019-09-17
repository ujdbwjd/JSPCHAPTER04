package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST03")
public class ST03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ST03() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get방식");
		
		String name = request.getParameter("name");
		System.out.println("name = " + name);
		
		request.setCharacterEncoding("UTF-8"); //한글처리방식
		response.setContentType("text/html charset=UTF-8"); //한글처리방식
		response.setCharacterEncoding("utf-8"); //한글처리방식
		
		String utfname = new String(name.getBytes("UTF-8")); //한글처리방식
		String euckrname = new String(name.getBytes("euc-kr")); //한글처리방식
		
		System.out.println("utfname = "+ utfname); 
		System.out.println("euckrname = "+ euckrname);
		
		PrintWriter out = response.getWriter();
		
		out.append("utf"+utfname);
		
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"); //한글처리방식
		out.println("</head>");
		out.println("<body>");
		
		out.println("name = "+name);
		out.println("utfname = "+utfname);
		out.println("euckrname = "+euckrname);
		
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post방식");
		String name = request.getParameter("name");
		System.out.println("name = " + name);
		
		PrintWriter out = response.getWriter();
		out.println("name = " + name);
	}

}
