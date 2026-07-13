import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {

    // 1. planeje o tabuleiro (array bidimensional)
    static char[][] tabuleiro = new char[3][3];

    // 3. Defina os jogadores
    static char jogador = 'X';
    static char computador = 'O';
    static char jogadorAtual = 'X';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        inicializarTabuleiro();

        // 6. Crie o loop principal do jogo
        while (true) {
            mostrarTabuleiro(tabuleiro);

            jogadaJogador();
            if (verificarVitoria(jogador)) break;
            if (verificarEmpate(tabuleiro)) break;

            jogadaComputador();
            if (verificarVitoria(computador)) break;
            if (verificarEmpate(tabuleiro)) break;
        }
    }

    // 9. Organize em métodos (Inicialização)
    public static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // 2. Monte uma função para desenhar o tabuleiro
    public static void mostrarTabuleiro(char[][] tab) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tab[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----------");
        }
        System.out.println();
    }

    // 4. Faça o jogador escolher posição
    public static void jogadaJogador() {
        int linha, coluna;
        while (true) {
            System.out.print("Digite a linha (0 a 2): ");
            linha = scanner.nextInt();
            System.out.print("Digite a coluna (0 a 2): ");
            coluna = scanner.nextInt();

            if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                if (tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogador;
                    System.out.println("Posição marcada!");
                    break;
                } else {
                    System.out.println("Posição deve estar vazia");
                }
            } else {
                System.out.println("Linha e coluna entre 0 e 2");
            }
        }
    }

    // 5. Faça a máquina jogar (Random)
    public static void jogadaComputador() {
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != ' ');

        tabuleiro[linha][coluna] = computador;
    }

    // 7. Verifique vitória (estrutura de condição)
    public static boolean verificarVitoria(char jog) {
        // Exemplo de verificação linha 0, 1 e 2
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != ' ' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                if (tabuleiro[i][0] == jog) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Resultado: " + (jog == 'X' ? "Você venceu!" : "Máquina venceu!"));
                    return true;
                }
            }
        }
        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] != ' ' && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                if (tabuleiro[0][j] == jog) {
                    mostrarTabuleiro(tabuleiro);
                    System.out.println("Resultado: " + (jog == 'X' ? "Você venceu!" : "Máquina venceu!"));
                    return true;
                }
            }
        }
        // Diagonal principal
        if (tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            if (tabuleiro[0][0] == jog) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Resultado: " + (jog == 'X' ? "Você venceu!" : "Máquina venceu!"));
                return true;
            }
        }
        // Diagonal secundária
        if (tabuleiro[0][2] != ' ' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            if (tabuleiro[0][2] == jog) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Resultado: " + (jog == 'X' ? "Você venceu!" : "Máquina venceu!"));
                return true;
            }
        }
        return false;
    }

    // 8. Verifique empate
    public static boolean verificarEmpate(char[][] tab) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[i][j] == ' ') {
                    return false;
                }
            }
        }
        mostrarTabuleiro(tabuleiro);
        System.out.println("Resultado: Empate!");
        return true;
    }
}
