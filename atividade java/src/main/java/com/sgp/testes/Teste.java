package com.sgp.testes; // Declaração do pacote

import com.sgp.modelos.Passaro;

public class Teste { // Definição da classe Teste

    public static void main(String[] args) {
        // Testando o método com uma pessoa não inicializada
        Passaro passaroNula = null;
        imprimirPassaro(passaroNula);

        // Testando o método com uma pessoa inicializada
        Passaro passaro = new Passaro("Arara", 20);
        passaro.setTamanho(1.8);
        imprimirPassaro(passaro);

        // Testando o construtor com valores padrão
        Passaro passaroPadrao = new Passaro();
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirPassaro(passaroPadrao);

        // Testando construtor com altura
        Passaro passaroComAltura = new Passaro("Papagaio", 30, 1);
        System.out.println("\nTestando construtor com altura:");
        imprimirPassaro(passaroComAltura);

        // Acesso ao método público
        passaro.construirninho();

        // Acessando o atributo através do getter público
        System.out.println("Nome (público): " + passaro.getNome());

        // Modificando o atributo privado através do setter
        passaro.setNome("Piriquito");
        System.out.println("Nome modificado (setter): " + passaro.getNome());

        // Modificando a idade através do setter
        passaro.setIdade(35);
        System.out.println("Passaro após modificações: " + passaro.toString());
    }

    // Método estático para imprimir informações de uma pessoa
    public static void imprimirPassaro(Passaro passaro) {
        if (passaro == null) {
            System.out.println("Passaro não inicializada!");
            return;
        }
        System.out.println(passaro);
        passaro.saudacao();
    }
}