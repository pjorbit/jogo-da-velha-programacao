import java.util.Scanner;
import java.util.Random;
public class Inicio {

    public static int modo;
    public static void iniciarJogo() {
        Main.tabuleiro = new char[3][3];
        Main.jogadores = new String[2];
        Main.jogoAcabou = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("JOGO DA VELHA!\n");

        System.out.println("ESCOLHA O MODO DE JOGO:");
        System.out.println("1 - Jogador vs Máquina");
        System.out.println("2 - Jogador vs Jogador");

        modo = scanner.nextInt();
        scanner.nextLine();

        if (modo == 1) {
            System.out.println("Digite o nome do primeiro jogador: ");
            Main.jogadores[0] = scanner.nextLine();
            Main.jogadores[1] = "Máquina";
        } else if (modo == 2) {
            System.out.println("Digite o nome do primeiro jogador:");
            Main.jogadores[0] = scanner.nextLine();
            System.out.println("Digite o nome do segundo jogador:");
            Main.jogadores[1] = scanner.nextLine();
        } else {
            iniciarJogo();
        }

        Main.jogadorAtual = 'X';
        System.out.println(Main.jogadores[0] + " começa o jogo. Você será o " + Main.jogadorAtual);
    }
}
