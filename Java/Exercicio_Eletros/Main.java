import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        boolean opcao = false;

        Veiculo ve1 = new Veiculo();
        Aviao av1 = new Aviao();
        Navio nav1 = new Navio();

         /**ve1.entradaDados();
        ve1.imprimir();**/

        av1.entradaDados();
        System.out.println("Deseja realizar o ajuste de preço?");
        av1.reajustarPreco(Integer.parseInt(dado.nextLine()));
        av1.imprimir();

        nav1.entradaDados();
        nav1.passageirosPorTripulantes();
        nav1.imprimir();
    }
}