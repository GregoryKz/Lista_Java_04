package dev_klaus.lista04;

/*
 * Faça um programa que solicite a idade do usuário e verifique se ele é maior de idade (18 anos ou mais).
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio035_VerificaMaioridade {

    public static boolean isMaiorIdade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                System.out.println("Erro: Idade não pode ser negativa.");
                return;
            }

            if (isMaiorIdade(idade)) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        }
    }
}
