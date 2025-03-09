package NivelIntermedario.Aulas;

import javax.print.attribute.HashAttributeSet;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public abstract void sabedoriaHokage();
    // NoArgs Constructor
    public Hokages(){
        //construtor sem argumentos
    }

    //construtor com argumentos
    public Hokages(String nome){ //todoo novo objeto, ele pode ser criado passando um argumento nome
        this.nome = nome; // O 'this' referencia o atributo da classe, e esse atributo recebe como valor o parametro
    }
    public Hokages(int idade) {
        this.idade = idade;
    }

    // AllArgs constructor, CORRETO, shortcut Alt+Insert
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
