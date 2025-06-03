package dev_klaus.lista04;

/*
 * Faça um programa que solicite um número e verifique se ele é divisível por 3 e por 5.
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio041_VerificaDivisibilidade {

    public static boolean isDivisivelPor3e5(int numero) {
        return numero % 3 == 0 && numero % 5 == 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (isDivisivelPor3e5(numero)) {
                System.out.println("O número é divisível por 3 e por 5.");
            } else {
                System.out.println("O número não é divisível por 3 e por 5.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        }
    }
}
