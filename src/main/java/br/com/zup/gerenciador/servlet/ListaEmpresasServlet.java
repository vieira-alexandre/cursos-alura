package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.gerenciador.model.Banco;
import br.com.zup.gerenciador.model.Empresa;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		
		String html = "<html><body><ul>";
		
		for (Empresa empresa : empresas) {
			html = html.concat("<li>" + empresa.getNome() + "</li>");
		}
		
		html = html.concat("</ul></body></html>");
		
		PrintWriter out = response.getWriter();
		out.println(html);
	}

}
