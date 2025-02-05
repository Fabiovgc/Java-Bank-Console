package javaBank;

import java.util.Locale;
import java.util.Scanner;

public class BankingApp {
	
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount(0, "", 500, 3, 0);

		Locale.setDefault(Locale.US);
	        Scanner entrada = new Scanner(System.in);


	        while (true) {
	            System.out.println("==========================");
	            System.out.println("Digite uma opção: ");
	            System.out.println("[1]-Deposito: ");
	            System.out.println("[2]-Saque: ");
	            System.out.println("[3]-Extrato: ");
	            System.out.println("[4]-Sair: ");
	            System.out.println("==========================");

	            String menu = entrada.nextLine();


	            if (menu.equals("1")) {
			bankAccount.deposito();

	            } else if (menu.equals("2")) {
			bankAccount.saque();
	                
	            } else if (menu.equals("3")) {
	                bankAccount.extrato();
	            } else if (menu.equals("4")) {
	                System.out.println("Obrigado pela preferência !!!");
	                break;
	            } else {
	                System.out.println("Opção inválida, por favor selecione novamente a operação desejada");
	            }
	        }

	        entrada.close();


	    }

	}

