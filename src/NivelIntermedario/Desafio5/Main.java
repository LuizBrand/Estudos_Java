package NivelIntermedario.Desafio5;

public class Main {
    public static void main(String[] args) {

        //inicializando os objetos das contas dos ninjas
        ContaCorrente ccNaruto = new ContaCorrente(TipoConta.CORRENTE, "Naruto Uzumaki", 2550.50);
        ContaPoupanca cpNaruto = new ContaPoupanca(TipoConta.POUPANCA, "Naruto Uzumaki", 15000.00);
        ContaCorrente ccSakura = new ContaCorrente(TipoConta.CORRENTE, "Sakura Haruno", 0);
        ContaPoupanca cpSakura = new ContaPoupanca(TipoConta.POUPANCA, "Sakura Haruno",1000);


        //Valores iniciais naturo
        System.out.println("Consultando saldo Inicial das contas do Naruto ");
        ccNaruto.consultarSaldo();
        cpNaruto.consultarSaldo();
        System.out.println("---------------------------------------------------------");

        //Naruto depositou valores nas suas duas contas
        System.out.println("Naruto depositando valores nas suas duas contas");
        ccNaruto.depositar(5000);
        cpNaruto.depositar(2750);
        System.out.println("---------------------------------------------------------");

        //valores iniciais sakura
        System.out.println("Consultando saldo Inicial das contas da Sakura");
        ccSakura.consultarSaldo();
        cpSakura.consultarSaldo();
        System.out.println("---------------------------------------------------------");

        //Realizando transferencia entre Ninjas
        System.out.println("Usando metodo de transferencia para conta corrente, Naruto Transferindo para Sakura");
        ccNaruto.Transferencia(ccSakura, 500);
        System.out.println("---------------------------------------------------------");
        System.out.println("Usando metodo de transferencia para conta Poupança, Naruto Transferindo para Sakura");
        ccNaruto.Transferencia(cpSakura, 600);


    }
}
