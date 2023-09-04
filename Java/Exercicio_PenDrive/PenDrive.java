package Exercicio_PenDrive;
import java.util.Scanner;
public class PenDrive {
    String marca;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;

    Scanner dado = new Scanner(System.in);

    // Declaração dos getAtributos (Métodos de Acesso)
    public String getMarca(){
        return marca;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public double getComprimento(){
        return comprimento;
    }
    public double getLargura(){
        return largura;
    }
    public double getProfundidade(){
        return profundidade;
    }
    public double getPeso(){
        return peso;
    }
    public double getPreco(){
        return preco;
    }

    // Declaração dos setAtributos (Métodos de Acesso)
    public void setMarca(String m){
        if(!m.isEmpty())
            marca = m;
    }
    public void setCapacidade(int cap){
        if(cap >= 0)
            capacidade = cap;
    }
    public void setComprimento(double comp){
        if(comp >= 0.0)
            comprimento = comp;
    }
    public void setLargura(double larg){
        if(larg >= 0.0)
            largura = larg;
    }
    public void setProfundidade(double prof){
        if(prof >= 0.0)
            profundidade = prof;
    }
    public void setPeso(double pe){
        if(pe >= 0.0)
            peso = pe;
    }
    public void setPreco(double pre){
        if(pre >= 0.0)
            preco = pre;
    }
    public void entradaDadosPenDrive(){
        System.out.print("Insira a Marca -> ");
        setMarca(dado.nextLine());
        System.out.print("Insira a Capacidade -> ");
        setCapacidade(Integer.parseInt(dado.nextLine()));
        System.out.print("Insira o Comprimento -> ");
        setComprimento(Double.parseDouble(dado.nextLine()));
        System.out.print("Insira a Largura -> ");
        setLargura(Double.parseDouble(dado.nextLine()));
        System.out.print("Insira a Profundidade -> ");
        setProfundidade(Double.parseDouble(dado.nextLine()));
        System.out.print("Insira o Peso -> ");
        setPeso(Double.parseDouble(dado.nextLine()));
        System.out.print("Insira o Preço -> ");
        setPreco(Double.parseDouble(dado.nextLine()));
    }

    public void imprimirDadosPenDrive(){
        System.out.println("PenDrive");
        System.out.println("Marca        -> " + getMarca());
        System.out.println("Capacidade   -> " + getCapacidade() + "GB");
        System.out.println("Comprimento  -> " + getComprimento() + "cm") ;
        System.out.println("Largura      -> " + getLargura());
        System.out.println("Profundidade -> " + getProfundidade());
        System.out.println("Peso         -> " + getPeso());
        System.out.println("Preço        -> " + getPreco());
    }
}
