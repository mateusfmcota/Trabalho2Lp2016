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

	public ArrayList<Vaga> listVaga() {
		return cvg.list();
	}

	public double delVaga(Vaga v) {
		return cvg.del(v);
		
	}

	public int getVaga(int i) {
		return cvg.getVaga(i);
	}

	public boolean altVaga(int x, int vg) {
		return cvg.altVagas(x,vg);
		
	}

	public ArrayList<Vaga> listVagaOc() {
		return cvg.listVagaOc();
	}

	public boolean addFunc(Funcionario f) {
		return cf.add(f);
		
	}

}
