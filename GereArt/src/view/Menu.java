package view;

import java.util.Scanner;

import controller.Logistica;
import controller.adicionarExposicao;
import controller.adicionarObra;


public class Menu {

	private Scanner escolha;

	public Menu(){
		
		escolha = new Scanner(System.in);
		int opc = escolha.nextInt();
		
		
		System.out.println("MENU");
		System.out.println("1- Adicionar Exposicao");
		System.out.println("2- Adicionar Obra");
		System.out.println("3- Listar Exposicao");
		System.out.println("4- Listar Obra");
		System.out.println("5- Logistica administrativa");
		System.out.println("6- Sair");
		opc = escolha.nextInt();
			
		switch(opc){
		case 1:
			new Expo(opc, opc, null, null, null, null, opc, null, null);
			break;
			
		case 2:
			new Obras();
			break;
		
		case 3:
			new ListarExpo(opc, opc, null, null, null, null, opc, null);
			break;
			
		case 4:
			new ListarObra(opc, null, null, null, null, opc);
			break;
			
		case 5:
			new Logistica();
			break;
			
		case 6:
			return;
			
		default:
			System.out.println("Opcao invalida!");
		
		}
		
	}
	
	
	
	
	
	
	}
	
	
	