package NivelIntermedario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico figurante = new NinjaBasico("Figurante", tipoHabilidade.TAIJUTSU,16);
        NinjaAvancado Naruto = new NinjaAvancado("Naturo", tipoHabilidade.NINJUTSU, "Modo Sábio", 17);

        figurante.mostrarInformacoes();
        figurante.executarHabilidades();

        Naruto.mostrarInformacoes();
        Naruto.executarHabilidades();

    }
}
