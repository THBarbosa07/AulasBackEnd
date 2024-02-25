package conta;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
	private double limiteCredito;

    public ContaPoupanca(String numero, String agencia, String titular, String cpf, int diaAniversario) {
        super(numero, agencia, titular, cpf);
        this.setDiaAniversario(diaAniversario);
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        extrato();
    }

    @Override
    public void saque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            double juros = valor * 0.02;
            saldo -= juros;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            System.out.println("Juros de R$ " + juros + " aplicados.");
            extrato();
        }
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
}