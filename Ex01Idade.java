package fundamentos;

import java.util.Scanner;

public class Ex01Idade {
    static void main() {
        // Entrada de dados
        // Receba o nome e o ano de nacimento
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
       String nome  = scanner.nextLine();
       System.out.println("Digite seu ano de nacimento:");
       int anoNac = scanner.nextInt();

        //procesamento de dados
        int idade = anoNac = 2026 - anoNac;

        // saida de dados
        // emprima a mensagem "Ola, fulano! voce tem [idade] anos de idade"
        System.out.println("ola, "+ nome +", "+ idade);

    }
}
