package view;

import java.util.Scanner;

import controller.adicionarObra;

public class Obras extends adicionarObra{
	
	private Scanner input;
	
	public void obra(int id, String nomeArtista, String nomeObra, String categoria, String tipo, int dataCriacao){
		

		input = new Scanner(System.in);
		
		System.out.println("Insira o nome da obra");
		nomeObra = input.next();
		
		System.out.println("Insira o nome do artista");
		nomeArtista = input.next();
		
		System.out.println("Insira a categoria da obra");
		categoria = input.next();
		
		System.out.println("Insira o tipo de obra");
		tipo = input.next();
		
		System.out.println("Insira a data de criacao da obra");
		dataCriacao = input.nextInt();

	}
	
	

	
	
	
}
