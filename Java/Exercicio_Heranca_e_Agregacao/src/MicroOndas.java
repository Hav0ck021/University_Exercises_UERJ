import java.util.Scanner;

public class MicroOndas extends Eletro{
    double potMin, potMax;

    public double getPotMin() {
        return potMin;
    }

    public void setPotMin(double potMin) {
        this.potMin = potMin;
    }

    public double getPotMax() {
        return potMax;
    }

    public void setPotMax(double potMax) {
        this.potMax = potMax;
    }

    public void entradaDados() {
        super.entradaDados();
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira a potência mínima -> ");
        setPotMin(Double.parseDouble(dado.nextLine()));
        System.out.println("Insira a potência máxima -> ");
        setPotMax(Double.parseDouble(dado.nextLine()));
    }

    public void cadastrar(String ma, String mo, double pre, Porta po1, int vol, double pMin, double pMax) {
        super.cadastrar(ma, mo, pre, po1, vol);
        setPotMin(pMin);
        setPotMax(pMax);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Potência mínima -> " + getPotMin());
        System.out.println("Potência máxima -> " + getPotMax());
    }
}
