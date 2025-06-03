package dev_klaus.lista04;

/*
 * Faça um programa que solicite uma letra e informe se ela é vogal ou consoante.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio042_VerificaVogalConsoante {

    // Método que verifica se o caractere é vogal
    public static boolean isVogal(char letra) {
        letra = Character.toLowerCase(letra); // normaliza para minúscula
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma letra: ");
            String entrada = scanner.nextLine().trim();

            // Verifica se a entrada tem exatamente 1 caractere e se é uma letra
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Erro: Por favor, digite uma única letra válida.");
                return;
            }

            char letra = entrada.charAt(0);

            if (isVogal(letra)) {
                System.out.println("A letra '" + letra + "' é uma vogal.");
            } else {
                System.out.println("A letra '" + letra + "' é uma consoante.");
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
