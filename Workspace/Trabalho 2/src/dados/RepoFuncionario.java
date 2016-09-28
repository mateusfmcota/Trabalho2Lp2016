package dados;

import java.util.ArrayList;

import negocio.Funcionario;

public class RepoFuncionario {

	private ArrayList<Funcionario> func = new ArrayList<Funcionario>();
	
	public RepoFuncionario(){
		func.add(new Funcionario("atendente", "123", 1));
		func.add(new Funcionario("gerente", "123", 0));
	}
	
	public Funcionario login(String user, String senha) {
		for (int i = 0; i < func.size(); i++) {
			if(func.get(i).login(user, senha))
				return func.get(i);
				
		}
		return null;
	}

}
