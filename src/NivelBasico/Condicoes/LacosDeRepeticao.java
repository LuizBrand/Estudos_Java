package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        // while
        // while (condica) {tudo aqui vai acontecer}
        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;
        while (numeroDeClones < numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez o clone das Sombras numero:  " + numeroDeClones);
        }

        // for
        // for (int i = algum valor; condicaoDeParada; Incremento) {codigo a ser executado}
        for (int i = 1; i <= numeroMaxDeClones; i++) {
            System.out.println("O Naruto fez o clone das Sombras numero:  " + i);
        }
    }
}
