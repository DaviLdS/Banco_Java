package entidades;

public class ContaCorrente extends Conta {

	private Double limiteDeEmprestimo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, String titular, Double balanco, Double limiteDeEmprestimo) {
		super(numero, titular, balanco);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limiteDeEmprestimo) {
			balanco += quantia - 10.0;
		}
	}
	
	@Override
	public void retirada(double quantia) {
		super.retirada(quantia);
		balanco -= 2.0;
	}

}
