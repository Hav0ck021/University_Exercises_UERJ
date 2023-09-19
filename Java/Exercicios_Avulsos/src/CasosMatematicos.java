import java.util.Scanner;
public class CasosMatematicos {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        int a, b, x;
        a = Integer.parseInt(dado.nextLine());
        b = Integer.parseInt(dado.nextLine());
        x = (a-b)*(a-b);
        System.out.println("(a - b)² = " + x);
        x = a*a - b*b;
        System.out.println("a² - b² = " + x);
    }
}
