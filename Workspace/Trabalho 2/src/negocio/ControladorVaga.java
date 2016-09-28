package negocio;

import dados.RepoVaga;

public class ControladorVaga {
	
	private RepoVaga rv = new RepoVaga();
		
	public boolean add(Vaga vaga) {
		return rv.add(vaga);
	}

}
