package controller;

import model.Obra;

import java.util.ArrayList;


public class adicionarObra {

	ArrayList<Obra> arObra;
	
	public adicionarObra(){
		this.arObra = new ArrayList<Obra>();		
	}	
	
	
		public void addObra(int id, String nomeArtista, String nomeObra, String categoria, String tipo, int dataCriacao){
			Obra o = new Obra ( id, nomeArtista, nomeObra, categoria, tipo, dataCriacao);
			int novoId = arObra.size();
			
			o.setid(novoId);
			
			arObra.add(o);
			}
		
		
		public Obra getObra(int id){
			
			for(Obra o : arObra){
				if(o.getid() == id){
					return o;
				}
			}
			return null;			
		}
		
		
		
		
		
		}

	
	
	

