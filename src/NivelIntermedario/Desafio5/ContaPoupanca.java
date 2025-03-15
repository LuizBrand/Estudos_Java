package NivelIntermedario.Desafio5;

public class ContaPoupanca extends BancoKonoha{

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
        double taxaDeposito = valor * 0.01;
        if (valor <= 0){
            System.out.println("Erro, não é possível depositar valor negativo ou igual a 0");
        } else {
            double valorComTaxa = valor - taxaDeposito;
            saldo += valorComTaxa;
            System.out.println("Foi depositado " + valorComTaxa + " na conta" + tipoConta + " do usuario(a) " + usuario + ". Taxa de deposito: " + taxaDeposito);
        }
    }
}

