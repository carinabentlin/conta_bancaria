package conta_bancaria.model;


public class ContaPoupanca extends Conta{
		
		private int diaAniversario;
			
		public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int diaAniversario) {  //método construtor - 
			super(numero, agencia, tipo, titular, saldo);
			this.diaAniversario = diaAniversario;
			
		}

		
		public int getdiaAniversario() {  //pegar/ler o valor de um atributo privado da classe - p inserir ir em source/generate getter e setters
			return diaAniversario;
		}

		public void setdiaAniversario(int diaAniversario) { 
			this.diaAniversario = diaAniversario;
		}

		
		@override  
		///visualizar dados da conta poupança incluindo data de aniversario
	    public void visualizar() {  
		    super.visualizar();
	        System.out.println("Aniversário da conta: " + this.diaAniversario);
		
	}
	}

