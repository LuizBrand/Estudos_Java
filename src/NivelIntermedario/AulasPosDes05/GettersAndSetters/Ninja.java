package NivelIntermedario.AulasPosDes05.GettersAndSetters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numDeMissoes;
    private double altura = 2.10;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numDeMissoes, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numDeMissoes = numDeMissoes;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumDeMissoes() {
        return numDeMissoes;
    }

    public void setNumDeMissoes(int numDeMissoes) {
        this.numDeMissoes = numDeMissoes;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*  Feito manual
    //GETTER -> Tirar/Mostrar dados para o usuario = GET + NOME DA VARIAVEL
    public String getNome() {
        return nome;
    }
    public double getAltura() {
        return altura;
    }

    //SETTER -> Recebe valores = SET + NOME DA VARIAVEL
    public void setNome(String nome) {
        this.nome =  nome;
    }
    public void setAltura(double altura) {
         this.altura = altura;
    }
*/
}
