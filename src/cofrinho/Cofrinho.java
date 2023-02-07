package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList <Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}

	
	public boolean removerMoeda(Moeda moeda) {
		return listaMoedas.remove(moeda);
	}
	
	public void listar() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Nao tem moedas no cofrinho");
		}
		for(int i = 0; i < listaMoedas.size(); i++) {
			System.out.println(i+1 + " - " + listaMoedas.get(i).info());
		}
	}
	
	public boolean podeRemover() { //Verifica se a lista de moedas está vazia
		return !listaMoedas.isEmpty();
	}
	
	public double totalConvertido() {
		double valorTotal = 0;
		for(Moeda moeda : listaMoedas) {
			valorTotal += moeda.converter();
		}
		return valorTotal;
		
	}
}


