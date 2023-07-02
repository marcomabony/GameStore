import java.util.ArrayList;
import java.util.List;

public class Comprar {
    private List<Game> carrinho;

    public Comprar() {
        carrinho = new ArrayList<>();
    }

    public void adicionarAoCarrinho(Game game) {
        carrinho.add(game);
    }

    public void visualizarCarrinho() {
        if (carrinho.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Carrinho de compras:");

            for (Game game : carrinho) {
                System.out.println(game.toString());
            }
        }
    }

    public void finalizarCompra() {
        if (carrinho.isEmpty()) {
            System.out.println("O carrinho está vazio. Não é possível finalizar a compra.");
        } else {
            System.out.println("Compra finalizada. Obrigado pela compra!");
            carrinho.clear();
        }
    }
}
