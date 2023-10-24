import java.util.Scanner;
public class Veiculo {
    int capacidadeTanque;
    int numeroPassageiros;
    double preco;

    // Métodos de Acesso - Set e Get
    public void setCapacidadeTanque(int capTan){
        capacidadeTanque = capTan;
    }
    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public void setNumeroPassageiros(int numPas){
        numeroPassageiros = numPas;
    }
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }

    public void setPreco(double pre){
        preco = pre;
    }
    public double getPreco() {
        return preco;
    }

    // Métodos Construtores
    public Veiculo(){}
    public Veiculo(int capTanque){
        capacidadeTanque = capTanque;
    }
    public Veiculo(int capTanque, int numPas){
        capacidadeTanque = capTanque;
        numeroPassageiros = numPas;
    }
    public Veiculo(int capTanque, double pre){
        capacidadeTanque = capTanque;
        preco = pre;
    }
    public Veiculo(int capTanque, int numPas, double pre){
        capacidadeTanque = capTanque;
        numeroPassageiros = numPas;
        preco = pre;
    }

    // Métodos de entrada e saída de dados
    public void entradaDados(){
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira a quantidade de passageiros -> ");
        setNumeroPassageiros(Integer.parseInt(dado.nextLine()));
        System.out.print("Insira a capacidade do tanque -> ");
        setCapacidadeTanque(Integer.parseInt(dado.nextLine()));
        System.out.print("Insira o preço -> ");
        setPreco(Double.parseDouble(dado.nextLine()));
    }
    public void cadastrar(int numeroPassageiros, int capacidadeTanque
            , double preco) {
        setNumeroPassageiros(numeroPassageiros);
        setCapacidadeTanque(capacidadeTanque);
        setPreco(preco);
    }
    public void imprimir(){
        System.out.println("Qunatidade de Passageiros -> " + getNumeroPassageiros());
        System.out.println("Capacidade do Tanque -> " + getCapacidadeTanque());
        System.out.println("Preço -> " + getPreco());
    }
}