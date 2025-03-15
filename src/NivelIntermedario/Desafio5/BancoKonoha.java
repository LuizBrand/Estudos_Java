package NivelIntermedario.Desafio5;

public abstract class BancoKonoha implements Conta  {

    String usuario;
    double saldo;
    TipoConta tipoConta;

    //noArgsConstructor
    public BancoKonoha() {}

    //allArgsConstructor
    public BancoKonoha(TipoConta tipoConta, String usuario, double saldo) {
        this.tipoConta = tipoConta;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da conta " + tipoConta + " do " + usuario + " é de " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    public void Transferencia(ContaCorrente conta1, double valorTransferencia, ContaCorrente conta2) {
        if (valorTransferencia <= 0){
            System.out.println("Erro! Não pode tranferir valor negativo ou igual a zero!");
        } else {
            conta1.saldo = conta1.saldo - valorTransferencia;
            conta2.saldo = conta2.saldo + valorTransferencia;
            System.out.println(conta1.usuario + " fez uma transferência da sua conta " + conta1.tipoConta + " no valor de: " + valorTransferencia + ", Para a conta " + conta2.tipoConta + " de " + conta2.usuario);
            System.out.println("Transferencia Realizada com sucesso!");
        }
    }

    public void Transferencia(ContaPoupanca conta1, double valorTransferencia, ContaPoupanca conta2) {
        if (valorTransferencia <= 0){
            System.out.println("Erro! Não pode tranferir valor negativo ou igual a zero!");
        } else {
            conta1.saldo = conta1.saldo - valorTransferencia;
            conta2.saldo = conta2.saldo + valorTransferencia;
            System.out.println(conta1.usuario + " fez uma transferência da sua conta " + conta1.tipoConta + " no valor de: " + valorTransferencia + ", Para a conta " + conta2.tipoConta + " de " + conta2.usuario);
            System.out.println("Transferencia Realizada com sucesso!");
        }
    }

    public void Transferencia(ContaPoupanca conta1, double valorTransferencia, ContaCorrente conta2) {

    }

    public void Transferencia(ContaCorrente conta1, double valorTransferencia, ContaPoupanca conta2) {

    }
}
