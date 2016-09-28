package negocio.Veiculo;

public abstract class Veiculo {
	private String placa,modelo,cor,marca;
	private static int geraCod;
	private int cod;

	@Override
	public String toString() {
		return placa+"   "+modelo+"   "+cor+"   "+marca;
	}

	public Veiculo(String placa, String modelo, String cor, String marca) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		cod = ++geraCod;
	}

}
