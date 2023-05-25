package br.kaspperacademy.entidades;

public class Conta {
    private Cliente titular;
    private String numeroConta;
    private double saldo;
    

  

    // Metodo construtuor
    public Conta() {
    }

    // Metodo construtuor com parametros
    public Conta(Cliente titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        
    }

        // metodo sem retorno
    public void imprimirDadosBancarios (){
        System.out.println("Titular: " + this.titular.getNome() + " CPF:" + this.titular.getCpf());
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Saldo da conta: " + this.saldo);
    }

        // metodo com retorno
    
    public double mostrarSaldo(){
        return this.saldo;
    }   

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        this.saldo -= valor;
        
       
        return this.mostrarSaldo();
    }

    // get - Recupera um valor do metodo 
    // set - insere um valor no metodo 

    public Cliente getTitular(){
        return titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta (String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
}
