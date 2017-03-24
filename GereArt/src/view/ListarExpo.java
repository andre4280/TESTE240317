package view;

import java.util.Scanner;

import model.Exposicao;


public class ListarExpo extends Exposicao {
	

	public ListarExpo(int id, double preco, String nomeExpo, String dataInicio, String dataFim, String quantidadeVisitantes, int obrasPresentes, model.visitante visitante) {
		super(id, preco, nomeExpo, dataInicio, dataFim, quantidadeVisitantes, obrasPresentes, visitante);
		
	}

	private Scanner input;

	public void Listar(){
		
		
		int escolha=0;
		
		System.out.println("Deseja listar uma exposicao ou todas? 1 - Uma so | 2 - Todas ");
		escolha = input.nextInt();
		
		if ( escolha == 1 ){
			System.out.println("Insira o id da exposicao a listar");
			escolha = input.nextInt();
			if(escolha == getid()){
				System.out.println("Nome da exposicao " +nomeExpo);
				System.out.println("Preco da entrada " +preco);
				System.out.println("Data de inicio " +dataInicio);
				System.out.println("Data de finalizacao " +dataFim);
				System.out.println("Quantidade de obras presentes " +obrasPresentes);
			}
			else System.out.println("Erro!"); 
				
		}
		else if( escolha == 2){
			for( int i = 0; i > id; i++){
				System.out.println("Nome da exposicao " +nomeExpo);
				System.out.println("Preco da entrada " +preco);
				System.out.println("Data de inicio " +dataInicio);
				System.out.println("Data de finalizacao " +dataFim);
				System.out.println("Quantidade de obras presentes " +obrasPresentes);
				System.out.println("*****************************");				
			}
		}
		else System.out.println("Erro!");
		
	}

	
	
	
}
