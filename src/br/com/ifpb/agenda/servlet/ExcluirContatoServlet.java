package br.com.ifpb.agenda.servlet;

import java.io.IOException;
/*import java.util.List;*/

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcluirContatoServlet
 */
@WebServlet("/excluirContato")
public class ExcluirContatoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		//System.out.println("ID: "+id);
		
		boolean res;
		
		if(banco.excluiContato(id)) {
			res = true;
		} else {
			res = false;
		}
		
//		request.setAttribute("res", res);
		response.sendRedirect("ListaContatos");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/ContatoExcluido.jsp");
//		rd.forward(request, response);

	}

}
