package view;

import java.util.Scanner;

import model.Exposicao;
import model.visitante;
import controller.adicionarExposicao;

public class Expo extends adicionarExposicao{
	
	private Scanner input;

	public Expo(int id, double preco, String nomeExpo, String dataInicio, String dataFim, String quantidadeVisitantes, int obrasPresentes, visitante visitante, Exposicao Exposicao){

	
		input = new Scanner(System.in);
		
		System.out.println("Insira o nome da exposicao");
		nomeExpo = input.next();
		
		System.out.println("Insira o preco do bilhete");
		preco = input.nextDouble();
		
		System.out.println("Insira a data de inicio");
		dataInicio = input.next();
		
		System.out.println("Insira a data de encerramento");
		dataFim = input.next();
		
		System.out.println("Insira a quantidade de obras presentes");
		obrasPresentes = input.nextInt();

			
	
	
	}
}
