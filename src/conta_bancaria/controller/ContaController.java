package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.List;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	private List<Conta> listaContas = new ArrayList<Conta>();
	static int numero = 0;  //serve para controlar o número das contas

	
	//listar
	@Override
	public void listarTodas() {
		for(var conta : listaContas ) {
			conta.visualizar();
		}
		
	}
    //cadastrar 
	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nConta cadastrada com sucesso!");
		
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarconta = buscarNaCollection(conta.getNumero());
		
		if(buscarconta != null) {
			listaContas.set(listaContas.indexOf(buscarconta), conta);
		}else {
			System.out.printf("\nA conta número: %d foi atualizada com sucesso!%n", conta.getNumero());
		
			System.out.printf("\nA conta número: %d não foi encontrada!%n", conta.getNumero());
	}
	}

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			conta.visualizar();
		}else {
			System.out.printf("\nA conta número: %d não foi encontrada!%n", numero);
		}
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if(listaContas.remove(conta) == true) {
				System.out.printf("\nA conta número: %d foi deletada com sucesso!%n", numero);
							}
		}else {
			System.out.printf("\nA conta número: %d não foi encontrada!%n", numero);
		}
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}

	//Métodos auxiliares
	
	public static int gerarNumero() {
		return ++ numero;
		
	}
	
	public Conta buscarNaCollection(int numero) {
		for(var conta : listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
				
			}
		}
		return null;
	}
	
}
