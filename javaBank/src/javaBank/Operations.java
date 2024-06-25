package javaBank;

import java.util.Locale;
import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		 	Locale.setDefault(Locale.US);
	        Scanner entrada = new Scanner(System.in);
			

	        // String usuario = "Fabio";
	        double saldo = 0;
	        String extrato = "";
	        double limite = 500;
	        int limiteSaques = 3;
	        int numeroSaques = 0;


	        while (true) {
	            System.out.println("==========================");
	            System.out.println("Digite uma opção: ");
	            System.out.println("[d]-Deposito: ");
	            System.out.println("[s]-Saque: ");
	            System.out.println("[e]-Extrato: ");
	            System.out.println("[q]-Sair: ");
	            System.out.println("==========================");
	            String menu = entrada.nextLine();


	            if (menu.equals("d")) {
	                System.out.println("Informe o valor do deposito: R$");
	                double valor = entrada.nextDouble();
	                entrada.nextLine();


	                if (valor > 0) {
	                    saldo += valor;
	                    extrato = extrato + "Deposito de R$" + valor + "\n";
	                    System.out.printf("Deposito de R$ %.2f realizado %n", valor);
	                } else {
	                    System.err.println("Operação falhou! O valor informado é invalido");
	                }


	            } else if (menu.equals("s")) {
	                System.out.println("Informe o valor do saque: R$");
	                double valor = entrada.nextDouble();
	                entrada.nextLine();


	                boolean excedeuSaldo = valor > saldo;
	                boolean excedeuLimite = valor > limite;
	                boolean excedeuSaques = numeroSaques >= limiteSaques;


	                if (excedeuSaldo) {
	                    System.out.println("Operação falhou! Você não tem saldo suficiente!");
	                } else if (excedeuLimite) {
	                    System.out.println("Operação falhou! O valor excede o limite!");
	                } else if (excedeuSaques) {
	                    System.out.println("Operação falhou! Número máximo de saques excedido!");
	                } else if (valor > 0) {
	                    saldo -= valor;
	                    extrato = extrato + "saque de R$" + valor + "\n";
	                    numeroSaques += 1;
	                    System.out.printf("saque de R$ %.2f realizado %n", valor);
	                } else {
	                    System.err.println("Operação falhou! O valor informado é invalido");
	                }
	            } else if (menu.equals("e")) {
	                String mensagem = extrato.isEmpty() ? "Não foram realizadas movimentações" : extrato;
	                System.out.println("===== E X T R A T O =====");
	                System.err.println(mensagem);
	                System.out.println();
	                System.out.printf("SALDO: R$ %.2f", saldo);
	                System.out.println("=========================");
	            } else if (menu.equals("q")) {
	                System.out.println("Obrigado pela preferência !!!");
	                break;
	            } else {
	                System.out.println("Opção inválida, por favor selecione novamente a operação desejada");
	            }
	        }
	        entrada.close();


	    }

	}

