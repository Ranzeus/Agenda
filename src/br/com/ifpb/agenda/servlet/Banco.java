package br.com.ifpb.agenda.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Contato> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Contato contato1 = new Contato();
		contato1.setId(chaveSequencial++);
		contato1.setNome("José");
		contato1.setNum("02020202");
		
		Contato contato2 = new Contato();
		contato1.setId(chaveSequencial++);
		contato2.setNome("Maria");
		contato2.setNum("03030202");
		
		lista.add(contato1);
		lista.add(contato2);
		
	}
	
	public void adicionar(Contato contato) {
		contato.setId(Banco.chaveSequencial++);
		lista.add(contato);
	}
	public List<Contato> getContato() {
		return Banco.lista;
	}
	
	public Contato getContatoById(Integer id) {
		for (Contato contato: lista) {
			if(contato.getId() == id) {
				return contato;
			}
		}
		return null;
	}
	
	public boolean excluiContato(Integer id) {
		
		for(Contato contato : Banco.lista) {
			
			if(contato.getId().equals(id)) {
				return Banco.lista.remove(contato);
			}
		
		}
		return false;
	}
}
	
