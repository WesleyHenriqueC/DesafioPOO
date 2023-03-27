public class Participante {
    private int valorEmMaos = 0;
    public static int rodada = 0;
    private boolean vencedor = true;

    public int getValorEmMaos() {
        return valorEmMaos;
    }

    public void setValorEmMaos(int valorEmMaos) {
        this.valorEmMaos = valorEmMaos;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }

    public void pegarCarta(Carta valor){
        System.out.println("Carta: " + valor.getValor() + ", Naipe: " + valor.getNaipe());
        if (valor.getValor() == Valor.As){
            valorEmMaos = valorEmMaos + 1;
        }
        if (valor.getValor() == Valor.Dois){
            valorEmMaos = valorEmMaos + 2;
        }
        if (valor.getValor() == Valor.Tres){
            valorEmMaos = valorEmMaos + 3;
        }
        if (valor.getValor() == Valor.Quatro){
            valorEmMaos = valorEmMaos + 4;
        }
        if (valor.getValor() == Valor.Cinco){
            valorEmMaos = valorEmMaos + 5;
        }
        if (valor.getValor() == Valor.Seis){
            valorEmMaos = valorEmMaos + 6;
        }
        if (valor.getValor() == Valor.Sete){
            valorEmMaos = valorEmMaos + 7;
        }
        if (valor.getValor() == Valor.Oito){
            valorEmMaos = valorEmMaos + 8;
        }
        if (valor.getValor() == Valor.Nove){
            valorEmMaos = valorEmMaos + 9;
        }
        if (valor.getValor() == Valor.Dez){
            valorEmMaos = valorEmMaos + 10;
        }
        if (valor.getValor() == Valor.Dama){
            valorEmMaos = valorEmMaos + 10;
        }
        if (valor.getValor() == Valor.Valete){
            valorEmMaos = valorEmMaos + 10;
        }
        if (valor.getValor() == Valor.Reis){
            valorEmMaos = valorEmMaos + 10;
        }
        rodada++;
    }
}
