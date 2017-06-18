package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bestel.DefaultProduct;
import bestel.Product;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index.html")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static ArrayList<Product> assortment = new ArrayList<>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		assortment.add(new DefaultProduct("Dog food", 5, "https://www.dogfoodadvisor.com/wp-content/uploads/2016/10/cesar-classic-filet-mignon.png"));
		assortment.add(new DefaultProduct("Cat food", 100, "https://img.chewy.com/is/catalog/99967_MAIN._AC_SS190_V1462999359_.jpg"));
		
		request.setAttribute("products", assortment);
		request.getRequestDispatcher("/WEB-INF/NewFile.jsp").forward(request, response);
	}


}
