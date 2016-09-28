package negocio;

import java.util.ArrayList;

import dados.RepoVeiculo;
import negocio.Veiculo.Veiculo;

public class ControladorVeiculo {
	RepoVeiculo rv = new RepoVeiculo();
	
	public ArrayList<Veiculo> list() {
		return rv.list();
	}

	public boolean add(Veiculo v) {
		return rv.add(v);
		
	}

}
