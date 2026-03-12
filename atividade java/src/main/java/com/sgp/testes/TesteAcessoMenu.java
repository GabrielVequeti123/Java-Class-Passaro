package com.sgp.testes;

import java.util.Scanner;

import com.sgp.modelos.Passaro;
import com.sgp.util.Validacoes;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Passaro passaro = new Passaro("Teste", 20);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(passaro.toString());
                    break;
                case 2:
                    alterarNome(passaro, scanner);
                    break;
                case 3:
                    alterarIdade(passaro, scanner);
                    break;
                case 4:
                    pessoa.construirninho();
                    break;
                case 5:
                    alterarTamanho(passaro, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados da pessoa");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar idade");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar altura");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Passaro passaro, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            pessoa.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarIdade(Passaro passaro, Scanner scanner) {
        System.out.print("Digite a nova idade: ");
        try {
            int novaIdade = Integer.parseInt(scanner.nextLine());
            if (Validacoes.idadeValida(novaIdade)) {
                passaro.setIdade(novaIdade);
                System.out.println("Idade alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroIdade(novaIdade));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }

    public static void alterarTamanho(Passaro passaro, Scanner scanner) {
        System.out.print("Digite a nova altura (em metros, ex: 1.75): ");
        try {
            double novaTamanho = Double.parseDouble(scanner.nextLine());
            if (Validacoes.tamanhoValida(novaTamanho)) {
                passaro.setTamanho(novaTamanho);
                System.out.println("Tamanho alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroTamanho(novaTamanho));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido para o Tamanho!");
        }
    }

}