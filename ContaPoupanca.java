
public class ContaPoupanca extends Conta {
	
private double rendimento;

public ContaPoupanca() {
}
public ContaPoupanca(int numero, String nome, double saldo, double rendimento) {
	super(numero, nome,saldo);
	this.rendimento=rendimento;
}

public void setRendimento (double rendimento) {
	this.rendimento=rendimento;
}

public double getRendimento(double rendimento) {
	return this.rendimento;
}
public String toString() {
	return "Número da conta: "+numero+" Cliente: "+nome+" Rendimento: "+rendimento;
}

}
