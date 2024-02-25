package main;

import exception.SaldoInsuficienteException;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Conta> contas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    criarContaCorrente();
                    break;
                case "2":
                    criarContaPoupanca();
                    break;
                case "3":
                    realizarDeposito();
                    break;
                case "4":
                    realizarSaque();
                    break;
                case "5":
                    exibirTodasAsContas();
                    break;
                case "6":
                    buscarContaPorNumero();
                    break;
                case "7":
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Criar conta corrente");
        System.out.println("2. Criar conta poupança");
        System.out.println("3. Realizar depósito");
        System.out.println("4. Realizar saque");
        System.out.println("5. Ver todas as contas");
        System.out.println("6. Buscar conta pelo número");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarContaCorrente() {
        System.out.print("Número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Limite de crédito: ");
        double limiteCredito = Double.parseDouble(scanner.nextLine());
        contas.add(new ContaCorrente(numero, agencia, titular, cpf, limiteCredito));
        System.out.println("Conta corrente criada com sucesso.");
    }

    private static void criarContaPoupanca() {
        System.out.print("Número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Dia do aniversário da conta: ");
        int diaAniversario = Integer.parseInt(scanner.nextLine());
        contas.add(new ContaPoupanca(numero, agencia, titular, cpf, diaAniversario));
        System.out.println("Conta poupança criada com sucesso.");
    }

    private static void realizarDeposito() {
        System.out.print("Número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Valor do depósito: ");
        double valor = Double.parseDouble(scanner.nextLine());
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                conta.deposito(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    private static void realizarSaque() {
        System.out.print("Número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Valor do saque: ");
        double valor = Double.parseDouble(scanner.nextLine());
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                try {
                    conta.saque(valor);
                } catch (SaldoInsuficienteException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    private static void exibirTodasAsContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("--- Todas as Contas ---");
            for (Conta conta : contas) {
                System.out.println(conta);
            }
        }
    }

    private static void buscarContaPorNumero() {
        System.out.print("Número da conta: ");
        String numero = scanner.nextLine();
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                System.out.println("Conta encontrada:");
                System.out.println(conta);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }
}
