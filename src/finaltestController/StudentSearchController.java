package finaltestController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String path = null;
		boolean result = false;
		if(result)  //result 값에 따라 달라진다라는 의미 if( )
		{
			HttpSession session = request.getSession();
			session.setAttribute("id", id);                                               
			 path="/Studentmenu.jsp"; 
	}
}
}
