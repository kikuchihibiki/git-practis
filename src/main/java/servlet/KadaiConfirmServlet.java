package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Kadai;

/**
 * Servlet implementation class KadaiConfirmServlet
 */
@WebServlet("/KadaiConfirmServlet")
public class KadaiConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KadaiConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("name");
        String ageStr = request.getParameter("age");
		String gender=request.getParameter("gender");
		String tell=request.getParameter("tell");
		String mail = request.getParameter("email");
		String pw = request.getParameter("pw");
		int age=Integer.parseInt(ageStr);
		Kadai kadai=new Kadai(name, age, gender, tell, mail, null,pw,null);
		
        HttpSession session = request.getSession();
		
		session.setAttribute("input_data", kadai);
		
		String view = "WEB-INF/view/confirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
