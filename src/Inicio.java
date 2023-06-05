import java.util.Scanner;
public class Inicio {

    public static int modo;
    public static void iniciarJogo() {
        Main.tabuleiro = new char[3][3];
        Main.jogadores = new String[2];
        Main.jogoAcabou = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("JOGO DA VELHA!\n");

        System.out.println("ESCOLHA O MODO DE JOGO:");
        System.out.println("1 - Player vs Máquina");
        System.out.println("2 - Player vs Player");

        modo = scanner.nextInt();
        scanner.nextLine();

        if (modo == 1) {
            System.out.print("Digite o seu nome, por favor: ");
            Main.jogadores[0] = scanner.nextLine();
            Main.jogadores[1] = "Máquina";
        } else if (modo == 2) {
            System.out.print("Digite o nome do primeiro player: ");
            Main.jogadores[0] = scanner.nextLine();
            System.out.print("Digite o nome do segundo player: ");
            Main.jogadores[1] = scanner.nextLine();
        } else {
            iniciarJogo();
        }

        Main.jogadorAtual = 'X';
        System.out.println(Main.jogadores[0] + " começa o jogo. Você será o " + Main.jogadorAtual);
    }
}
