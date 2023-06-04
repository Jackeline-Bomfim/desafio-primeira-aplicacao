package br.com.aplicacao.primeiro.desafio.modelos;

public class ContaCorrente extends Conta{

    String tipo = "Conta Corrente";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
