package negocio;

public class Funcionario {
	private String usuario;
	private String senha;
	private int tipo;//0 gerencia 1 atendimento
	
	public Funcionario(String login, String senha, int i) {
		this.usuario = login;
		this.senha = senha;
		this.tipo = i;
	}

	public int getModulo() {
		return tipo;
	}

	public boolean login(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha))
			return true;
		else
			return false;
	}
	
}
