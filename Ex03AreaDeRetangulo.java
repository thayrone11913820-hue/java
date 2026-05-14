package fundamentos;

import java.util.Scanner;

class CalcularAreaRetangulo {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a base
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        // Solicitar a altura
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        // Calcular a área ($base \times altura$)
        double area = base * altura;

        // Exibir o resultado
        System.out.println("A área do retângulo é: " + area);

        // Fechar o scanner
        scanner.close();
    }
}
