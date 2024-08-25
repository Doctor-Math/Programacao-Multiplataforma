
public class PessoaJuridica extends Pessoa {
private int CNPJ;
public PessoaJuridica() {
	
}

public PessoaJuridica(String nome, String endereco, String email, int telefone, int CNPJ) {
super(nome,endereco, email, telefone);
this.CNPJ=CNPJ;
}

public void setCNPJ(int CNPJ) {
	this.CNPJ=CNPJ;
}
public int getCNPJ(int CNPJ) {
	return this.CNPJ;
}
public String toString() {
	return "Nome: "+nome+" Endereço: "+endereco+" E-mail: "+email+" Telefone:"+telefone+" CPF:"+CNPJ;
}
}
