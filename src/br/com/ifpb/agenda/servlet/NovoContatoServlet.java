package br.com.ifpb.agenda.servlet;

import java.io.IOException;
//import java.util.List;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contato/criar")
public class NovoContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		System.out.println("Cadastrando contato");
		
		String nomeContato = req.getParameter("nome");
		String numContato = req.getParameter("num");
		Contato contato = new Contato();
		contato.setNome(nomeContato);
		contato.setNum(numContato);
		
		Banco banco = new Banco();
		banco.adicionar(contato);

//		req.setAttribute("nome", contato.getNome());
//		req.setAttribute("num", contato.getNum());
		
		resp.sendRedirect("ListaContatos");
		
//		RequestDispatcher rd = req.getRequestDispatcher("/ListaContatos");
//		rd.forward(req, resp);

	}
	
}
