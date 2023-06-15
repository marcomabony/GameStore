import java.util.Scanner;

public class GameStoreUI {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bem-vindo à GameStore!");

        boolean sair = false;
        while (!sair) {
            exibirMenuPrincipal();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    // Exibir lista de jogos
                    // ...
                    break;
                case 2:
                    // Adicionar jogo ao carrinho
                    // ...
                    break;
                case 3:
                    // Visualizar carrinho de compras
                    // ...
                    break;
                case 4:
                    // Finalizar compra
                    // ...
                    break;
                case 5:
                    // Inserir jogos na tabela Game
                    Game.inserirDados();
                    System.out.println("Jogo cadastrado com sucesso!!!");
                    break;
                case 6:
                    // Sair da loja
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        System.out.println("Obrigado por visitar a GameStore. Até logo!");
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\nOpções:");
        System.out.println("1. Exibir lista de jogos");
        System.out.println("2. Adicionar jogo ao carrinho");
        System.out.println("3. Visualizar carrinho de compras");
        System.out.println("4. Finalizar compra");
        System.out.println("5. Inserir dados na tabela Game");
        System.out.println("6. Sair");
    }

    private static int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}
