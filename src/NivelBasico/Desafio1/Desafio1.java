package NivelBasico.Desafio1;

public class Desafio1 {
    public static void main(String[] args) {

        //ninja1
        String ninja1 = "Naruto";
        int idadeNinja1 = 16;
        String nomeMissao1 = "Se vira Naruto";
        char nivelMissao1 = 'A';
        String statusDaMissao1;

        if (idadeNinja1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') {
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Nao Concluida";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("----------------------------------");
        System.out.println("-Nome do Ninja: " + ninja1);
        System.out.println("-Idade do Ninja: " + idadeNinja1);
        System.out.println("-Nome da Missao: " + nomeMissao1);
        System.out.println("-Nivel da Missao: " + nivelMissao1);
        System.out.println("-Status da Missao: " + statusDaMissao1);
        System.out.println("----------------------------------");

        //ninja2
        String ninja2 = "Kakashi";
        int idadeNinja2 = 28;
        String nomeMissao2 = "So o Kakashi resolve essa!";
        char nivelMissao2 = 'S';
        String statusDaMissao2;

        if (idadeNinja2 < 15) {
            if (nivelMissao2 == 'C' || nivelMissao2 == 'D') {
                statusDaMissao2 = "Concluida";
            } else {
                statusDaMissao2 = "Nao Concluida";
            }
        } else {
            statusDaMissao2 = "Concluida";
        }

        System.out.println("----------------------------------");
        System.out.println("-Nome do Ninja: " + ninja2);
        System.out.println("-Idade do Ninja: " + idadeNinja2);
        System.out.println("-Nome da Missao: " + nomeMissao2);
        System.out.println("-Nivel da Missao: " + nivelMissao2);
        System.out.println("-Status da Missao: " + statusDaMissao2);
        System.out.println("----------------------------------");

        //ninja3
        String ninja3 = "Kohonamaru";
        int idadeNinja3 = 10;
        String nomeMissao3 = "Resgatar o Gato Luffy";
        char nivelMissao3 = 'C';
        String statusDaMissao3;

        if (idadeNinja3 < 15) {
            if (nivelMissao3 == 'C' || nivelMissao3 == 'D') {
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Nao Concluida";
            }
        } else {
            statusDaMissao3 = "Concluida";
        }

        System.out.println("----------------------------------");
        System.out.println("-Nome do Ninja: " + ninja3);
        System.out.println("-Idade do Ninja: " + idadeNinja3);
        System.out.println("-Nome da Missao: " + nomeMissao3);
        System.out.println("-Nivel da Missao: " + nivelMissao3);
        System.out.println("-Status da Missao: " + statusDaMissao3);
        System.out.println("----------------------------------");

    }
}
