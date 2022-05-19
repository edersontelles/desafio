/**
 * 
 */
package Desafio1.v4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ederson
 *
 */
public class Quarto extends Check{
	
	int qntQuarto;
	
	ArrayList<String>  quartoNomes = new ArrayList<>();
	ArrayList<String>  quartoPosicao = new ArrayList<>();
	//ArrayList<Boolean> quartoFumante = new ArrayList<>();
	ArrayList<Float> quartoValorDiaria = new ArrayList<>();
	ArrayList<Integer> quartoPessoaPorQuarto = new ArrayList<>();
	
	Scanner teclado = new Scanner(System.in);
	
	public void cadastarQuarto() {
		
		String nome, posicao;
		boolean fumante;
		float valorDiaria;
		int pessoaPorQuarto;
		/*
		System.out.println("Nome: ");
		nome = teclado.next();
		System.out.println("Posi��o: ");
		posicao = teclado.next();
		System.out.println("Fumante: ");
		fumante = teclado.nextBoolean();
		System.out.println("Valor Diaria: ");
		valorDiaria = teclado.nextInt();
		System.out.println("Pessoa por quarto: ");
		pessoaPorQuarto = teclado.nextInt();
		
		quartoNomes.add(nome);
		quartoPosicao.add(posicao);
		quartoValorDiaria.add((float) valorDiaria);
		quartoPessoaPorQuarto.add(pessoaPorQuarto);
		quartoFumante.add(fumante);
		super.quartoOcupado.add(false); // Quarto livre
			*/	
		quartoNomes.add("AAA");
		quartoPosicao.add("Sul");
		//quartoFumante.add(false);
		quartoValorDiaria.add((float) 100);
		quartoPessoaPorQuarto.add(4);
		super.quartoFumante.add(false); //Quarto para N�o fumante
		super.quartoOcupado.add(true); // Quarto livre
		
		quartoNomes.add("BBB");
		quartoPosicao.add("Norte");
		//quartoFumante.add(true);
		quartoValorDiaria.add((float) 200);
		quartoPessoaPorQuarto.add(4);
		super.quartoFumante.add(true); //Quarto para fumante
		super.quartoOcupado.add(true); //Quarto livre
		
		quartoNomes.add("FFF");
		quartoPosicao.add("Leste");
		//quartoFumante.add(false);
		quartoValorDiaria.add((float) 300);
		quartoPessoaPorQuarto.add(1);
		super.quartoFumante.add(true); //Quarto para fumante
		super.quartoOcupado.add(true); //Quarto livre
		
	}
	
	public void listarQuartos() {
		
		System.out.println("\n--------- Quartos cadastrado -----------");
		for(int i = 0; i < quartoNomes.size(); i++) {
			if(quartoNomes.get(i) != null) {
			System.out.println("Nome: " + quartoNomes.get(i));
			System.out.println("Posi��o: " + quartoPosicao.get(i));
			System.out.println("Fumante: " + converteSimNao(quartoFumante.get(i)));
			System.out.println("Valor Diaria: " + quartoValorDiaria.get(i));
			System.out.println("Quantidade de pessoa(s): " + quartoPessoaPorQuarto.get(i));
			System.out.println("----------------------------------------");
			}
		}
		for(int i = 0; i < super.quartoFumante.size(); i++) {
			if(super.quartoFumante.get(i) != null)
			System.out.println("Quarto " + quartoNomes.get(i) + " fumante: " + converteSimNao(quartoFumante.get(i)) + " | dispon�vel: " + converteSimNao(quartoOcupado.get(i)));
		}
		System.out.println("----------------------------------------");
	}
	
	public void listarQuartosDisponibilidade() {
		System.out.println("\n-------- Quarto(s) disponivel ----------");
		
		if(quartoFumante.size() == 0 ) {
			System.out.println("\n...............................");
			System.out.println("N�O H� QUARTO CADASTRADO!");
			System.out.println("...............................");
		}
		
		for(int i = 0; i < super.quartoFumante.size(); i++) {
			if(super.quartoFumante.get(i) != null)
			System.out.println("Quarto " + quartoNomes.get(i) + " fumante: " + converteSimNao(quartoFumante.get(i)) + " | dispon�vel: " + converteSimNao(quartoOcupado.get(i)));
		}
		System.out.println("----------------------------------------");
	}
	
	public void excluirQuarto() {
		
		int posicaoRemover;
		
		System.out.println("\n*******************************");
		System.out.println("******** EXCLUIR QUARTO *******");
		for(int i = 0; i < quartoNomes.size(); i++) {
			if(quartoNomes.get(i) != null)
			System.out.println(i + " - " + quartoNomes.get(i));
		}
		System.out.print("Selecione N� do Quarto: ");
		posicaoRemover = teclado.nextInt();
		
		quartoNomes.set(posicaoRemover, null);
		quartoPosicao.set(posicaoRemover, null);
		//quartoFumante.set(posicaoRemover, null);
		quartoValorDiaria.set(posicaoRemover, null);
		quartoPessoaPorQuarto.set(posicaoRemover, null);
		super.quartoFumante.set(posicaoRemover, null);
		super.quartoOcupado.set(posicaoRemover, null);
		
		if(quartoNomes.get(posicaoRemover) == null) {
			System.out.println("\n...............................");
			System.out.println("Quarto excluido com sucesso!");
			System.out.println("...............................");
		}else {
			System.out.println("\n...............................");
			System.out.println("Erro ao excluir Quarto!");
			System.out.println("...............................");
		}
	}
	
	public void editarQuarto() {
		
		int posicaoEditar;
		String nome, posicao, nomeEditado, posicaoEditado;
		boolean fumante, fumanteEditado;
		float valorDiaria, valorDiariaEditado;
		int pessoaPorQuarto, pessoaPorQuartoEditado;
		
		System.out.println("\n*******************************");
		System.out.println("******** EDITAR CLIENTE *******");
		for(int i = 0; i < quartoNomes.size(); i++) {
			System.out.println(i + " - " + quartoNomes.get(i));
		}
		System.out.print("Selecione N� do Cliente: ");
		posicaoEditar = teclado.nextInt();
		
		nome = quartoNomes.get(posicaoEditar);
		posicao = quartoPosicao.get(posicaoEditar);
		fumante = quartoFumante.get(posicaoEditar);
		valorDiaria = quartoValorDiaria.get(posicaoEditar);
		pessoaPorQuarto = quartoPessoaPorQuarto.get(posicaoEditar);
		/*
		System.out.println("Editar nome " + nome + " para: ");
		nomeEditado = teclado.next();
		System.out.println("Editar posi��o de " + posicao + " para: ");
		posicaoEditado = teclado.next();
		System.out.println("Editar fumante de" + fumante + " para: ");
		fumanteEditado = teclado.nextBoolean();
		System.out.println("Editar valor da diaria de " + valorDiaria + " para: ");
		valorDiariaEditado = teclado.nextFloat();
		System.out.println("Editar n� de pessoa p/ quarto de" + pessoaPorQuarto + " para: ");
		pessoaPorQuartoEditado = teclado.nextInt();
		*/
		nomeEditado = "XXX";
		posicaoEditado = "Norte";
		fumanteEditado = true;
		valorDiariaEditado = 200;
		pessoaPorQuartoEditado = 1;
				
		quartoNomes.set(posicaoEditar, nomeEditado);
		quartoPosicao.set(posicaoEditar, posicaoEditado);
		quartoFumante.set(posicaoEditar, true);
		quartoValorDiaria.set(posicaoEditar, (float) 200);
		quartoPessoaPorQuarto.set(posicaoEditar, 1);
	}

}