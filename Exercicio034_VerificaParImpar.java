package dev_klaus.lista04;

/*
 * Faça um programa que solicite um número inteiro e verifique se ele é par ou ímpar.
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio034_VerificaParImpar {

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (isPar(numero)) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        }
    }
}
