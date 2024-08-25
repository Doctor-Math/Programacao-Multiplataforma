
public class Pessoa {
protected String nome; 
protected String endereco;
protected String email;
protected int telefone;
	public Pessoa() {

	}
	public Pessoa(String nome, String endereco, String email, int telefone) {
		super();
		this.nome=nome;
		this.endereco=endereco;
		this.email=email;
		this.telefone=telefone;
		
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome(String nome) {
		return this.nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	public String getEndereco(String endereco) {
		return this.endereco;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail(String email) {
		return this.email;
	}
	
	public void seTelefone(int telefone) {
		this.telefone=telefone;
	}
	public int getTelefone(int telefone) {
		return this.telefone;
	}
	
	public String toString() {
		return "Nome: "+nome+" Endereço: "+endereco+" E-mail: "+email+" Telefone:"+telefone;
	}
}
