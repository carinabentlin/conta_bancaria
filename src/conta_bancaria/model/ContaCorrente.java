package conta_bancaria.model;

public class ContaCorrente extends Conta{   //heran�a s� permite uma �nica classe - em Conta Corrente criou um construtor que trouxe os parametros
	
	private float limite;
		
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {  //m�todo construtor - Conta Corrente � um tipo de conta
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
		
	}

	
	public float getLimite() {  //pegar/ler o valor de um atributo privado da classe - p inserir ir em source/generate getter e setters
		return limite;
	}

	public void setLimite(float limite) { //alterar/atribuir um valor a um atributo privado da classe
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}


	
	@override  //Isso � uma anota��o, indica que este m�todo � uma reescrita do m�todo visualizar
    public void visualizar() {  //polimorfismo de poliescrita - vc reescreve o m�todo
	    super.visualizar();
        System.out.printf("Limite de Conta: R$ %.2f%n", this.limite);
	
}
}
