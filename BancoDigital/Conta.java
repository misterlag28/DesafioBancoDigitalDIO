package projetinhos.BancoDigital;

public abstract class Conta {

    protected static final int AGENCIA_PADRAO = 777;
    
    protected int agencia;
    protected int numero;
    protected double saldo;

    


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
