import java.util.Scanner;
public class CalcularVolumeLata {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        int raio, altura;
        raio = Integer.parseInt(dado.nextLine());
        altura = Integer.parseInt(dado.nextLine());
        System.out.println("O volume da lata de óleo é igual a -> " + volume(raio, altura));
    }
    public static double volume(int r, int h){
        double vol, PI = 3.14159;
        vol = PI * Math.pow(r,2) * h;
        return vol;
    }
}
