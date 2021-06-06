package finaltestController;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {
	HashMap<String,Controller> list=null;
		
	@Override
	public void init() throws ServletException {
			list = new HashMap<String, Controller>();
			list.put("/StudentSearch.do", new StudentSearchController());
			
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String contextP = req .getContextPath();
		String url = req.getRequestURI();
		String path = url.substring(contextP.length());
		
	}
}
