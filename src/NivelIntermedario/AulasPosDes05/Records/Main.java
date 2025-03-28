package NivelIntermedario.AulasPosDes05.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto Uzumaki", "narutoNoveCaldas@gmail.com", 999999999);
        System.out.println(cadastro);
        System.out.println("Nome do Cadastro = " + cadastro.getNome());

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke Uchiha", "sasukeOdeiaItachi@gmail.com", 888888888);
        System.out.println(cadastroRecord.emailCaixaAlta());
        System.out.println("Nome cadastro com record = " + cadastroRecord.nome());

    }
}
