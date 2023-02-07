package cofrinho;

public abstract class Moeda {
	protected double valor;
	
	public abstract String info();
	
	public abstract double converter();

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
}
