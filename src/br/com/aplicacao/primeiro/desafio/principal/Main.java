package br.com.aplicacao.primeiro.desafio.principal;

import br.com.aplicacao.primeiro.desafio.modelos.Cliente;
import br.com.aplicacao.primeiro.desafio.modelos.ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente jackeline = new Cliente();
        jackeline.setNome("Jackeline Bomfim");

        ContaCorrente cc = new ContaCorrente();

        cc.setSaldo(2500.0);
        cc.setTitular(jackeline);

        System.out.println("Títular: " + cc.getTitular().getNome());
        System.out.println("Tipo de conta: " + cc.getTipo());
        System.out.println("Saldo: " + cc.getSaldo());

        int contator = 1;

        while (contator != 0){
            System.out.println(" _______________________ ");
            System.out.println("|       OPERAÇÕES       |");
            System.out.println("|                       |");
            System.out.println("| 1 - Consultar saldo.  |");
            System.out.println("| 2 - Receber valor.    |");
            System.out.println("| 3 - Transferir valor. |");
            System.out.println("| 4 - Sair.             |");
            System.out.println("|_______________________|");

            System.out.println("Digite a opção desejada: ");
            Scanner resposta = new Scanner(System.in);
            int resp = resposta.nextInt();

            if (resp == 1 ){
                cc.mostraSaldo();
            } else if (resp == 2) {
                cc.recebaValor();
            } else if ( resp == 3 ){
                cc.trasfereValor();
            } else if (resp == 4) {
                System.out.println("Obrigada por usar nossos serviços!");
                contator = 0;
            }

        }




    }
}