package fundamentos;

import java.util.Scanner;

class calculodiferencaidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da primeira pessoa
        System.out.print("digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();

        // Limpar o buffer do scanner (necessário ao alternar de nextInt para nextLine)
        scanner.nextLine();

        // Entrada da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        // Cálculo da diferença absoluta
        int diferenca = Math.abs(idade1 - idade2);

        // Saida do resultado
        System.out.println("\n--- Resultado ---");
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");

        scanner.close();
    }
}
