package conta_bancaria.model;


public class ContaPoupanca extends Conta{
		private float limite;
		private int diaAniversario;
			
		public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int diaAniversario) {  //método construtor - Conta Corrente é um tipo de conta
			super(numero, agencia, tipo, titular, saldo);
			this.diaAniversario = diaAniversario;
			
		}

		
		public int getdiaAniversario() {  //pegar/ler o valor de um atributo privado da classe - p inserir ir em source/generate getter e setters
			return diaAniversario;
		}

		public void setdiaAniversario(int diaAniversario) { 
			this.diaAniversario = diaAniversario;
		}

		@Override
		public boolean sacar(float valor) {

			if (this.getSaldo() < valor) {
				System.out.println("\n Saldo Insuficiente!");
				return false;
			}

			this.setSaldo(this.getSaldo() - valor);
			return true;
		}


		
		@override  
		///visualizar dados da conta poupança incluindo data de aniversario
	    public void visualizar() {  
		    super.visualizar();
	        System.out.printf("Dia do Aniversário: %d\n", this.diaAniversario);
		
	}
	}

