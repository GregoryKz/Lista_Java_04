package dev_klaus.lista04;

/*
 * Faça um programa que solicite uma nota de 0 a 100 e informe se o aluno foi aprovado (nota >= 60) ou reprovado.
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio036_VerificaNota {

    public static boolean isAprovado(int nota) {
        return nota >= 60;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a nota (0 a 100): ");
            int nota = scanner.nextInt();

            if (nota < 0 || nota > 100) {
                System.out.println("Erro: A nota deve estar entre 0 e 100.");
                return;
            }

            if (isAprovado(nota)) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        }
    }
}
