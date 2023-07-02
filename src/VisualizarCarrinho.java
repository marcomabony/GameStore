public class VisualizarCarrinho {
    private Comprar compra;

    public VisualizarCarrinho(Comprar compra) {
        this.compra = compra;
    }

    public void executar() {
        compra.visualizarCarrinho();
    }
}
