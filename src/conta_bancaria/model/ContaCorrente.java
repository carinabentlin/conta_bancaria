package conta_bancaria.model;

public class ContaCorrente extends Conta{   //herança só permite uma única classe - em Conta Corrente criou um construtor que trouxe os parametros
	
	private float limite;
		
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {  //método construtor - Conta Corrente é um tipo de conta
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


	
	@override  //Isso é uma anotação, indica que este método é uma reescrita do método visualizar
    public void visualizar() {  //polimorfismo de poliescrita - vc reescreve o método
	    super.visualizar();
        System.out.printf("Limite de Conta: R$ %.2f%n", this.limite);
	
}
}
