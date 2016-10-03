package ui;

import java.util.ArrayList;
import java.util.Scanner;

import negocio.Funcionario;
import negocio.Sistema;
import negocio.Vaga;
import negocio.Veiculo.Veiculo;

public class UIGestao {
	private Sistema s;
	private Scanner ent = new Scanner(System.in);

	public UIGestao(Sistema s) {
		this.s = s;
		menu();
	}

	public void menu() {

		System.out.println("O que você deseja fazer? ");
		System.out.println("1 - Alterar a quantidade de vagas");
		System.out.println("2 - Alterar as tarifas");
		System.out.println("3 - Relatorios");
		System.out.println("4 - Adicionar funcionario");
		System.out.println("5 - Sair");

		int op = Integer.parseInt(ent.nextLine());
		;
		while (op <= 0 || op > 5) {
			System.out.println("Opção invalida, digite novamente: ");
			op = Integer.parseInt(ent.nextLine());
		}
		if (op == 1) {
			alterarVaga();
		}
		if (op == 2) {

		}
		if (op == 3) {
			relatMenu();
		}
		if (op == 4) {
			addFunc();
		}
		if (op == 5) {
			UIPrincipal.main(null);
		}

	}

	private void addFunc() {
		
		System.out.println("Novo Funcionario: ");
		System.out.print("Qual é o login do funcionario: ");
		String login = ent.nextLine();
		System.out.print("Qual é a senha do funcionario: ");
		String senha = ent.nextLine();
		System.out.println("O funcionario vai ser:");
		System.out.println("0- Gestor");
		System.out.println("1- Atendente");
		
		int i = Integer.parseInt(ent.nextLine());
		
		while (i<0 || i>1) {
			System.out.println("Opção invalida, digite novamente: ");
			i = Integer.parseInt(ent.nextLine());
		}
		
		Funcionario f = new Funcionario(login, senha, i);
		if(s.addFunc(f))
			System.out.println("Funcionario adicionado com sucesso");
		else
			System.out.println("Falha ao adicionar funcionario");
		
		menu();
		
	}

	private void relatMenu() {
		System.out.println("Você deseja qual relatorio? ");
		System.out.println("1- Veiculos");
		System.out.println("2- Vagas Ocupadas");
		System.out.println("3- Historico de Vagas");
		
		int op = Integer.parseInt(ent.nextLine());
		
		while (op<0 || op>3) {
			System.out.println("Valor invalido, digite novamente: ");
			op = Integer.parseInt(ent.nextLine());
			
		}
		
		if(op == 1)
			relatVeic();
		else if (op ==2)
			relatVgOc();
		else if (op == 3)
			relatHist();
		
	}

	private void relatHist() {
		ArrayList<Vaga> v = new ArrayList<Vaga>();
		v = s.listVagaOc();
		System.out.println("\n-------------------------");
		for (int i = 0; i < v.size(); i++) {
			v.get(i).toString();
		}
		System.out.println("-------------------------\n");
		menu();
		
	}

	private void relatVgOc() {
		ArrayList<Vaga> v = new ArrayList<Vaga>();
		v = s.listVaga();
		System.out.println("\n-------------------------");
		for (int i = 0; i < v.size(); i++) {
			v.get(i).toString();
		}
		System.out.println("-------------------------\n");
		menu();
	}

	private void relatVeic() {
		ArrayList<Veiculo> v = new ArrayList<Veiculo>();
		v = s.listVeic();
		System.out.println("\n-------------------------");
		for (int i = 0; i < v.size(); i++) {
			v.get(i).toString();
		}
		System.out.println("-------------------------\n");
		menu();
	}

	private void alterarVaga() {
		System.out.println("Você deseja alterar qual vaga? ");
		System.out.println("1 - Carro: " + s.getVaga(1));
		System.out.println("2 - Moto: " + s.getVaga(2));
		int x = Integer.parseInt(ent.nextLine());
		while (x != 1 || x != 2) {
			System.out.println("Valor invalido, Digite novamente :");
			x = Integer.parseInt(ent.nextLine());
		}
		int vg = 0;
		
		if(x == 1){
			System.out.println("Voce deseja alterar para quantas vagas? ");
			vg = Integer.parseInt(ent.nextLine());
			while (vg<0) {
				System.out.println("Valor invalido, Digite novamente :");
				vg = Integer.parseInt(ent.nextLine());
			}
		}
		if(x == 2){
			System.out.println("Voce deseja alterar para quantas vagas? ");
			vg = Integer.parseInt(ent.nextLine());
			while (vg<0) {
				System.out.println("Valor invalido, Digite novamente :");
				vg = Integer.parseInt(ent.nextLine());
			}
		}
		
		if(s.altVaga(x,vg))
			System.out.println("Vagas alteradas com sucesso");
		else
			System.out.println("Não foi possivel alterar as vagas");
		
		menu();
			

	}

}
