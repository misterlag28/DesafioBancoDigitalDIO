package projetinhos.BancoDigital;


public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public  ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;

    }
}