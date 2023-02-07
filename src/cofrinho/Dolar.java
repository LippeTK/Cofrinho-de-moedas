package cofrinho;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}

	public String info() {
		return "Dolar : " + valor;
	}
	
	public double converter() {
		return valor * 5.30;
	}
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoParaDolar = (Dolar) objeto;
		
		if (this.valor != objetoParaDolar.valor) {
			return false;
		}
			return true;
		
	}
}
