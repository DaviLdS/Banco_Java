package entidades;

public class ContaPoupanca extends Conta {

	private Double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double balanco, Double rendimento) {
		super(numero, titular, balanco);
		this.rendimento = rendimento;
	}

	public Double getrendimento() {
		return rendimento;
	}

	public void setrendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	public void atualizarSaldo() {
		balanco += balanco * rendimento;
	}
	
	@Override
	public void retirada(double quantia) {
		balanco -= quantia;
	}
}