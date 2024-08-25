
public class Principal {
	
	public static void main(String[] args) {
		ContaEspecial c1=new ContaEspecial(123,"Wallace",1000, 1500);
		System.out.println(c1.toString());
		c1.sacar(0);
		c1.depositar(0);
		c1.saldoAtual();
	}

}
