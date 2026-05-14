package estruturasdecontrole;

import java.util.Scanner;

class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("digite o primeiro número: ");
        int num1 = scanner.nextInt();


        int num2;
        while (true) {
            System.out.print("Digite o segundo número (deve ser maior que o primeiro): ");
            num2 = scanner.nextInt();
            if (num2 > num1) {
                break;
            }
            System.out.println("Erro: O segundo número precisa ser maior que o primeiro!");
        }

        int opcao;
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Apenas números PARES");
            System.out.println("2 - Apenas números ÍMPARES");
            System.out.print("Sua opção: ");
            opcao = scanner.nextInt();
            if (opcao == 1 || opcao == 2) {
                break;
            }
            System.out.println("Opcao invalida! escolha 1 ou 2.");
        }

        String tipo = (opcao == 1) ? "pares" : "impares";
        System.out.println("\numeros " + tipo + " no intervalo de " + num2 + " ate " + num1 + ":");

        for (int i = num2; i >= num1; i--) {
            if (opcao == 1 && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (opcao == 2 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Quebra de linha no fim
        scanner.close();
    }
}
