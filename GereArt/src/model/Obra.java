package model;

public class Obra {

		public int id;
		public String nomeArtista;
		public String nomeObra;
		public String categoria;
		public String tipo;
		public int dataCriacao;
		
		public Obra ( int id, String nomeArtista, String nomeObra, String categoria, String tipo, int dataCriacao){
			
			this.id = id;
			this.nomeArtista = nomeArtista;
			this.nomeObra = nomeObra;
			this.categoria = categoria;
			this.tipo = tipo;
			this.dataCriacao = dataCriacao;
		}
			
			 public int getid(){
				 return id;
			 }
			 	public void setid(int id){
			 		this.id = id;
			 	}
		
			 public String getnomeArtista() {
			        return nomeArtista;
			    }

			    public void setnomeArtista(String nomeArtista) {
			        this.nomeArtista = nomeArtista;
			    }
			
			public String getnomeObra(){
				return nomeObra;
			}
			
				public void setnomeObra(String nomeObra){
					this.nomeObra = nomeObra;
				}
			
			public String getcategoria(){
				return categoria;
			}
				public void setcategoria(String categoria){
					this.categoria = categoria;
				}
				
			public String gettipo(){
				return tipo;
			}
				public void settipo(String tipo){
					this.tipo = tipo;
				}
			
			public int getdataCriacao(){
				return dataCriacao;
			}
				public void setdataCriacao(int dataCriacao){
					this.dataCriacao = dataCriacao;
				}
		
				
	
	
}
