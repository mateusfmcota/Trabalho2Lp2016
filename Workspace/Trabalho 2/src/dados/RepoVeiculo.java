package dados;

import java.util.ArrayList;

import negocio.Veiculo.Automovel;
import negocio.Veiculo.Moto;
import negocio.Veiculo.Veiculo;

public class RepoVeiculo {
	
	private ArrayList<Veiculo> veic = new ArrayList<>();
	
	public RepoVeiculo(){
		veic.add(new Automovel("ABC-123", "Palio", "Preto", "Fiat"));
		veic.add(new Moto("ABC-456", "Shineray", "Azul", "Sei-la"));
	}

	public ArrayList<Veiculo> list() {
		ArrayList<Veiculo> clone = new ArrayList<Veiculo>();
		clone.addAll(veic);
		return clone;
	}

	public boolean add(Veiculo v) {
		if(veic.add(v)){
			return true;
		}
		return false;
	}

}
