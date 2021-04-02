package br.com.erickfreire.contabancaria5;

import java.util.Scanner;

public class ContaBancaria5Teste {
	public static void main(String[] args) {
		ContaBancaria5 conta1 = new ContaBancaria5("Maria Oliveira", 50.00);
		ContaBancaria5 conta2 = new ContaBancaria5("Joao Silva", -7.53);
	
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor para deposito na conta 1: ");
		double deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando o valor: %.2f ao saldo da conta%n%n", deposito);
		conta1.deposito(deposito);
		
		conta1.mostraConta();
		conta2.mostraConta();
		
		System.out.print("Informe um valor para deposito na conta 2: ");
		deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando o valor: %.2f ao saldo da conta%n%n", deposito);
		conta2.deposito(deposito);
		
		conta1.mostraConta();
		conta2.mostraConta();

		System.out.print("Informe um valor para debito na conta 1: ");
		double debito = entrada.nextDouble();
		System.out.printf("%nRetirando o valor: %.2f ao saldo da conta%n%n", debito);
		conta1.debito(debito);
		
		conta1.mostraConta();
		conta2.mostraConta();
		
		System.out.print("Informe um valor para debito na conta 2: ");
		debito = entrada.nextDouble();
		System.out.printf("%nDebitando o valor: %.2f ao saldo da conta%n%n", debito);
		conta2.debito(debito);
		
		conta1.mostraConta();
		conta2.mostraConta();
	}
}
