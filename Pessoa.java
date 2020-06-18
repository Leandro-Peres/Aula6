
public class Pessoa {
	
	String nome;
	String endereco;
	String cpf;
	String telefone;
	int nroRegistro;
	
	
	
	void mostrarDetalhes () {
		
		System.out.println("_______________________");
		System.out.println("Nome " + nome);
		System.out.println("Endereço: "  + endereco);
		System.out.println("CPF: "  + cpf);
		System.out.println("Telefone:" + telefone);
		System.out.println("Registro : " + nroRegistro);
		System.out.println("_______________________");
	}
	
	

}
