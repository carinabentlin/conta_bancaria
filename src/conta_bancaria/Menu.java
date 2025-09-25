package conta_bancaria;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);  //final por ser uma constante e nunca pode ser modificado e private para ser usado s� na classe menu
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
		System.out.println("      3 -  Buscar conta por n�mero         ");
		System.out.println("      4 -  Atualizar dados da conta        ");
		System.out.println("      5 -  Apagar conta                    ");
		System.out.println("      6 -  Sacar                           ");
		System.out.println("      7 -  Depositar                       ");
		System.out.println("      8 -  Transferir valor entre Contas   ");
		System.out.println("      0 -  Sair                            ");
		System.out.println("===========================================");
		System.out.println("      Digite a op��o desejada              ");
		System.out.println("                                           ");
		
		//trycatch
		
		try {
		opcao = leia.nextInt();
		}catch(InputMismatchException e){
			opcao = -1;
			System.out.println("\nDigite um n�mero inteiro entre 0 e 8");
			leia.nextLine();
			
		}
		if (opcao == 0) { 	// L� a op��o escolhida . // Se a op��o for 0, o programa finaliza
			
			System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco Ecosol - economia justa e solid�ria");
			sobre(); // Mostra informa��es sobre o sistema
			leia.close();
			System.exit(0); // Encerra o programa
		}
		
		
		// Verifica qual op��o o usu�rio escolheu
		switch(opcao) {
		case 1:
	        System.out.println(Cores.TEXT_WHITE + "Criar nova conta\n\n");
	        keyPress();
	        break;
	    case 2:
	        System.out.println(Cores.TEXT_WHITE +"Listar todas as Contas\n\n");
	        listarContas();
	        keyPress();
	        break;
	    case 3:
	        System.out.println(Cores.TEXT_WHITE +"Consultar dados da Conta - por n�mero\n\n");
	        keyPress();
	        break;
	    case 4:
	        System.out.println(Cores.TEXT_WHITE +"Atualizar dados da Conta\n\n");
	        keyPress();
	        break;
	    case 5:
	        System.out.println(Cores.TEXT_WHITE +"Apagar a Conta\n\n");
	        keyPress();
	        break;
	    case 6:
	        System.out.println(Cores.TEXT_WHITE +"Saque\n\n");
	        keyPress();
	        break;
	    case 7:
	        System.out.println(Cores.TEXT_WHITE +"Dep�sito\n\n");
	        keyPress();
	        break;
	    case 8:
	        System.out.println(Cores.TEXT_WHITE +"Transfer�ncia entre Contas\n\n");
	        keyPress();
	        break;
	    default:
	        System.out.println(Cores.TEXT_RED +"\nOp��o Inv�lida!\n" +Cores.TEXT_RESET);   // Caso o usu�rio digite um n�mero fora das op��es
	        keyPress();
	        break;
	}
		}
		}
	// Informa��es sobre quem desenvolveu o projeto
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Carina Bentlin ");
			System.out.println("Generation Brasil - carinabentlin@gmail.com");
			System.out.println("github.com/carinabentlin");
			System.out.println("*********************************************************");
		
	}
		
		public static void keyPress() {
			System.out.println(Cores.TEXT_RESET + "\n\nPressiome Enter para continuar...");
			leia.nextLine();
		}

		private static void criarContasTeste() {
			contaController.cadastrar(new ContaCorrente(1, 456, 1, "Thuany Silva", 1000000.00f, 10000.00f));
			contaController.cadastrar(new ContaPoupanca(2, 123, 2, "Marcia Condarco", 100000.0f, 10));
		}
		private static void listarContas() {
			contaController.listarTodas();
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
