import java.util.Scanner;

public class Geladeira extends Eletro{
    Porta porta2;
    double tempMin, tempMax;
    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public void entradaDados() {
        super.entradaDados();
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira a temperatura mínima -> ");
        setTempMin(Double.parseDouble(dado.nextLine()));
        System.out.println("Insira a temperatura máxima -> ");
        setTempMax(Double.parseDouble(dado.nextLine()));
        porta2.entradaDados();
    }

    public void cadastrar(String ma, String mo, double pre, Porta po1, int vol, double tMin, double tMax, Porta po2) {
        super.cadastrar(ma, mo, pre, po1, vol);
        setTempMin(tMin);
        setTempMax(tMax);
        setPorta2(po2);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        porta2.imprimir();
    }
}
