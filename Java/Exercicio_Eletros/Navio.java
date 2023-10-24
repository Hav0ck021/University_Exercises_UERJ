import java.util.Scanner;
public class Navio extends Veiculo {
    String nome, dataLancamento;
    int numeroTripulantes;

    // Métodos de acesso - Get e Set
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setDataLancamento(String dataLan){
        this.dataLancamento = dataLan;
    }
    public String getDataLancamento(){
        return dataLancamento;
    }

    public void setNumeroTripulantes(int num){
        this.numeroTripulantes = num;
    }
    public int getNumeroTripulantes(){
        return numeroTripulantes;
    }

    // Métodos Construtores
    public Navio(){}
    public Navio(String nom, String dataLan, int numTrip){
        nome = nom;
        dataLancamento = dataLan;
        numeroTripulantes = numTrip;
    }
    public Navio(int capTan, String dataLan){
        super(capTan);
        dataLancamento = dataLan;
    }
    public Navio(int capTan, String dataLan, String nom, int numTrip){
        super(capTan);
        dataLancamento = dataLan;
        nome = nom;
        numeroTripulantes = numTrip;
    }
    public Navio(int capTan, int numPas, String dataLan, String nom, int numTrip){
        super(capTan, numPas);
        dataLancamento = dataLan;
        nome = nom;
        numeroTripulantes = numTrip;
    }
    public Navio(int capTan, int numPas, String dataLan, String nom){
        super(capTan, numPas);
        dataLancamento = dataLan;
        nome = nom;
    }

    // Método de de razão entre passageiros e tripulantes
    public double passageirosPorTripulantes(){
        numeroPassageiros /= numeroTripulantes;
        return numeroPassageiros;
    }

    // Métodos de entrada e saída de dados
    public void entradaDados(){
        super.entradaDados();
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira Nome -> ");
        setNome(dado.nextLine());
        System.out.print("Insira a Data de Lançamento -> ");
        setDataLancamento(dado.nextLine());
        System.out.print("Insira a quantidade de Tripulantes -> ");
        setNumeroTripulantes(Integer.parseInt(dado.nextLine()));
    }

    public void cadastrar(){
        super.cadastrar(numeroPassageiros, capacidadeTanque, preco);
        setNome(nome);
        setDataLancamento(dataLancamento);
        setNumeroTripulantes(numeroTripulantes);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Nome -> " + getNome());
        System.out.println("Data de Lançamento -> " + getDataLancamento());
        System.out.println("Quantidade de Tripulantes -> " + getNumeroTripulantes());
        System.out.println("Quantidade de passageiros por Tripulante -> " + passageirosPorTripulantes());
    }
}

