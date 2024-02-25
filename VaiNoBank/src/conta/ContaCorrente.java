package conta;

import exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(String numero, String agencia, String titular, String cpf, double limiteCredito) {
        super(numero, agencia, titular, cpf);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        extrato();
    }

    @Override
    public void saque(double valor) throws SaldoInsuficienteException {
        if (valor > saldo + limiteCredito) {
            throw new SaldoInsuficienteException();
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            extrato();
        }
    }
 }