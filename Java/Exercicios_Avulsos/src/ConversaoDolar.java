import java.util.Scanner;
public class ConversaoDolar {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        double preco;
        preco = Double.parseDouble(dado.nextLine());
        preco /= 4.87;
        System.out.println("O preço do produto em dólar ($) -> " + preco);
    }
}