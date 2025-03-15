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
        if (valor <= 0){
            System.out.println("Erro, não é possível depositar valor menor/igual a 0 ou maior que o Saldo");
        } else {
            modificarValor(valor, taxaDeposito);
        }
    }

}
