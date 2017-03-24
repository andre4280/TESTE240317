package controller;

import model.Exposicao;
import model.visitante;


import java.util.ArrayList;
import java.util.Scanner;

public class adicionarExposicao  {

	ArrayList<Exposicao> arExpo;

	
	
	public adicionarExposicao(){
		this.arExpo = new ArrayList<Exposicao>();
	}
	
		public void addExpo (int id, double preco, String nomeExpo, String dataInicio, String dataFim, String quantidadeVisitantes, int obrasPresentes, visitante visitante, Exposicao Exposicao ){
			Exposicao expo = new Exposicao (id, preco, nomeExpo, dataInicio, dataFim, quantidadeVisitantes, obrasPresentes, visitante);
			int novoId = arExpo.size();
			
			expo.setid(novoId);
			
			arExpo.add(expo);
		}
		
		public Exposicao getExposicao(int id){
			
			for( Exposicao expo : arExpo){
				if(expo.getid() == id){
					return expo;
				}
			}
			return null;
		}
		
	
		
	
		
	
	
}
