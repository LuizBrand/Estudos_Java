package NivelIntermedario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    //Overload dos Constructors
    //noArgsConstructor
    public ContaPoupanca() {
        super();
    }

    //allArgsConstructor
    public ContaPoupanca(TipoConta tipoConta, String usuario, double saldo) {
        super(tipoConta, usuario, saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxaDeposito = 0.99;
        confirmacaoDeposito(valor, taxaDeposito);
    }
}

