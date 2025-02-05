package javaBank;

import java.util.Scanner;

public class BankAccount {

        Scanner entrada = new Scanner(System.in);

        // Properties

        private double saldo;
        private String extrato;
        private double limite;
        private int limiteSaques;
        private int numeroSaques;


        // Constructor

        public BankAccount(double saldo, String extrato, double limite, int limiteSaques, int numeroSaques){
                this.saldo = saldo;
                this.extrato = extrato;
                this.limite = limite;
                this.limiteSaques = limiteSaques;
                this.numeroSaques = numeroSaques;
        }

        
        // Getters and Setters

        public double getSaldo() {
                return saldo;
        }

        public void setSaldo(double saldo) {
                this.saldo = saldo;
        }

        public String getExtrato() {
                return extrato;
        }

        public void setExtrato(String extrato) {
                this.extrato = extrato;
        }

        public double getLimite() {
                return limite;
        }

        public void setLimite(double limite) {
                this.limite = limite;
        }

        public int getLimiteSaques() {
                return limiteSaques;
        }

        public void setLimiteSaques(int limiteSaques) {
                this.limiteSaques = limiteSaques;
        }

        public int getNumeroSaques() {
                return numeroSaques;
        }

        public void setNumeroSaques(int numeroSaques) {
                this.numeroSaques = numeroSaques;
        }

        

        
        
        public void deposito(){
                System.out.println("Informe o valor do deposito: R$");
                double valorDeposito = entrada.nextDouble();
                entrada.nextLine();
                
                
                if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        extrato = extrato + "Deposito de R$" + valorDeposito + "\n";
                        System.out.printf("Deposito de R$ %.2f realizado %n", valorDeposito);
                } else {
                        System.err.println("Operação falhou! O valor informado é invalido");
                }
        }


        public void saque(){
                // Testar se é preciso retornar algo neste metodo
                // Testar se é preciso alterar o nome da variavel valor para outra
                // Testar se todos os extratos anteriores estão sendo gravados

                System.out.println("Informe o valor do saque: R$");
                double valorSaque = entrada.nextDouble();
	        entrada.nextLine();


	        if (valorSaque > saldo) {
	                System.out.println("Operação falhou! Você não tem saldo suficiente!");
	        } else if (valorSaque > limite) {
	                System.out.println("Operação falhou! O valor excede o limite!");
	        } else if (numeroSaques >= limiteSaques) {
	                System.out.println("Operação falhou! Número máximo de saques excedido!");
	        } else if (valorSaque > 0) {
	                saldo -= valorSaque;
	                extrato = extrato + "saque de R$" + valorSaque + "\n";
	                numeroSaques += 1;
	                System.out.printf("saque de R$ %.2f realizado %n", valorSaque);
	        } else {
	                System.err.println("Operação falhou! O valor informado é invalido");
	        }
        }

        
        public void extrato(){
                String mensagem = extrato.isEmpty() ? "Não foram realizadas movimentações" : extrato;
	                System.out.println("===== E X T R A T O =====");
	                System.err.println(mensagem);
	                System.out.println();
	                System.out.println("SALDO: R$ " + saldo);
	                System.out.println("=========================");
        }

        

}