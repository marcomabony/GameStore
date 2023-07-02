import java.util.Scanner;

public class GameStoreUI {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bem-vindo à GameStore!");

        Login.fazerLogin();

        boolean sair = false;
        Comprar compra = new Comprar();
        AdicionarAoCarrinho adicionar = new AdicionarAoCarrinho(compra);
        VisualizarCarrinho visualizar = new VisualizarCarrinho(compra);
        FinalizarCompra finalizar = new FinalizarCompra(compra);

        while (!sair) {
            exibirMenuPrincipal();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    ListaGames.exibirListaDeJogos();
                    break;
                case 2:
                    if (Login.isFuncionario()) {
                        Game.inserirDados();
                        System.out.println("Jogo cadastrado com sucesso!!!");
                    } else {
                        adicionarJogoAoCarrinho(adicionar);
                    }
                    break;
                case 3:
                    if (Login.isFuncionario()) {
                        // Opção indisponível para funcionários
                        System.out.println("Opção indisponível para funcionários.");
                    } else {
                        visualizarCarrinho(visualizar);
                    }
                    break;
                case 4:
                    if (Login.isFuncionario()) {
                        // Opção indisponível para funcionários
                        System.out.println("Opção indisponível para funcionários.");
                    } else {
                        finalizar.finalizarCompra();
                    }
                    break;

                case 5:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        System.out.println("Obrigado por visitar a GameStore. Até logo!");
    }

    private static void exibirMenuPrincipal() {
        if (Login.isFuncionario()) {
            System.out.println("\nOpções (Funcionário):");
            System.out.println("1. Exibir lista de jogos no Estoque");
            System.out.println("2. Inserir Jogos no Estoque");
            System.out.println("3. Verificar Status da Compra");
            System.out.println("4. ");
            System.out.println("5. Sair");
        } else {
            System.out.println("\nOpções (Cliente):");
            System.out.println("1. Exibir lista de jogos no Estoque");
            System.out.println("2. Comprar Jogos na Game Store Unity Interactive");
            System.out.println("3. Verificar Carrinho");
            System.out.println("4. Finalizar Compra");
            System.out.println("5. Sair");
        }
    }

    private static int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private static void adicionarJogoAoCarrinho(AdicionarAoCarrinho adicionar) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do jogo que deseja adicionar ao carrinho: ");
        int idGame = scanner.nextInt();

        adicionar.executar(idGame);
    }

    private static void visualizarCarrinho(VisualizarCarrinho visualizar) {
        visualizar.executar();
    }
}
