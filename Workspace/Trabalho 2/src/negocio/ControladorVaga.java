package negocio;

import java.util.ArrayList;

import dados.RepoVaga;

public class ControladorVaga {
	
	private RepoVaga rv = new RepoVaga();
		
	public boolean add(Vaga vaga) {
		return rv.add(vaga);
	}

	public ArrayList<Vaga> list() {
		return rv.list();
	}

	public double del(Vaga v) {
		//calculo pra a quantidade de tempo
		double valor = rv.del(v);
		return valor;
	}

}
