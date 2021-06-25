package programa.completo.para.ordenacao;

public class Ordenacao {

    public static void bolha(int numeros[]) {
        int x;
        for (int i = 1; i < numeros.length; i++) {
            for (int j = numeros.length - 1; j >= i; j--) {
                if (numeros[j - 1] > numeros[j]) {
                    x = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = x;
                }
            }
        }

    }

    public static void bolha(String palavras[]) {
        String x;
        for (int i = 1; i < palavras.length; i++) {
            for (int j = palavras.length - 1; j >= i; j--) {
                if (palavras[j - 1].compareTo(palavras[j]) > 0) {
                    x = palavras[j - 1];
                    palavras[j - 1] = palavras[j];
                    palavras[j] = x;

                }
            }
        }
    }
}
