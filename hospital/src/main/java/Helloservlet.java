

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloservlet
 */
@WebServlet("/Helloservlet")
public class Helloservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Helloservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fn");
		String lname=request.getParameter("ln");
		long contact=Long.parseLong(request.getParameter("cont"));
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gend");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		out.println(fname);
		out.println(lname);
		out.println(contact);
		out.println(dob);
		out.println(gender);
		out.println(email);
		out.println(pass);
		
		RegBean r=new RegBean();
		r.setFname("fn");
		r.setLname("ln");
		r.setContact(contact);
		r.setDob("dob");
		r.setGenden("gender");
		r.setEmail("email");
		r.setPass("password");
		
		RegDao rdao =  new RegDao();
		try {
			rdao.addDetail(r);
		}
		catch(ClassNotFoundException | SQLException e1)
		{
			e1.printStackTrace();
		}
		out.println("Register Successfully...");
		response.sendRedirect("regdetails.jsp");
		
		
		
	
		
		
		
	}

}
