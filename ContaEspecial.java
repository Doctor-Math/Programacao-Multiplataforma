
public class ContaEspecial extends Conta{
private double limite;

public ContaEspecial() {
}

public ContaEspecial(int numero, String nome, double saldo, double limite) {
	super(numero, nome,saldo);
	this.limite=limite;
}

public void setLimite (double limite) {
	this.limite=limite;
}

public double getLimite(double limite) {
	return this.limite;
}

public String toString() {
	return "Número da conta: "+numero+" Cliente: "+nome+" Limite: R$"+limite;
}
}
