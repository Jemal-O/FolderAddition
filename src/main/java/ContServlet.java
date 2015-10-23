
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public class ContServlet extends javax.servlet.http.HttpServlet {
	static ArrayList<String> storage = new ArrayList<String>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext scontext = request.getServletContext();
		scontext.setAttribute("storage", storage);

		request.getRequestDispatcher("/result.jsp").forward(request, response);

	}

}