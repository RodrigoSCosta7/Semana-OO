package br.kaspperacademy.principal;

import java.util.Scanner;

public class TesteScan {
    public static void main(String[] args) {
        //Leitura do terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();
        System.out.println(numero);
    }
}
