package br.kaspperacademy.entidades;

public class Conta {
    public String titular;
    public String numeroConta;
    public Double saldo;

    // Metodo construtuor
    public Conta() {
    }

    // Metodo construtuor com parametros
    public Conta(String titular, String numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

        // metodo sem retorno
    public void imprimirDadosBancarios (){
        System.out.println("Titular: " + this.titular );
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Saldo da conta: " + this.saldo);
    }

        // metodo com retorno
    
    public Double mostrarSaldo(){
        return this.saldo;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public Double sacar(Double valor){
        this.saldo -= valor;
        return this.mostrarSaldo();
    }

}
