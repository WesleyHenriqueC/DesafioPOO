public class Carta {
    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }
    private Naipe naipe;
    private Valor valor;

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                " naipe=" + naipe +
                '}';
    }
}
