package dados;

import java.util.ArrayList;
import java.util.Date;

import negocio.Vaga;

public class RepoVaga {
	private ArrayList<Vaga> vagas = new ArrayList<Vaga>();
	private ArrayList<Vaga> vagasHist = new ArrayList<Vaga>();
	
	public boolean add(Vaga vaga) {
		if(vaga != null || vaga.getVeic() != null){
			vagas.add(vaga);
			return true;
		}
		
		return false;
	}

	public ArrayList<Vaga> list() {
		ArrayList<Vaga> clone = new ArrayList<Vaga>();
		clone.addAll(vagas);
		return clone;
	}

	public double del(Vaga v) {
		for (int i = 0; i < vagas.size(); i++) {
			if(v.equals(vagas.get(i))){
				vagas.get(i).setSaida(new Date());
				vagasHist.add(vagas.get(i));
				vagas.remove(i);
				//calcula o valor da tarifa
				return 50;
			}
		}
		return 0;
	}

}
