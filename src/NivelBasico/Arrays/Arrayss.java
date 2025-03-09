package NivelBasico.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        // array é um tipo de dado nao primitivo, tipo de referencia;
        // O array voce "separa" parte da memoria para este array, e cada index referenciara a um local da memoria
        // pre determinado anteriormente
        // array != lista, pois lista é flexivel, enquanto o array nao, voce precisa determinar o tamanho dele
        // arrays sao tipos referencia
        // null = vazio

        // STRING vai inicia como null
        String[] ninjas = new String[6]; //uma unica referencia para todos os seus espacos
        ninjas[0] = "Kakashi";
        ninjas[1] = "Naruto";
        ninjas[2] = "Sasuke";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kakashi Hatake";
        System.out.println(ninjas[5]);
        String nomeDoNinja = "Gaara do deserto"; //outro espaço na memória

        // INT inicializa com 0
        int[] idade = new int[2]; // novo espaço na memoria de um objeto! um objeto de memoria
        idade[0] = 14;
        System.out.println(idade[1]); // nao retorna null, pois o tipo do array é INT;

        // BOOLEAN vai inicializar como falso
        boolean[] trueORfalse = new boolean[1];
        System.out.println(trueORfalse[0]);

        // DOUBLE vai inicializam com 0.0
        double[] flutuante = new double[2];
        System.out.println(flutuante[0]);
        System.out.println(ninjas[9]);

    }

}
