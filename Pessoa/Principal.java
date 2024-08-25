
public class Principal {
	public static void main(String[] args) {
		PessoaFisica a=new PessoaFisica("Cristiano Ronaldo","Aleluia","CR7@gmail.com",34587854,123456789);
        PessoaJuridica b=new PessoaJuridica("Coca-Cola","Bairro Glalija","cocacola@gmail.com",80321212,735684612);
        		System.out.println(a.toString());
        System.out.println(b.toString());
	}

}
