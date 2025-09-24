package conta_bancaria;
import java.util.Scanner;
import conta.util.Cores;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
public class Menu {

	public static void main(String[] args) {
		
		//Criação de um objeto da classe Conta (id, agência, tipo, titular, saldo inicial)
        Conta c1 = new Conta(1, 123, 1, "Carina Bentlin", 10000.0f);

        c1.visualizar();  // Mostra os dados da conta criada

        
     // Atualiza o saldo e o nome do titular
        c1.setSaldo(15000.0f);
	    c1.setTitular("Osório");
		c1.visualizar();

        c1.sacar(12000.0f);   //fazer saque
		c1.visualizar();

        c1.depositar(5000.0f); //fazer depósito
		c1.visualizar();
		
		Scanner leia = new Scanner(System.in); 	// Scanner para ler a escolha do usuário no menu
		int opcao;
		
		
		ContaCorrente cc1 = new ContaCorrente (3, 456, 1, "Thuany Silva", 1000000.00f, 10000.00f);
		
		cc1.visualizar();
		
		//sacar da conta corrente
		 System.out.println(cc1.sacar(2000000.00f));
		 cc1.visualizar();
		 
		 System.out.println(cc1.sacar(20000.00f));
		 cc1.visualizar();
		 
		 //depositar conta corrente
		 cc1.depositar(5000.00f);
		 cc1.visualizar();
		 
		 
		 //conta poupança
		 ContaPoupanca cp1 = new ContaPoupanca(4, 789, 2, "Maria da Silva", 5000.00f, 1);
		 cp1.visualizar();

		 // Testar saque
		 System.out.println(cp1.sacar(6000.00f)); // Deve falhar (saldo insuficiente)
		 cp1.visualizar();

		 System.out.println(cp1.sacar(1000.00f)); // Deve funcionar
		 cp1.visualizar();

		 // Testar depósito
		 cp1.depositar(2000.00f);
		 cp1.visualizar();

		
		// Loop infinito para exibir o menu até o usuário escolher sair
		while (true) { 
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
		       +           "===========================================");
		System.out.println("===========================================");
		System.out.println("                                           ");
		System.out.println("           Banco Ecosol                    ");
		System.out.println("                                           ");
		System.out.println("===========================================");
		System.out.println("      1 -  Criar Conta                     ");
		System.out.println("      2 -  Listar todas as Contas          ");
		System.out.println("      3 -  Buscar conta por número         ");
		System.out.println("      4 -  Atualizar dados da conta        ");
		System.out.println("      5 -  Apagar conta                    ");
		System.out.println("      6 -  Sacar                           ");
		System.out.println("      7 -  Depositar                       ");
		System.out.println("      8 -  Transferir valor entre Contas   ");
		System.out.println("      0 -  Sair                            ");
		
		opcao = leia.nextInt();
		
		if (opcao == 0) { 	// Lê a opção escolhida . // Se a opção for 0, o programa finaliza
			
			System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco Ecosol - economia justa e solidária");
			sobre(); // Mostra informações sobre o sistema
			leia.close();
			System.exit(0); // Encerra o programa
		}
		
		
		// Verifica qual opção o usuário escolheu
		switch(opcao) {
		case 1:
	        System.out.println(Cores.TEXT_WHITE + "Criar nova conta\n\n");
	        break;
	    case 2:
	        System.out.println(Cores.TEXT_WHITE +"Listar todas as Contas\n\n");
	        break;
	    case 3:
	        System.out.println(Cores.TEXT_WHITE +"Consultar dados da Conta - por número\n\n");
	        break;
	    case 4:
	        System.out.println(Cores.TEXT_WHITE +"Atualizar dados da Conta\n\n");
	        break;
	    case 5:
	        System.out.println(Cores.TEXT_WHITE +"Apagar a Conta\n\n");
	        break;
	    case 6:
	        System.out.println(Cores.TEXT_WHITE +"Saque\n\n");
	        break;
	    case 7:
	        System.out.println(Cores.TEXT_WHITE +"Depósito\n\n");
	        break;
	    case 8:
	        System.out.println(Cores.TEXT_WHITE +"Transferência entre Contas\n\n");
	        break;
	    default:
	        System.out.println(Cores.TEXT_RED +"\nOpção Inválida!\n" +Cores.TEXT_RESET);   // Caso o usuário digite um número fora das opções
	        break;
	}
		}
		}
	// Informações sobre quem desenvolveu o projeto
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Carina Bentlin ");
			System.out.println("Generation Brasil - carinabentlin@gmail.com");
			System.out.println("github.com/carinabentlin");
			System.out.println("*********************************************************");
		
	}

	private static void sobre1() {
		// TODO Auto-generated method stub
		
	}

	private static int leia(Object nextInt) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Object NextInt() {
		// TODO Auto-generated method stub
		return null;
	}

}
