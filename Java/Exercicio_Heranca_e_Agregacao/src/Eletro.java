import java.util.Scanner;

public class Eletro {
    String marca, modelo;
    int volume;
    double preco;
    Porta porta1;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void cadastrar(String ma, String mo, double pre, Porta po1, int vol){
        setMarca(ma);
        setModelo(mo);
        setPreco(pre);
        setPorta1(po1);
        setVolume(vol);
    }

    public void imprimir(){
        System.out.println("Marca -> " + getMarca());
        System.out.println("Modelo -> " + getModelo());
        System.out.println("Preço -> " +  getPreco());
        System.out.println("Volume -> " + getVolume());
        System.out.println("Porta -> " + getPorta1());
    }

    public void entradaDados(){
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira a marca -> ");
        setMarca(dado.nextLine());
        System.out.print("Insira o modelo -> ");
        setMarca(dado.nextLine());
        System.out.print("Insira o preço -> ");
        setPreco(Double.parseDouble(dado.nextLine()));
        System.out.print("Insira o volume -> ");
        setVolume(Integer.parseInt(dado.nextLine()));
        System.out.print("Insira a Porta -> ");
        porta1.entradaDados();
    }
}
