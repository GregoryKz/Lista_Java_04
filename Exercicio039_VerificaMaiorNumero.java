package dev_klaus.lista04;

/*
 * Faça um programa que solicite três números e informe qual é o maior.
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio039_VerificaMaiorNumero {

    public static int maiorNumero(int a, int b, int c) {
        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        return maior;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int n3 = scanner.nextInt();

            int maior = maiorNumero(n1, n2, n3);
            System.out.println("O maior número é: " + maior);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite números inteiros válidos.");
        }
    }
}
