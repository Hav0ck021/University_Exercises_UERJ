import java.util.Scanner;
public class Aviao extends Veiculo {
    String prefixo, dataRevisao;

    // Métodos de acesso - Get e Set
    public void setPrefixo(String pre){
        this.prefixo = pre;
    }
    public String getPrefixo(){
        return prefixo;
    }

    public void setDataRevisao(String dataRev){
        this.dataRevisao = dataRev;
    }
    public String getDataRevisao(){
        return dataRevisao;
    }
    // Métodos Construtores
    public Aviao(){}
    public Aviao(String pre, String dataRev){
        prefixo = pre;
        dataRevisao = dataRev;
    }
    public Aviao(int capTan, String pre){
        super(capTan);
        prefixo = pre;
    }
    public Aviao(int capTan, String pre, String dataRev){
        super(capTan);
        prefixo = pre;
        dataRevisao = dataRev;
    }
    public Aviao(int capTan, int numPas, String pre, String dataRev){
        super(capTan, numPas);
        prefixo = pre;
        dataRevisao = dataRev;
    }
    public Aviao(int capTan, int numPas, double prec, String pre, String dataRev){
        super(capTan, numPas, prec);
        prefixo = pre;
        dataRevisao = dataRev;
    }


    // Métodos de entrada e saída de dados
    public void entradaDados(){
        super.entradaDados();
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira o Prefixo -> ");
        setPrefixo(dado.nextLine());
        System.out.print("Insira a Data de Revisão -> ");
        setDataRevisao(dado.nextLine());
    }

    public void cadastrar(){
        super.cadastrar(numeroPassageiros, capacidadeTanque, preco);
        setPrefixo(prefixo);
        setDataRevisao(dataRevisao);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo -> " + getPrefixo());
        System.out.println("Data de Revisão -> " + getDataRevisao());
        System.out.println("Preço Reajustado -> " + getPreco());
    }

    // Método de reajuste de preço
    public double escolherOpcao(boolean opcao, int perc) {
        return !opcao ? reajustarPreco(perc) : 0;
        }
    }

    public double reajustarPreco(int perc){
        System.out.print("Insira o percentual para o reajuste do preço -> ");
        preco *= (1 + perc/100);
        return preco;
    }
}
