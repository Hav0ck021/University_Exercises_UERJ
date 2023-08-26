import java.util.Scanner;

public class ViagemCarro {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int tempoGasto;
        double velMedia, distancia, qtdCombust;
        tempoGasto = Integer.parseInt(dado.nextLine());
        velMedia = Double.parseDouble(dado.nextLine());
        distancia = tempoGasto * velMedia;
        qtdCombust = distancia / 12.0;
        System.out.println("Velocidade média -> " + velMedia + "\nTempo gasto na viagem -> " + tempoGasto);
        System.out.println("Distância percorrida -> " + distancia + "\nQuantidade de combustível -> " + qtdCombust + " litros");
    }
}
