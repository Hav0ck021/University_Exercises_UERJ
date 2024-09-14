import java.util.Scanner;

public class Porta {
    double comp, larg;
    boolean isVidro;

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    public boolean getIsVidro() {
        return isVidro;
    }

    public void setVidro(boolean vidro) {
        this.isVidro = vidro;
    }

    public void cadastrar(double c, double l, boolean v){
        setComp(c);
        setLarg(l);
        setVidro(v);
    }

    public void imprimir(){
        System.out.println("Comprimento -> " + getComp());
        System.out.println("Largura -> " + getLarg());
        System.out.println("Tem vidro -> " +  getIsVidro());
    }

    public void entradaDados(){
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira o comprimento -> ");
        setComp(Double.parseDouble(dado.nextLine()));
        System.out.print("Insira a largura -> ");
        setLarg(Double.parseDouble(dado.nextLine()));
        System.out.print("Diga se tem ou não vidro -> ");
        setVidro(Boolean.parseBoolean(dado.nextLine()));
    }
}