package desafioEmpregado;

/*Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de instância – nome (String), cpf (String) e um salário mensal (double).

Na classe Empregado, construa dois métodos - salário anual (double) e aumento (void).

Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto.

Adicione um acréscimo de 10% ao salário e, em seguida, exiba novamente o salário anual do empregado.**/

public class Empregado {
    public String nome;
    public String cpf;
    public Double salarioMensal;

    // Construtor
    public Empregado(String nome, String cpf, Double salarioMensal) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
    }

    // Método para calcular o salário anual
    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para aplicar aumento de 10% no salário
    public void aplicarAumento() {
        salarioMensal *= 1.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
