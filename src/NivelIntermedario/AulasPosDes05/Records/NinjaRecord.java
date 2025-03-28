package NivelIntermedario.AulasPosDes05.Records;

// Por padrao o Record ja devolve construtores, getters, todas as classes Build in do java so que...
// Todos os atributos são finals como padrao logo não possuem Setters
// O records cria os getters sem o get no nome
public record NinjaRecord(String nome, String email, int telefone) {
    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
