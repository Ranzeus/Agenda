package br.com.ifpb.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditarContatoServlet
 */
@WebServlet("/mostrarContato")
public class MostrarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarContatoServlet() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Contato contato = banco.getContatoById(id);
		
//		System.out.println(contato.getNome());
		
		RequestDispatcher rd = request.getRequestDispatcher("/EditarContato.jsp");
		
		request.setAttribute("contato", contato);
		
		rd.forward(request, response);
	}

}
