package NivelIntermedario.Desafio5;

public abstract class ContaBancaria implements Conta  {

    String usuario;
    protected double saldo;
    TipoConta tipoConta;

    //noArgsConstructor
    public ContaBancaria() {}

    //allArgsConstructor
    public ContaBancaria(TipoConta tipoConta, String usuario, double saldo) {
        this.tipoConta = tipoConta;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da Conta " + tipoConta + " do(a) usuario(a) " + usuario + ": R$ " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    //Métodoo para confirmação do deposito
    protected void confirmacaoDeposito(double valor, double taxaDeposito){
        if (valor <= 0){
            System.out.println("Erro, não é possível depositar valor menor/igual a 0 ou maior que o Saldo");
        } else {
            modificarValor(valor, taxaDeposito);
        }
    }

    //Métodoo transferencia para conta corrente
    protected void Transferencia(ContaCorrente destino, double valor) {
        if(valor <= 0 || valor > saldo) {
            System.out.println("Erro, valor para transferencia não pode ser menor/igual a 0 ou maior que o Saldo!");
        } else {
            confirmacaoTransferencia(destino, valor);
        }
    }

    //sobrecarga do métodoo Transferencia para fazer transferencia para conta poupança
    protected void Transferencia(ContaPoupanca destino, double valor) {
        if(valor <= 0 || valor > saldo) {
            System.out.println("Erro, valor para transferencia não pode ser menor/igual a 0 ou maior que o Saldo!");
        } else {
            confirmacaoTransferencia(destino, valor);
        }
    }

    //Métodoo para realizar a transferencia e confirmá-la
    private void confirmacaoTransferencia(ContaBancaria destino, double valor) {
        saldo -= valor;
        destino.saldo += valor;
        System.out.println("Transferencia no valor de R$ " + valor + " realizada com sucesso!");
        consultarSaldo();
        destino.consultarSaldo();
    }

    //Métodoo para alteração do saldo e mostrar saldo quando fizer um deposito
    private void modificarValor(double valor, double taxaDeposito){
        double valorComTaxa = valor * taxaDeposito;
        saldo += valorComTaxa;
        System.out.println("Foi depositado R$ " + valorComTaxa + " na conta " + tipoConta + " do usuario(a) " + usuario);
        consultarSaldo();
        System.out.println();
    }
}
