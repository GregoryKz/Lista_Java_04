package dev_klaus.lista04;

/*
 * Faça um programa que solicite um número e verifique se ele é positivo, negativo ou zero.
 * Feito por Klaus
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio037_VerificaSinalNumero {

    public static String verificarSinal(double numero) {
        if (numero > 0) return "positivo";
        else if (numero < 0) return "negativo";
        else return "zero";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();

            String resultado = verificarSinal(numero);
            System.out.println("O número é " + resultado + ".");

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        }
    }
}
