import java.util.Scanner;
public class ContaBancaria {
    String cliente;
    int numConta;
    float saldo;

    // Métodos de acesso - Get e Set
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cli){
        cliente = cli;
    }

    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numCo){
        numConta = numCo;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float sal){
        saldo = sal;
    }

    // Método Sacar
    public float sacar(float grana) {
        if (saldo - grana >= 0) {
            saldo -= grana;
            return saldo;
        }
        System.out.println("Saldo insuficiente!");
        return saldo;
    }

    // Método Depositar
    public float depositar(double grana) {
        saldo += grana;
        System.out.println("Saldo atualizado!");
        return saldo;
    }

    public void entradaDados(){
        Scanner dado = new Scanner(System.in);
        System.out.print("Insira o seu nome -> ");
        setCliente(dado.nextLine());
        System.out.print("Insira o número da conta -> ");
        setNumConta(Integer.parseInt(dado.nextLine()));
        System.out.print("Insira o seu saldo atual -> ");
        setSaldo(Float.parseFloat(dado.nextLine()));
    }

    public void imprimir() {
        System.out.println("Nome -> " + getCliente());
        System.out.println("Nº da conta -> " + getNumConta());
        System.out.println("Saldo -> " + getSaldo());
    }

    public void cadastrar(String cliente, int numero, float saldo) {
        setCliente(cliente);
        setNumConta(numero);
        setSaldo(saldo);
    }
}