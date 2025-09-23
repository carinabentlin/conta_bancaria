package conta_bancaria;
import java.util.Scanner;
import conta.util.Cores;
import conta_bancaria.model.Conta;
public class Menu {

	public static void main(String[] args) {
		
		// Teste da Classe Conta
        Conta c1 = new Conta(1, 123, 1, "Carina Bentlin", 10000.0f);

        c1.visualizar();

        c1.setSaldo(15000.0f);
	    c1.setTitular("Osório");
		c1.visualizar();

        c1.sacar(12000.0f);
		c1.visualizar();

        c1.depositar(5000.0f);
		c1.visualizar();
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
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
		
		if (opcao == 0) {
			System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco Ecosol - economia justa e solidária");
			sobre();
			leia.close();
			System.exit(0);
		}
		
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
	        System.out.println(Cores.TEXT_RED +"\nOpção Inválida!\n" +Cores.TEXT_RESET);
	        break;
	}
		}
		}
		
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
