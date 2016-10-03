package negocio;

import dados.RepoFuncionario;

public class ControladorFuncionario {

	private RepoFuncionario rf = new RepoFuncionario();
		
	public Funcionario login(String user, String senha) {
		return rf.login(user,senha); 
	}

	public boolean add(Funcionario f) {
		return rf.add(f);
	}

}
