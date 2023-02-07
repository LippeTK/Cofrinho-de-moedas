package cofrinho;

public class Real extends Moeda{
	
	public Real(double valor) {
		super(valor);
	}

	public String info() {
		return "Real : " + valor;
	}

	public double converter() {
		return valor;
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoParaReal = (Real) objeto;
		
		if (this.valor != objetoParaReal.valor) {
			return false;
		}
			return true;
		
	}
}