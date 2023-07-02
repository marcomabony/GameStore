public class FinalizarCompra {
    private Comprar compra;

    public FinalizarCompra(Comprar compra) {
        this.compra = compra;
    }

    public void finalizarCompra() {
        compra.finalizarCompra();
    }
}
