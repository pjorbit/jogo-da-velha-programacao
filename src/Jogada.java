import java.util.Scanner;

public class Jogada {
    public static void fazerJogada() {
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;

        System.out.println(Main.jogadores[(Main.jogadorAtual == 'X' ? 0 : 1)] + ", é sua vez.");
        System.out.println("Digite a linha (1-3):");
        linha = scanner.nextInt() - 1;
        System.out.println("Digite a coluna (1-3):");
        coluna = scanner.nextInt() - 1;

        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || Main.tabuleiro[linha][coluna] != '\0') {
            System.out.println("Jogada inválida. Tente novamente.");
            fazerJogada();
        } else {
            Main.tabuleiro[linha][coluna] = Main.jogadorAtual;
        }
    }
}
