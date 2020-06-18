
public class TesteConta {

	public static void main(String[] args) {
		// TODO TesteConta

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.agencia =012;
		conta1.nome ="Leandro Roldan Peres";
		conta1.numeroConta =10127;
		conta1.saldo= "R$120.000,00";
		
		conta1.exibirSaldo();
		
		conta2.agencia =013;
		conta2.nome ="Cris Fidelix";
		conta2.numeroConta =13227;
		conta2.saldo= "R$28.120.000,00";
		
		conta2.exibirSaldo();
		
		
		
		
		
	}

}
