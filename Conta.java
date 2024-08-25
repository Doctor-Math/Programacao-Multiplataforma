import java.util.Scanner;
public class Conta {
protected int numero;
protected String nome;
protected double saldo;
double vlr;
char opc;

Scanner s= new Scanner(System.in);

public Conta(){
}
public Conta(int numero, String nome, double saldo) {
	super();
	this.numero=numero;
	this.nome=nome;
	this.saldo=saldo;
}
public void sacar(double vlr) {
	System.out.println("Deseja realizar um saque? S/N");
	opc=s.next().charAt(0);
    if(opc=='S') {
	System.out.println("---OPERAÇÃO DE SAQUE---");
	System.out.println("Informe o valor desejado:");
	vlr=s.nextDouble();
	if(vlr>saldo) {
		System.out.println("Saque indisponível.");
	}else {
	saldo=saldo-vlr;
	}
    }
}
public void depositar(double vlr) {
	saldo=saldo+vlr;
	
	System.out.println("Deseja realizar um depósito? S/N");
	opc=s.next().charAt(0);
    if(opc=='S') {
	System.out.println("---OPERAÇÃO DE DEPÓSITO---");
	System.out.println("Informe o valor desejado:");
	vlr=s.nextDouble();
	
	saldo=saldo+vlr;
    }
}
public void saldoAtual() {
	System.out.println("O saldo atual é de R$"+saldo+".");
}

public void setNumero(int numero) {
	this.numero=numero;
}

public int getNumero(int numero) {
	return this.numero;
}

public void setNome(String nome) {
	this.nome=nome;
}

public String getNome(String nome) {
	return this.nome;
}

public void setSaldo(double saldo) {
	this.saldo=saldo;
}

public double getSaldo(double saldo) {
	return this.saldo;
}

public String toString() {
	return "Número da conta: "+numero+" Cliente: "+nome+" Saldo: R$"+saldo;
}

}


