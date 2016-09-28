package negocio;

import dados.RepoFuncionario;

public class ControladorFuncionario {

	private RepoFuncionario rf = new RepoFuncionario();
		
	public Funcionario login(String user, String senha) {
		return rf.login(user,senha); 
	}

}
