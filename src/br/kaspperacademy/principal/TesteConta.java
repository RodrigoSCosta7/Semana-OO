package br.kaspperacademy.principal;

import br.kaspperacademy.entidades.Conta;

public class TesteConta {
    public static void main(String[] args) {
        // INSTANCIANDO UM OBJETO
        Conta c1 = new Conta();
        c1.titular = "Bill Gates";
        c1.numeroConta = "95972000XP";
        c1.saldo = 100000.00;

        System.out.println(c1.titular);
        System.out.println(c1.numeroConta);
        System.out.println(c1.saldo);

        // Utilizando o metodo construtor
        Conta c2 = new Conta("Elon Musk", "95871000XP", 150000.00);
        System.out.println(c2.titular);
        System.out.println(c2.numeroConta);
        System.out.println(c2.saldo);

        // Utilizando metodo para imprimir
        c2.imprimirDadosBancarios();
        c2.depositar(50000.00);
        System.out.println("Saldo depois do deposito "+c2.mostrarSaldo());
        c2.sacar(25000.00);
        System.out.println("Saldo apos o saque " + c2.mostrarSaldo());
        
    }

}
