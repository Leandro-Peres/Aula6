
public class TestePessoa {

	public static void main(String[] args) {
		// Teste Pessoa

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome ="Leandro Rolda Peres";
		pessoa1.nroRegistro =001;
		pessoa1.endereco ="Rua Italva,53";
		pessoa1.cpf ="256.353.567.89";
		pessoa1.telefone = "23455-3456";
		
		pessoa1.mostrarDetalhes();
		
		pessoa2.nome ="Pedro Pandori Peres";
		pessoa2.nroRegistro =002;
		pessoa2.endereco ="Rua Italva,53";
		pessoa2.cpf ="123.345.345.67";
		pessoa2.telefone = "22345-3456";
		
		pessoa2.mostrarDetalhes();
		
		
		
	}

}
