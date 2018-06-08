package org.btm.lifecycleApp;
import java.io.*;
import javax.servlet.*;
public class FirstServlet extends GenericServlet {
public FirstServlet() {
	System.out.println("servlet object is created");
}
@Override
	public void init(ServletConfig config) throws ServletException {
     System.out.println("servlet object is intialised");
}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
	    String place=req.getParameter("pl");
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor='yellow'>"
			+ "<hi>welcome "+name+" "+place+"</hi>"
					+ "</body></html>");
	out.flush();
	out.close();
	}
	@Override
		public void destroy() {
		System.out.println("close all costly resources");
		}

}
