package br.com.ifpb.agenda.servlet;

import java.io.IOException;
//import java.util.List;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contato/criar")
public class NovoContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/CadContato.jsp");
		rd.forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nomeContato = req.getParameter("nome");
		String numContato = req.getParameter("num");
		Contato contato = new Contato();
		contato.setNome(nomeContato);
		contato.setNum(numContato);
		
		Banco banco = new Banco();
		banco.adicionar(contato);

		resp.sendRedirect("/contatos");

	}
	
}
