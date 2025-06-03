package dev_klaus.lista04;

/*
 * Faça um programa que solicite um número e verifique se ele está no intervalo de 10 a 20 (inclusive).
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio040_VerificaIntervalo {

    public static boolean estaNoIntervalo(int numero) {
        return numero >= 10 && numero <= 20;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (estaNoIntervalo(numero)) {
                System.out.println("O número está no intervalo de 10 a 20.");
            } else {
                System.out.println("O número não está no intervalo de 10 a 20.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        }
    }
}
