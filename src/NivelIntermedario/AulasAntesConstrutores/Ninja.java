package NivelIntermedario.AulasAntesConstrutores;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Método geral
    public void habilidadeBraba() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque espcial!");
    }

    /* criando um metodo void -> não retorna nenhum valor
        public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O sharingan Ativou! Eu sou um Uchiha");
    }*/
    // metodos que retornam algum valor, neste caso string
/*
    public String EuSouUmNinja(){
        return "Oi eu sou um Ninja!";
    }
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
*/
}
