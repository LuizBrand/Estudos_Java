package NivelIntermedario.AulasPosDes05.Generics;

public class EquipamentosNinjas {
    private String nome;

    public EquipamentosNinjas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do Equipamento: " + nome;
    }
}
