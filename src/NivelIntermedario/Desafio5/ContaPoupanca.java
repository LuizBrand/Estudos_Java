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
        if (valor <= 0){
            System.out.println("Erro, não é possível depositar valor menor/igual a 0 ou maior que o Saldo");
        } else {
            modificarValor(valor, taxaDeposito);
        }
    }
}

