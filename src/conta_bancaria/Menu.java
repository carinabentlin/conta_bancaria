package conta_bancaria;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);  //final por ser uma constante e nunca pode ser modificado e private para ser usado só na classe menu
	private static final ContaController contaController = new ContaController();
	public static void main(String[] args) {
		
		int opcao;
		
		criarContasTeste();
		
			
		while (true) { 
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
		       +           "===========================================");
		
		System.out.println("                                           ");
		System.out.println("           Banco Ecosol                    ");
		System.out.println("                                           ");
		System.out.println("===========================================");
		System.out.println("      1 -  Criar Conta                     ");  //esses metodos serao definidos dentro da interface
		System.out.println("      2 -  Listar todas as Contas          ");
		System.out.println("      3 -  Buscar conta por número         ");
		System.out.println("      4 -  Atualizar dados da conta        ");
		System.out.println("      5 -  Apagar conta                    ");
		System.out.println("      6 -  Sacar                           ");
		System.out.println("      7 -  Depositar                       ");
		System.out.println("      8 -  Transferir valor entre Contas   ");
		System.out.println("      0 -  Sair                            ");
		System.out.println("===========================================");
		System.out.println("      Digite a opção desejada              ");
		System.out.println("                                           ");
		
		//trycatch
		
		try {
		opcao = leia.nextInt();
		}catch(InputMismatchException e){
			opcao = -1;
			System.out.println("\nDigite um número inteiro entre 0 e 8");
			leia.nextLine();
			
		}
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
	        cadastrarConta();
	        keyPress();
	        break;
	    case 2:
	        System.out.println(Cores.TEXT_WHITE +"Listar todas as Contas\n\n");
	        listarContas();
	        keyPress();
	        break;
	    case 3:
	        System.out.println(Cores.TEXT_WHITE +"Consultar dados da Conta - por número\n\n");
	        procurarContaPorNumero();
	        keyPress();
	        break;
	    case 4:
	        System.out.println(Cores.TEXT_WHITE +"Atualizar dados da Conta\n\n");
	        
	        atualizarConta();
	        
	        keyPress();
	        break;
	    case 5:
	        System.out.println(Cores.TEXT_WHITE +"Apagar a Conta\n\n");
	        
	        deletarConta();
	        
	        keyPress();
	        break;
	    case 6:
	        System.out.println(Cores.TEXT_WHITE +"Saque\n\n");
	        keyPress();
	        break;
	    case 7:
	        System.out.println(Cores.TEXT_WHITE +"Depósito\n\n");
	        keyPress();
	        break;
	    case 8:
	        System.out.println(Cores.TEXT_WHITE +"Transferência entre Contas\n\n");
	        keyPress();
	        break;
	    default:
	        System.out.println(Cores.TEXT_RED +"\nOpção Inválida!\n" +Cores.TEXT_RESET);   // Caso o usuário digite um número fora das opções
	        keyPress();
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
		
		public static void keyPress() {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
			leia.nextLine();
		}

		private static void criarContasTeste() {
			contaController.cadastrar(new ContaCorrente(ContaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 10000.00f));
			contaController.cadastrar(new ContaPoupanca(ContaController.gerarNumero(), 456, 2, "Marcia Condarco", 100000.0f, 10));
		}
		private static void listarContas() {
			contaController.listarTodas();
		}
		
	private static void cadastrarConta() {
		System.out.print("Digite o número da Agência: ");
		int agencia = leia.nextInt();
				
		System.out.print("Digite o nome do titular: ");
		leia.skip("\\R");
		String titular = leia.nextLine();
		
		System.out.print("Digite o tipo da conta(1 - CC | 2 - CP): ");
		int tipo = leia.nextInt();
				
		System.out.print("Digite o saldo inicial: ");
		float saldo = leia.nextFloat();
		
		switch(tipo) {
		
		case 1 ->{
			System.out.print("Digite o limite inicial: ");
			float limite = leia.nextFloat();
			leia.nextLine();
			contaController.cadastrar(new ContaCorrente(ContaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
			
		}
		case 2 -> {
			System.out.print("Digite o dia do aniversario da conta: ");
			int aniversario = leia.nextInt();
			contaController.cadastrar(new ContaPoupanca(ContaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "tipo de conta inválido" + Cores.TEXT_RESET);
		}
		
	}

	private static void procurarContaPorNumero() {
		System.out.print("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		contaController.procurarPorNumero(numero);
	}
	
	private static void deletarConta() {
		System.out.print("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		Conta conta = contaController.buscarNaCollection(numero);
		
		if(conta != null) {
		
		System.out.print("\nTem certeza que deseja excluir esta conta? (S/N): ");
		String confirmacao = leia.nextLine();
		
		
		
		if(confirmacao.equalsIgnoreCase("S")) {
		contaController.deletar(numero);
	}else {
		System.out.println("\nOperação cancelada!");
	}
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
	
	
	private static void atualizarConta() {
		
	    System.out.print("Digite o número da conta: ");
		int numero = leia.nextInt();
		leia.nextLine();
		
		Conta conta = contaController.buscarNaCollection(numero);
		
		if(conta != null) {
			int agencia = conta.getAgencia();
			String titular = conta.getTitular();
			float saldo = conta.getSaldo();
			int tipo = conta.getTipo();
			
			//entradas
			
				System.out.printf("A Agência atual: %d\nNova Agência (Pressione Enter para manter): ", agencia);
				String entrada = leia.nextLine();
				agencia = entrada.isEmpty() ? agencia : Integer.parseInt(entrada);		
				
				System.out.printf("O nome do titular atual: %s\n Novo Titular: (Pressione Enter para manter): ", titular);
				entrada = leia.nextLine();
				titular = entrada.isEmpty() ? titular : entrada;		
				
										
				System.out.printf("O saldo atual: %.2f\nNovo Saldo (Pressione Enter para manter): ", saldo);
				entrada = leia.nextLine();
				saldo = entrada.isEmpty() ? saldo : Float.parseFloat(entrada.replace(',', '.'));	
				
				switch(tipo) {
				
				case 1 ->{
					float limite = ((ContaCorrente) conta).getLimite();
					System.out.printf("Limite atual: R$ %.2f\nNovo Limite (pressione enter para manter): ",limite);
					entrada = leia.nextLine();
					limite = entrada.isEmpty() ? limite : Float.parseFloat(entrada.replace(',', '.'));
					
					contaController.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					int aniversario = ((ContaPoupanca) conta).getdiaAniversario();
					
					System.out.printf("Aniversário atual: %d\nNovo Aniversário (pressione enter para manter): ",aniversario);
					entrada = leia.nextLine();
					aniversario = entrada.isEmpty() ? aniversario : Integer.parseInt(entrada);
					
					contaController.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
				}
				default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválido!" + Cores.TEXT_RESET);
				}
				
			
		}else {
			System.out.printf("\nA conta número %d não foi encontrada!", numero);
		}
	}
}
