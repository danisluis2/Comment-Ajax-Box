package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Comment;

/**
 * Servlet implementation class ControllerAjax
 */
@SuppressWarnings("all")
public class ControllerAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final ArrayList<Comment> alComment = new ArrayList<Comment>(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAjax() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String fullname=request.getParameter("afullname");
		String cmt=request.getParameter("acmt");
		String date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date());
		Comment comment = new Comment(fullname, cmt, date); 
		alComment.add(comment);
		String result = "";
		for(Comment item : alComment) {
			result+="<div class='item-cmt'>";
			result+="<p class='name-cmt'>"+item.getFullname()+"</p>";
			result+="<p class='content-cmt'>"+item.getCmt()+"</p>";
			result+="<p class='time-cmt'>"+item.getDate()+"</p>";
			result+="</div>";
		}
		out.print(result);
	}
}
