public class AdicionarAoCarrinho {
    private Comprar compra;

    public AdicionarAoCarrinho(Comprar compra) {
        this.compra = compra;
    }

    public void executar(int idGame) {
        Game game = ListaGames.buscarJogoPorID(idGame);
        if (game != null) {
            compra.adicionarAoCarrinho(game);
            System.out.println("Jogo adicionado ao carrinho com sucesso!");
        } else {
            System.out.println("Jogo não encontrado. Verifique o ID e tente novamente.");
        }
    }
}
