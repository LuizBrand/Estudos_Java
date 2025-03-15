package NivelIntermedario.Desafio5;

public abstract class ContaBancaria implements Conta  {

    String usuario;
    double saldo;
    TipoConta tipoConta;

    //noArgsConstructor
    public ContaBancaria() {}

    //allArgsConstructor
    public ContaBancaria(TipoConta tipoConta, String usuario, double saldo) {
        this.tipoConta = tipoConta;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public void consultarSaldo() {
    }

    @Override
    public abstract void depositar(double valor);


}
