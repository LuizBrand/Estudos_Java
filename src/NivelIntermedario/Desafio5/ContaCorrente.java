package NivelIntermedario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    //Overload dos contructors
    //noArgsConstructor
    public ContaCorrente() {
        super();
    }

    //allArgsConstructor
    public ContaCorrente(TipoConta tipoConta, String usuario, double saldo) {
        super(tipoConta, usuario, saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxaDeposito = 1;
        confirmacaoDeposito(valor, taxaDeposito);
    }

}
