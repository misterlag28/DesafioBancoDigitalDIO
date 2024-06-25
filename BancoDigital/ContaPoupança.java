package projetinhos.BancoDigital;

public class ContaPoupança extends Conta {


    private static int SEQUENCIAL = 1;

    public  ContaPoupança(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;

    }
}

