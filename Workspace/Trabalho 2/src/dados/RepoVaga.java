package dados;

import java.util.ArrayList;

import negocio.Vaga;

public class RepoVaga {
	private ArrayList<Vaga> vagas = new ArrayList<Vaga>();
	
	public boolean add(Vaga vaga) {
		if(vaga != null || vaga.getVeic() != null){
			vagas.add(vaga);
			return true;
		}
		
		return false;
	}

}
