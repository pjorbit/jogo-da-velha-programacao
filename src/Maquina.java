import java.util.Random;

public class Maquina {
    public static void jogadaMaquina() {
        Random random = new Random();
        int linha, coluna;

        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (Main.tabuleiro[linha][coluna] != '\0');

        System.out.println(Main.jogadores[1] + " está fazendo sua jogada...");
        System.out.println("Linha: " + (linha + 1));
        System.out.println("Coluna: " + (coluna + 1));

        Main.tabuleiro[linha][coluna] = Main.jogadorAtual;
    }
}
