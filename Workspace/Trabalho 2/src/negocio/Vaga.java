package negocio;

import java.util.Date;

import negocio.Veiculo.Veiculo;

public class Vaga {
	private Veiculo v;
	private Date dtInicio;
	private Date dtSaida;
	
	public Vaga(Veiculo v) {
		this.v = v;
		this.dtInicio = new Date();
	}

	public void setSaida(Date d) {
		this.dtSaida = d;
		
	}

	public Date getDate() {
		return dtInicio;
	}

	public Veiculo getVeic() {
		return v;
	}
	

}
