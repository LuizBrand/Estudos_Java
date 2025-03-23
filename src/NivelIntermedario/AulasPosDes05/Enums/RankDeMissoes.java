package NivelIntermedario.AulasPosDes05.Enums;

//Usar ENUMS quando tiver certeza que esse valores nao se alteram, e so podem ter uma funcionalidade
//EX: dias da semana, métodos de pagamento e neste caso, O nivel de missao
public enum RankDeMissoes {

    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Dificil", 5),
    S("Altissimo", 6);

    private String descricao;
    private int dificuldade;

    //Esse construtor obriga que todoo elemento do enum, seja informado a descricao e dificuldade
    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    //Getters para exibir para o usuario
    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

}
