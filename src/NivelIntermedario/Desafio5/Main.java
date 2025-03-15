package NivelIntermedario.Desafio5;

public class Main {
    public static void main(String[] args) {

        //inicializando os objetos das contas do natuto
        ContaCorrente contaCorrenteNaruto = new ContaCorrente(TipoConta.CORRENTE, "Naruto Uzumaki", 2550.50);
        ContaPoupanca contaPoupancaNaruto = new ContaPoupanca(TipoConta.POUPANCA, "Naruto Uzumaki", 15000.00);

        //consultando saldo das contas do Naruto
        contaCorrenteNaruto.consultarSaldo();
        contaPoupancaNaruto.consultarSaldo();

        //depositando valores nas contas do naruto
        contaCorrenteNaruto.depositar(5000);
        contaPoupancaNaruto.depositar(2750);

        //consultando novamente os saldos para ver os valores atualizados
        contaCorrenteNaruto.consultarSaldo();
        contaPoupancaNaruto.consultarSaldo();
        System.out.println("---------------------------------------------------------");

/*        //Transferencia entre contas
        //transferencia entre contas correntes
        ContaCorrente sasuke = new ContaCorrente(TipoConta.CORRENTE, "Sasuke Uchiha", 5000);
        ContaCorrente sakura = new ContaCorrente(TipoConta.CORRENTE, "Sakura Haruno", 2500);
        sasuke.Transferencia(sasuke, 500, sakura);

        //consulando saldo bancario da sakura e do sasuke
        sasuke.consultarSaldo();
        sakura.consultarSaldo();
        System.out.println("---------------------------------------------------------");*/
    }
}
