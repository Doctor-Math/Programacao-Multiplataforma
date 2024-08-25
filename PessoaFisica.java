
public class PessoaFisica extends Pessoa {
private int CPF;
public PessoaFisica() {
	
}

public PessoaFisica(String nome, String endereco, String email, int telefone, int CPF) {
super(nome, endereco, email, telefone);
this.CPF=CPF;
}

public void setCPF(int CPF) {
	this.CPF=CPF;
}
public int getCPF(int CPF) {
	return this.CPF;
}

public String toString() {
	return "Nome: "+nome+" Endereço: "+endereco+" E-mail: "+email+" Telefone:"+telefone+" CPF:"+CPF;
}
}