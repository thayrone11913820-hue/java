package estruturasdecontrole;

import java.util.Scanner;

public class Ex04DivisaoControlada {
}
class divisaoControlada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe o número inicial (divisor): ");
        int numeroInicial = scanner.nextInt();

        if (numeroInicial <= 1) {
            System.out.println("O número inicial deve ser maior que 1 para este teste.");
            return;
        }

        int numeroInformado;

        while (true) {
            System.out.print("informe um número para testar (ou o divisor para parar): ");
            numeroInformado = scanner.nextInt();


            if (numeroInicial % numeroInicial == 0) {
                System.out.println("O número " + numeroInformado +
                        " é divisível por " + numeroInicial + ". parando o programa.");
                break; // Encerra o loop
            } else {
                System.out.println("O número " + numeroInformado +
                        " não é divisível por " + numeroInicial + ". continue...");
            }
        }

        scanner.close();
    }
}

