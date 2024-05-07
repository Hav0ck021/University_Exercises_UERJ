import java.util.Scanner;
public class ListaAlturas {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);

        int qtd;
        qtd = Integer.parseInt(dado.nextLine());
        double[] altura = new double[qtd];

        for (int i = 0; i < qtd; i++)
            altura[i] = Double.parseDouble(dado.nextLine());

        System.out.printf("A média de altura das %d  é igual a -> %.2f", qtd, media(qtd, altura));
    }
    public static double media(int q, double[] a){
        double sum = 0.0;
        for (int i = 0; i < q; i++){
            sum += a[i];
        }
        return (sum / q);
    }
}
