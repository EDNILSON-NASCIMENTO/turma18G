package CLASSES;

public class ContaEspecial extends Conta {

	//atributo
	private double limite;

	//construtor
	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
		
	}
	//construtor - sobrecarga
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	
	
	//ENCAPSULAMENTO - getters and setters
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
