package br.kaspperacademy.principal;

import br.kaspperacademy.entidades.Cliente;
import br.kaspperacademy.entidades.Conta;

public class TesteConta {
    public static void main(String[] args) {
        // INSTANCIANDO UM OBJETO
        Conta c1 = new Conta();
        Cliente cli1 = new Cliente();
        cli1.setNome("Bill Gates");
        cli1.setCpf("458.223.225-64");
        c1.setTitular(cli1);
        c1.setNumeroConta("95972000XP");
        c1.depositar(10000.00);

        System.out.println(c1.getTitular().getNome());
        System.out.println(c1.getNumeroConta());
        System.out.println(c1.getSaldo());

        // Utilizando o metodo construtor
        Cliente cli2 = new Cliente();
        cli2.setNome("Musk");
        cli2.setCpf("554.558.632-65");
        Conta c2 = new Conta(cli2, "95871000XP", 150000.00);
        // c2.setTitular("Elon Musk");
        // c2.setNumeroConta("95871000XP");
        // c2.depositar(150000.00);

        System.out.println(c2.getTitular().getNome());
        System.out.println(c2.getNumeroConta());
        System.out.println(c2.getSaldo());

        // // Utilizando metodo para imprimir
        c2.imprimirDadosBancarios();
        // c2.depositar(50000.00);
        // System.out.println("Saldo depois do deposito "+c2.mostrarSaldo());
        // c2.sacar(25000.00);
        // System.out.println("Saldo apos o saque " + c2.mostrarSaldo());     
        
        
    }

}
