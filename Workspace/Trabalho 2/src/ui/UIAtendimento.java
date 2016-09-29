package ui;

import java.util.ArrayList;
import java.util.Scanner;

import negocio.Sistema;
import negocio.Vaga;
import negocio.Veiculo.Automovel;
import negocio.Veiculo.Moto;
import negocio.Veiculo.Veiculo;

public class UIAtendimento {
	Scanner ent = new Scanner(System.in);
	private Sistema s;

	public UIAtendimento(Sistema s) {
		this.s = s;
		menu();
	}

	public void menu() {
		System.out.println("O que vocÍ deseja fazer?");
		System.out.println("1 - Adicionar um veiculo");
		System.out.println("2 - Remover um veiculo");
		System.out.println("3 - Listar Vagas");
		System.out.println("4 - Sair");

		int op = Integer.parseInt(ent.nextLine());
		while (op <= 0 || op > 4) {
			System.out.println("OpÁ„o invalida, digite novamente: ");
			op = Integer.parseInt(ent.nextLine());

		}
		if (op == 1) {
			addVeic();
		} else	if (op == 2) {
			delVaga();
		} else	if (op == 3) {
			listVagas(0);
		} else	if (op == 4) {
			UIPrincipal.main(null);
		}

		menu();

	}

	private Vaga listVagas(int x) {
		ArrayList<Vaga> vagas = new ArrayList<Vaga>();
		vagas = s.listVaga();
		System.out.println("\n----------------------------");
		for (int i = 0; i < vagas.size(); i++) {
			System.out.println(i + "   " + vagas.get(i).toString());
		}
		System.out.println("----------------------------\n");
		
		if (x == -1) {
			System.out.println("Qual Vaga voce deseja: ");
			int y = Integer.parseInt(ent.nextLine());
			
			while (y<0 || y>vagas.size()-1) {
				System.out.println("Valor invalido, digite novamente: ");
				y = Integer.parseInt(ent.nextLine());
			}
			
			return vagas.get(y);
		} else
			return null;
	}

	private void delVaga() {
		System.out.println("Escolha a vaga a ser removida: ");
		Vaga v = listVagas(-1);
		double valor = s.delVaga(v);
		if(valor != 0){
			System.out.println("Vaga removida com sucesso");
		}else{
			System.out.println("Falha ao remover a vaga");
		}
	}

	private void addVeic() {
		System.out.println("O veiculo ja foi cadastrado? ");
		System.out.println("1- N„o");
		System.out.println("2- Sim");
		int x = Integer.parseInt(ent.nextLine());
		Veiculo v = null;
		if (x == 1) {
			 v= cadastroVeic();
		} else if (x == 2) {
			v = listVeic(-1);
		}
		
		if(s.addVaga(new Vaga(v)))
			System.out.println("Vaga Adicionada com sucesso");
		else
			System.out.println("Vaga n„o adicionada");
		

	}

	private Veiculo listVeic(int x) {
		ArrayList<Veiculo> veic = new ArrayList<Veiculo>();
		veic = s.listVeic();
		System.out.println("\n----------------------------");
		for (int i = 0; i < veic.size(); i++) {
			System.out.println(i + "   " + veic.get(i).toString());
		}
		System.out.println("----------------------------\n");

		if (x == -1) {
			System.out.println("Qual Veiculo voce deseja: ");
			int y = Integer.parseInt(ent.nextLine());
			
			while (y<0 || y>veic.size()-1) {
				System.out.println("Valor invalido, digite novamente: ");
				y = Integer.parseInt(ent.nextLine());
			}
			
			return veic.get(y);
		} else
			return null;
	}

	private Veiculo cadastroVeic() {
		System.out.println("O veiculo È: ");
		System.out.println("1- Automovel");
		System.out.println("2- Moto");
		int x = Integer.parseInt(ent.nextLine());
		if (x == 1)
			return cadastroAuto();
		else if (x == 2)
			return cadastroMoto();
		return null;
	}

	private Veiculo cadastroMoto() {
		System.out.println("Digite a placa do ve√≠culo: ");
		String placa = ent.nextLine();
		System.out.println("Digite o modelo do ve√≠culo: ");
		String modelo = ent.nextLine();
		System.out.println("Digite a cor do ve√≠culo: ");
		String cor = ent.nextLine();
		System.out.println("Digite a marca do ve√≠culo: ");
		String marca = ent.nextLine();
		Veiculo v = new Moto(placa, modelo, cor, marca);
		s.addVeic(v);
		return v;
	}

	private Veiculo cadastroAuto() {
		System.out.println("Digite a placa do ve√≠culo: ");
		String placa = ent.nextLine();
		System.out.println("Digite o modelo do ve√≠culo: ");
		String modelo = ent.nextLine();
		System.out.println("Digite a cor do ve√≠culo: ");
		String cor = ent.nextLine();
		System.out.println("Digite a marca do ve√≠culo: ");
		String marca = ent.nextLine();
		Veiculo v = new Automovel(placa, modelo, cor, marca);
		if(s.addVeic(v)){
			return v;	
		}else{
			return null;
		}
		
	}

}
