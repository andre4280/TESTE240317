package controller;

import model.Exposicao;

public class Logistica extends adicionarExposicao{
	
	
		
	public double getvisitante(Exposicao expo){
		
		int totalvisitantes = 0;
		for( int i =0 ; i<arExpo.size(); i++){
			expo = arExpo.get(i);
			
			int totalpreco = 0;
			for( int y=0; y < arExpo.size(); y++){
				
				totalpreco+=expo.getpreco();
			}
			totalpreco += totalvisitantes;
			
		}
		return 0;
	}	
	
	
	
	

}
