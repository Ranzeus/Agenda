package br.com.ifpb.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlterarContato
 */
@WebServlet("/contato/alterar")
public class AlterarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarContatoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Integer id = Integer.parseInt(request.getParameter("id"));
		RequestDispatcher rd = request.getRequestDispatcher("/EditarContato.jsp");
		request.setAttribute("id", id);
		rd.forward(request, response);
		
	}
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
//		System.out.println("Editando contato");

		String nomeContato = request.getParameter("nome");
		String numContato = request.getParameter("num");
		Integer id = Integer.parseInt(request.getParameter("id"));
		
//		System.out.println("ID: "+id);
		
		Contato contato = banco.getContatoById(id);
		contato.setNome(nomeContato);
		contato.setNum(numContato);
		
		response.sendRedirect("/contatos");
		
	}

}
