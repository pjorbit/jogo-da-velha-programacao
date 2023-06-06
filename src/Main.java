public class Main {
    public static char[][] tabuleiro;
    public static String[] jogadores;
    public static char jogadorAtual;
    public static boolean jogoAcabou;

    //controla o fluxo
    public static void main(String[] args) {
        Inicio.iniciarJogo();
        while (!jogoAcabou) {
            Tabuleiro.exibirTabuleiro();
            Jogada.fazerJogada();
            verificarFimDeJogo();
            trocarJogador();
            if (Inicio.modo == 1 && !jogoAcabou) {
                Maquina.jogadaMaquina();
                verificarFimDeJogo();
                trocarJogador();
            }
        }
        Tabuleiro.exibirTabuleiro();
        exibirVencedor();
    }

    private static void verificarFimDeJogo() {
        // Verifica as linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                jogoAcabou = true;
                return;
            }
        }
        // Verifica as colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                jogoAcabou = true;
                return;
            }
        }
        // Verifica as diagonais
        if ((tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
            jogoAcabou = true;
        }
    }

    public static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    private static void exibirVencedor() {
        System.out.println(jogadores[(jogadorAtual == 'X' ? 1 : 0)] + " venceu!");
    }
}
