package estruturasdecontrole;

import java.util.Scanner;
class Ex01Tabuada {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");

        // Verifica se o usuário digitou um número inteiro
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            System.out.println("Tabuada do " + numero + ":");

            // Loop de 1 a 10 para gerar a tabuada
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Por favor, digite um número inteiro válido.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
