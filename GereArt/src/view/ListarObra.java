package view;

import java.util.Scanner;

import model.Obra;



public class ListarObra extends Obra {

	public ListarObra ( int id, String nomeArtista, String nomeObra, String categoria, String tipo, int dataCriacao) {
		super(id, nomeArtista, nomeObra, categoria, tipo, dataCriacao);
		
	}
	
	
	private Scanner input;

	public void Listar(){
		
		
		int escolha=0;
		
		System.out.println("Deseja listar uma obra ou todas? 1 - Uma so | 2 - Todas ");
		escolha = input.nextInt();
		
		if ( escolha == 1 ){
			System.out.println("Insira o id da obra a listar");
			escolha = input.nextInt();
			if(escolha == getid()){
				System.out.println("Nome da obra " +nomeObra);
				System.out.println("Nome do artista " +nomeArtista);
				System.out.println("Categoria da obra" +categoria);
				System.out.println("Tipo da obra" +tipo);
				System.out.println("Data de criacao da obra" +dataCriacao);
			}
			else System.out.println("Erro!"); 
				
		}
		else if( escolha == 2){
			for( int i = 0; i > id; i++){
				System.out.println("Nome da obra " +nomeObra);
				System.out.println("Nome do artista " +nomeArtista);
				System.out.println("Categoria da obra" +categoria);
				System.out.println("Tipo da obra" +tipo);
				System.out.println("Data de criacao da obra" +dataCriacao);
				System.out.println("*****************************");				
			}
		}
		else System.out.println("Erro!");
		
	}

	
	
}
