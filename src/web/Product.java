package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bestel.DefaultProduct;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	ArrayList<bestel.Product> assortment = new ArrayList<>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(request.getQueryString());
		
		assortment.add(new DefaultProduct("Dog food", 5, "https://www.dogfoodadvisor.com/wp-content/uploads/2016/10/cesar-classic-filet-mignon.png"));
		assortment.add(new DefaultProduct("Cat food", 100, "https://img.chewy.com/is/catalog/99967_MAIN._AC_SS190_V1462999359_.jpg"));
		
		request.setAttribute("products", assortment);
		request.setAttribute("numberOfProducts", new Integer(assortment.size()));
		
		request.getRequestDispatcher("/WEB-INF/Product.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kleur = request.getParameter("kleur");
		String leeftijd = request.getParameter("leeftijd");
		System.out.println(kleur + " " + leeftijd);
		response.sendRedirect("/WebStore/succes");
	}

}
