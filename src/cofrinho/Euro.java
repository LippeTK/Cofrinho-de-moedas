package cofrinho;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
	}
	
	public String info() {
		return "Euro : " + valor;
	}

	public double converter() {
		return valor * 5.19;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoParaEuro = (Euro) objeto;
		
		if (this.valor != objetoParaEuro.valor) {
			return false;
		}
			return true;
		
	}
}
