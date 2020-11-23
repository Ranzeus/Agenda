package br.com.ifpb.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaContatosServlet
 */
@WebServlet("/ListaContatos")
public class ListaContatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = new Banco();
		List<Contato> lista = banco.getContato();
		
		//System.out.println(lista);
		
		request.setAttribute("contatos", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListaContatos.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
		
	}

}
