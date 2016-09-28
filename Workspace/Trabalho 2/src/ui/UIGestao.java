package ui;

import java.util.Scanner;

import negocio.Sistema;

public class UIGestao {
	private Sistema s;

	public UIGestao(Sistema s) {
		this.s = s;
		menu();
	}

	public void menu() {
		Scanner ent = new Scanner(System.in);
				
		System.out.println("O que você deseja fazer? ");
		System.out.println("1 - Alterar a quantidade de vagas");
		System.out.println("2 - Alterar as tarifas");
		System.out.println("3 - Relatorios");
		System.out.println("4 - Sair");
		
		int op = Integer.parseInt(ent.nextLine());;
		while (op<= 0 || op>4){
			System.out.println("Opção invalida, digite novamente: ");
			op = Integer.parseInt(ent.nextLine());;
			
		}
		if(op == 1){
			
		}
		if(op == 2){
			
		}
		if(op == 3){
			
		}
		if(op == 4){
			UIPrincipal.main(null);
		}
		
	}
	
	

}
