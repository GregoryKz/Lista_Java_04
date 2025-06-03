package dev_klaus.lista04;

/*
 * Faça um programa que solicite os comprimentos dos três lados de um triângulo e verifique se formam um triângulo válido.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio043_VerificaTrianguloValido {

    // Método para verificar se os lados formam um triângulo válido
    public static boolean isTrianguloValido(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o comprimento do lado 1: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Digite o comprimento do lado 2: ");
            double lado2 = scanner.nextDouble();

            System.out.print("Digite o comprimento do lado 3: ");
            double lado3 = scanner.nextDouble();

            if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
                System.out.println("Erro: Os lados devem ser maiores que zero.");
                return;
            }

            if (isTrianguloValido(lado1, lado2, lado3)) {
                System.out.println("Os lados formam um triângulo válido.");
            } else {
                System.out.println("Os lados NÃO formam um triângulo válido.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        }
    }
}
