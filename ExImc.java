package estruturasdecontrole;

import java.util.Locale;
import java.util.Scanner;

class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();


        double imc = peso / (altura * altura);


        System.out.format("\nSeu IMC é: %.2f\n", imc);


        if (imc < 18.5) {
            System.out.println("classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("classificação: Peso normal (ideal)");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("classificação: Levemente acima do peso (Sobrepeso)");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("classificação: Obesidade Grau I");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("classificação: Obesidade Grau II (severa)");
        } else {
            System.out.println("classificação: Obesidade Grau III (mórbida)");
        }

        scanner.close();
    }
}
