package negocio;

import java.util.ArrayList;

import negocio.Veiculo.Veiculo;

public class Sistema {
	
	private ControladorFuncionario cf = new ControladorFuncionario();
	private ControladorVeiculo cv = new ControladorVeiculo();
	private ControladorVaga cvg = new ControladorVaga();
	
	public Funcionario login(String user, String senha) {
		return cf.login(user,senha);
	}

	public ArrayList<Veiculo> listVeic() {
		return cv.list();
	}

	public boolean addVaga(Vaga vaga) {
		return cvg.add(vaga);
		
	}

	public boolean addVeic(Veiculo v) {
		return cv.add(v);
		
	}

}
