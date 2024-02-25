package conta;

import exception.SaldoInsuficienteException;

public abstract class Conta {
	    protected String numero;
	    protected String agencia;
	    protected String titular;
	    protected String cpf;
	    protected double saldo;

	    public Conta(String numero, String agencia, String titular, String cpf) {
	        this.numero = numero;
	        this.agencia = agencia;
	        this.titular = titular;
	        this.cpf = cpf;
	        this.saldo = 0;
	    }

	    public abstract void saque(double valor) throws SaldoInsuficienteException;

	    public abstract void deposito(double valor);

	    public void extrato() {
	        System.out.println("Extrato da conta " + numero + ":");
	        System.out.println("Saldo: R$ " + saldo);
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public void setNumero(String numero) {
	        this.numero = numero;
	    }

	    public String getAgencia() {
	        return agencia;
	    }

	    public void setAgencia(String agencia) {
	        this.agencia = agencia;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public void setTitular(String titular) {
	        this.titular = titular;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }
	}


