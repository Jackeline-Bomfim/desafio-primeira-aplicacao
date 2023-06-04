package br.com.aplicacao.primeiro.desafio.modelos;

import java.util.Scanner;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();

    //Getters e setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // funcionalidades

    public void mostraSaldo() {
        double saldoAtual = this.saldo;
        System.out.println("Seu saldo atual é: " + saldoAtual);
    }

    public void recebaValor() {
        System.out.println("Informar o valor a receber: ");
        Scanner receba = new Scanner(System.in);
        double valorReceber = receba.nextDouble();

        this.saldo += valorReceber;

        System.out.println("Saldo atualizado: " + this.saldo);
    }

    public void trasfereValor(){
        System.out.println("Informe o valor que deseja transferir: ");
        Scanner valorTrans = new Scanner(System.in);
        double valorTrans2 = valorTrans.nextDouble();

        if (valorTrans2 > this.saldo){
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        } else if (valorTrans2 < this.saldo){
            this.saldo -= valorTrans2;
            System.out.println("Transferência realizada, seu saldo agora é de: " + this.saldo);
        }
    }


}
