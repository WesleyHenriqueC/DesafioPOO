import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        Scanner sc = new Scanner(System.in);

        List<Carta> jogo21 = baralho.getCartas();
        String resposta;

        Participante p1 = new Participante();
        System.out.println("\n");
        System.out.println("Jogo do 21");
        System.out.println("Jogador 1");
        System.out.println("Retire as cartas ate que seu valor em maos chegue perto de 21, mas nao ultrapasse");
        do{
            System.out.println("Pegar carta ? (s - sim / n - nao)");
            resposta = sc.nextLine();
            if(resposta.equals("s")){
                System.out.println("-------------------------------------");
                p1.pegarCarta(jogo21.get(Participante.rodada));
                System.out.println("valor em maos: " + p1.getValorEmMaos());
                System.out.println("-------------------------------------");
            }
        }while(resposta.equals("s") || p1.getValorEmMaos() == 0);

        System.out.println("\n");
        Participante p2 = new Participante();
        System.out.println("Jogador 2");
        System.out.println("Retire as cartas ate que seu valor em maos chegue perto de 21");
        do{
            System.out.println("Pegar carta ? (s - sim / n - nao)");
            resposta = sc.nextLine();
            if(resposta.equals("s")){
                System.out.println("-------------------------------------");
                p2.pegarCarta(jogo21.get(Participante.rodada));
                System.out.println(p2.getValorEmMaos());
                System.out.println("-------------------------------------");
            }
        }while(resposta.equals("s") || p2.getValorEmMaos() == 0);

        System.out.println("\n\n");
        if(p1.getValorEmMaos() > 21){
            System.out.println("! -- Jogador 1 estorou o limite -- !");
            p1.setVencedor(false);
        }
        if(p2.getValorEmMaos() > 21){
            System.out.println("! -- Jogador 2 estorou o limite -- !");
            p2.setVencedor(false);
        }

        //decidir vencedor do jogo
        System.out.println("\n");
        System.out.println("Decidindo vencedor:");
        System.out.println("O valor em maos do jogador 1 eh: " + p1.getValorEmMaos());
        System.out.println("O valor em maos do jogador 2 eh: " + p2.getValorEmMaos());
        if (p1.isVencedor()){
            if (p2.isVencedor()){
                if (p1.getValorEmMaos() > p2.getValorEmMaos()){
                    System.out.println("---------------");
                    System.out.println("Jogar 1 venceu!");
                    System.out.println("---------------");
                }else {
                    System.out.println("---------------");
                    System.out.println("Jogar 2 venceu!");
                    System.out.println("---------------");
                }
            }else {
                System.out.println("---------------");
                System.out.println("Jogar 1 venceu!");
                System.out.println("---------------");
            }
        }else {
            if (p2.isVencedor()){
                System.out.println("---------------");
                System.out.println("Jogar 2 venceu!");
                System.out.println("---------------");
            }else {
                System.out.println("-------------------------------------");
                System.out.println("Ouve um impate, pois ambos estouraram");
                System.out.println("-------------------------------------");
            }
        }

    }

}