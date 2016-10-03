package dados;

import java.util.ArrayList;
import java.util.Date;

import negocio.Vaga;
import negocio.Veiculo.Automovel;
import negocio.Veiculo.Moto;

public class RepoVaga {
	private ArrayList<Vaga> vagas = new ArrayList<Vaga>();
	private ArrayList<Vaga> vagasHist = new ArrayList<Vaga>();
	private int limCarro = 10;
	private int limMoto = 10;
	private int totCarro = 0;
	private int totMoto = 0;
	
	public boolean add(Vaga vaga) {
		
			if(vaga.getVeic() instanceof Automovel && totCarro < limCarro){
				totCarro++;
				vagas.add(vaga);
				return true;
			}
			else if(vaga.getVeic() instanceof Moto && totMoto < limMoto){
				totMoto++;
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
				
				//calcula o valor
	
				if(v.getVeic() instanceof Automovel && totCarro < limCarro)
					totCarro--;
				
				else if(v.getVeic() instanceof Moto && totMoto < limMoto)
					totMoto--;
				
				return 50;
			}
		}
		return 0;
	}

	public int getVaga(int i) {
		if(i == 1)
			return totCarro;
		else if(i == 2)
			return totMoto;
		else
			return 0;
	}

	public boolean altVagas(int x, int vg) {
		if(x == 1){
			limCarro = vg;
			return true;
		}else if(x == 2){
			limMoto = vg;
			return true;
		}
		else
			return false;
	}

	public ArrayList<Vaga> listVagaOc() {
		ArrayList<Vaga> clone = new ArrayList<Vaga>();
		clone.addAll(vagasHist);
		return clone;
	}

}
