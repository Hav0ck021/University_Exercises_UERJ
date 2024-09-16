import java.util.InputMismatchException;
import java.util.Scanner;
public class PenDrive {
    String marca, modelo, unidade;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;

    // Métodos Construtores
    public PenDrive() {}
    public PenDrive(String mar, String mod){
        marca = mar;
        modelo = mod;
    }
    public PenDrive(int cap ){
        capacidade = cap;
    }
    public PenDrive(String mar, int cap, String uni){
        marca = mar;
        capacidade = cap;
        unidade = uni;
    }
    public PenDrive(String mod, int cap , double pr ){
        modelo = mod;
        capacidade = cap;
        preco = pr;
    }

    public PenDrive(double lar , double pe , double co, int ca){
        largura = lar;
        peso = pe;
        comprimento = co;
        capacidade = ca;
    }
    public PenDrive(double lar , double pe , double co, double pre) {
        largura = lar;
        peso = pe;
        comprimento = co;
        preco = pre;
    }
    public PenDrive(double lar , double pe , double pre, double co, double pro) {
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
    }
    public PenDrive(double pe){
        peso = pe;
    }
    public PenDrive(int ca, double co){
        capacidade = ca;
        comprimento = co;
    }
    public PenDrive(int ca, double co, String ma){
        capacidade = ca;
        comprimento = co;
        marca = ma;
    }
    public PenDrive(int ca, String mo, double co){
        capacidade = ca;
        comprimento = co;
        modelo = mo;
    }
    public PenDrive(int ca, double co, String un, String mo){
        capacidade = ca;
        comprimento = co;
        unidade = un;
        modelo = mo;
    }
    public PenDrive(int ca, double lar , double pe , double pre, double co, double pro) {
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
    }
    public PenDrive(int ca, double lar , double pe , double pre, double co, double pro, String un) {
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(int ca, double lar , double pe , double pre, double co, double pro,
    String mo, String un) {
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
        modelo = mo;
    }
    public PenDrive(int ca, double lar , double pe , double pre, double co, double pro,
                    String ma, String mo, String un) {
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
        modelo = mo;
        marca = ma;
    }
    public PenDrive(int ca, String mo , double pe , double pre, double co, double pro,
                    double lar, String un) {
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
        modelo = mo;
    }
    public PenDrive(String un, double lar, double pre, double co, double pro,
                    double pe, int ca) {
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(String un,int ca,double lar, double pre, double co, double pro,
                    double pe ){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double pre, String un,double lar, double co,int ca, double pro,
                    double pe ){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double pre, String un ,double lar, double co, double pro,
                    double pe ,int ca){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double pre, String un ,double lar, double co, double pro,
            int ca, double pe ){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(String un ,double lar, double co, double pro,
            int ca, double pe ,double pre ){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double lar,double co, int ca, double pe ,double pre,String un   ){
        capacidade = ca;
        largura = lar;
        peso = pe;
        comprimento = co;
        preco = pre;
        unidade = un;

    }
    public PenDrive(double lar,double co, double pro,
            int ca, double pe ,double pre,String un   ){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
        comprimento = co;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double pro, int ca, double pe ,double pre, String un){
        capacidade = ca;
        peso = pe;
        profundidade = pro;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double lar, double pro,
                    int ca, double pe){
        capacidade = ca;
        largura = lar;
        peso = pe;
        profundidade = pro;
    }
    public PenDrive(double lar,  int ca, double pe , String un){
        capacidade = ca;
        largura = lar;
        peso = pe;
        unidade = un;
    }
    public PenDrive(double lar, double pre,String un){
        largura = lar;
        preco = pre;
        unidade = un;
    }
    public PenDrive(double lar, double pre,String un, int ca){
        largura = lar;
        preco = pre;
        unidade = un;
        capacidade = ca;
    }


    // Declaração dos getAtributos (Métodos de Acesso)
    public String getMarca(){
        return marca;
    }
    public String getModelo(){ return modelo; }
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
    public double getPreco(){ return preco; }
    public String getUnidade(){ return unidade; }

    // Declaração dos setAtributos (Métodos de Acesso)
    public void setMarca(String m){
        if(!m.isEmpty())
            marca = m;
    }
    public void setMarca(){
        marca = "";
    }
    public void setModelo(String mod){
        if(!mod.isEmpty())
            modelo = mod;
    }
    public void setModelo(){
        modelo = "";
    }
    public void setCapacidade(int cap){
        if(cap >= 0)
            capacidade = cap;
    }
    public void setCapacidade(){
        capacidade = 0;
    }
    public void setComprimento(double comp){
        if(comp >= 0.0)
            comprimento = comp;
    }
    public void setComprimento(){
        comprimento = 0;
    }
    public void setLargura(double larg){
        if(larg >= 0.0)
            largura = larg;
    }
    public void setLargura(){
        largura = 0;
    }
    public void setProfundidade(double prof){
        if(prof >= 0.0)
            profundidade = prof;
    }
    public void setProfundidade(){
        profundidade = 0;
    }
    public void setPeso(double pe){
        if(pe >= 0.0)
            peso = pe;
    }
    public void setPeso(){
        peso = 0;
    }
    public void setPreco(double pre){
        if(pre >= 0.0)
            preco = pre;
    }
    public void setPreco(){
        preco = 0;
    }
    public void setUnidade(String un){
        if(!un.isEmpty())
            unidade = un;
    }
    public void setUnidade(){
        unidade = "";
    }

    public void entradaDados() {
        Scanner dado = new Scanner(System.in);
        boolean loopCont = true;

        do {
            try
            {
                System.out.print("Insira a Marca -> ");
                setMarca(dado.nextLine());
                System.out.print("Insira o Modelo -> ");
                setModelo(dado.nextLine());
                System.out.print("Insira a Capacidade -> ");
                setCapacidade(Integer.parseInt(dado.nextLine()));
                System.out.print("Insira a Unidade de armazenamento -> ");
                setUnidade(dado.nextLine());
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

                loopCont = false;
            }
            catch (InputMismatchException e)
            {
                System.err.println("Exception: " + e);
                dado.nextLine();
                System.out.println("Entrada invalida, verique " +
                                   "o tipo de dado inserido\n");
            }
            catch (NumberFormatException e) {
                System.err.println("Exception: " + e);
                System.out.println("Entrada invalida, verique " +
                        "o tipo de dado inserido\n");
            }
        } while (loopCont);
    }

    public void imprimirDadosPenDrive(){
        System.out.println("Exercicio_PenDrive.PenDrive");
        System.out.println("Marca        -> " + getMarca());
        System.out.println("Modelo       -> " + getModelo());
        System.out.println("Capacidade   -> " + getCapacidade() + getUnidade());
        System.out.println("Comprimento  -> " + getComprimento() + "cm") ;
        System.out.println("Largura      -> " + getLargura());
        System.out.println("Profundidade -> " + getProfundidade());
        System.out.println("Peso         -> " + getPeso());
        System.out.println("Preço        -> " + getPreco());
    }

    /** É usado para determinar as propriedades do objeto, mas de
     *  forma direta no método Main, pois já temos os dados,
     *  excluindo assim parte da interação com o usuário. **/
    public void cadastrar(String marca, String modelo, int capacidade, double comprimento,
    double largura, double profundidade, double peso, double preco , String un ){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setComprimento(comprimento);
        setLargura(largura);
        setProfundidade(profundidade);
        setPeso(peso);
        setPreco(preco);
        setUnidade(un);
    }
}
