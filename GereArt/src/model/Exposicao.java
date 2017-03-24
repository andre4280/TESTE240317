package model;

public class Exposicao {

	public int id;
	public String nomeExpo;
	public String dataInicio;
	public String dataFim;
	public String quantidadeVisitantes;
	public double preco;
	public int obrasPresentes;
	public visitante visitante;
	
	public Exposicao(int id, double preco, String nomeExpo, String dataInicio, String dataFim, String quantidadeVisitantes, int obrasPresentes, visitante visitante){
		this.id = id;
		this.preco = preco;
		this.nomeExpo = nomeExpo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.quantidadeVisitantes = quantidadeVisitantes;
		this.obrasPresentes = obrasPresentes;
		this.visitante = visitante;
	}
	
	public int getid(){
		return id;
	}
		public void setid(int id){
			this.id = id;
		}
		
	public double getpreco(){
		return preco;
	}
		public void setpreco(double preco){
			this.preco = preco;
		}
	
	public String getnomeExpo(){
		return nomeExpo;
	}
		public void setnomeExpo(String nomeExpo){
			this.nomeExpo = nomeExpo;
		}
		
	public String getdataInicio(){
		return dataInicio;
	}
		public void setdataInicio(String dataInicio){
			this.dataInicio = dataInicio;
		}
		
	public String getdataFim(){
		return dataFim;
	}
		public void setdataFim(String dataFim){
			this.dataFim = dataFim;
		}
	
	public String getquantidadeVisitantes(){
		return quantidadeVisitantes;
	}
		public void setquantidadeVisitantes(String quantidadeVisitantes){
			this.quantidadeVisitantes = quantidadeVisitantes;
		}
	
	public int getobrasPresentes(){
		return obrasPresentes;
	}
		public void setobrasPresentes(int obrasPresentes){
			this.obrasPresentes = obrasPresentes;
		}
	
	public visitante getvisitante(){
		return visitante;
	}
		public void setvisitante( visitante visitante){
			this.visitante = visitante;
		}
	
}
