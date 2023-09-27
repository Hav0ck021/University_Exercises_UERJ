package Exercicio_PenDrive;

public class Exercicio_PenDrive {
    public static void main(String[] args) {
        PenDrive pen1 = new PenDrive();
        pen1.entradaDados();
        pen1.imprimirDadosPenDrive();

        PenDrive pen2 = new PenDrive();
        pen2.entradaDados();
        pen2.imprimirDadosPenDrive();

        PenDrive pen3 = new PenDrive("mar", "mod");
        pen3.entradaDados();
        pen3.imprimirDadosPenDrive();

        PenDrive pen4 = new PenDrive(64);
        pen4.entradaDados();
        pen4.imprimirDadosPenDrive();

        PenDrive pen5 = new PenDrive("mar", 128,"mod");
        pen5.entradaDados();
        pen5.imprimirDadosPenDrive();

        PenDrive pen6 = new PenDrive(5.5);
        pen6.entradaDados();
        pen6.imprimirDadosPenDrive();
        System.out.println("Fim do programa! :)");
    }
}
