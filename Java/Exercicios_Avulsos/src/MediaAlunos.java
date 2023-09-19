import java.util.Scanner;
public class MediaAlunos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        String matricula, nome;
        double nota1, nota2;
        int idade;
        System.out.println("Entre com a Matricula: ");
        matricula = dado.nextLine();
        System.out.println("Entre com o Nome: ");
        nome = dado.nextLine();
        System.out.println("Entre com a Idade: ");
        idade = Integer.parseInt(dado.nextLine());
        System.out.println("Entre com a Nota P1: ");
        nota1 = Double.parseDouble(dado.nextLine());
        System.out.println("Entre com a Nota P2: ");
        nota2 = Double.parseDouble(dado.nextLine());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome + " Idade " + idade);
        System.out.println("Nota P1: " + nota1 + " Nota P2: " + nota2);
        System.out.println("Média: " + (nota1 + nota2)/2);
    }
}