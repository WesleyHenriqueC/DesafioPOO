import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        montar();
        embaralhar();
        exibir();
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    private void montar(){
        for (Valor valor: Valor.values()) {
            for (Naipe naipe: Naipe.values()) {
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    private void embaralhar(){
        Collections.shuffle(cartas);
    }

    private void exibir(){
        for(Carta s: cartas){
            System.out.println(s);
        }
    }
}
