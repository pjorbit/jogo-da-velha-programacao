public class Tabuleiro {
    public static void exibirTabuleiro() {
        System.out.println("----1---2---3--");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+" ");
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(Main.tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}
