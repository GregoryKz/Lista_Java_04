package dev_klaus.lista04;

/*
 * Faça um programa que solicite um ano e verifique se ele é bissexto.
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio038_VerificaAnoBissexto {

    public static boolean isBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um ano: ");
            int ano = scanner.nextInt();

            if (ano <= 0) {
                System.out.println("Erro: Ano inválido.");
                return;
            }

            if (isBissexto(ano)) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido.");
        }
    }
}
