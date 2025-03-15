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
        if (valor <= 0){
            System.out.println("Erro, não é possível depositar valor negativo ou igual a 0");
        } else {
            saldo += valor;
            System.out.println("Foi depositado " + valor + " na conta" + tipoConta + " do usuario(a) " + usuario);
        }
    }

}
