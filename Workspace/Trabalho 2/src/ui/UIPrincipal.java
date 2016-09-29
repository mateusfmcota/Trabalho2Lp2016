package ui;

import java.util.Scanner;

import negocio.Funcionario;
import negocio.Sistema;

public class UIPrincipal {
	static Scanner ent = new Scanner(System.in);
	private static Sistema s = new Sistema();

	public static void main(String[] args) {
		System.out.println("Para sair digite 0 como usuario:\n");
		System.out.print("Digite o usuario: ");
		String user = ent.nextLine();
		if (!user.equals("0")) {
			
			System.out.println("");
			System.out.print("Digite a senha: ");
			String senha = ent.nextLine();

			Funcionario f = s.login(user, senha);
			while (f == null) {
				System.out.println("Usuario invalido, logue novamente: ");

				System.out.print("Digite o usuario: ");
				user = ent.nextLine();

				System.out.println("Digite a senha: ");
				senha = ent.nextLine();
				f = s.login(user, senha);

			}
			if (f.getModulo() == 0) {
				UIGestao ug = new UIGestao(s);
			} else if (f.getModulo() == 1) {
				UIAtendimento ua = new UIAtendimento(s);
			}

		}
	}

}
