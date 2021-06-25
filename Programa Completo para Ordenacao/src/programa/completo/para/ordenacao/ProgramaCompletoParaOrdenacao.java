package programa.completo.para.ordenacao;

import javax.swing.JOptionPane;

public class ProgramaCompletoParaOrdenacao {

    public static void main(String[] args) {
        int opcao, qtd;
        String num, saida = "| ";
        boolean ok;
        try {
            do {
                num = JOptionPane.showInputDialog(
                        "Ordenar\n"
                        + "Digite a opcão para ordenar:\n"
                        + "1-Números Inteiros\n"
                        + "2-Palavras\n");
                opcao = Integer.parseInt(num);
                switch (opcao) {
                    case 1:
                        num = JOptionPane.showInputDialog("Quantos números?");
                        qtd = Integer.parseInt(num);
                        int numeros[] = new int[qtd];
                        for (int i = 0; i < qtd; i++) {
                            num = JOptionPane.showInputDialog("Numero[" + i + "]");
                            numeros[i] = Integer.parseInt(num);

                        }
                        Ordenacao.bolha(numeros);
                        for (int i = 0; i < numeros.length; i++) {
                            saida = saida + numeros[i] + "|";
                        }
                        JOptionPane.showMessageDialog(null, "Numeros Ordenadas:\n" + saida);
                        ok = true;
                        break;

                    case 2:
                        num = JOptionPane.showInputDialog("Quantas Palavras:");
                        qtd = Integer.parseInt(num);
                        String palavras[] = new String[qtd];
                        for (int i = 0; i < qtd; i++) {
                            num = JOptionPane.showInputDialog("Palavra[" + i + "]");
                            palavras[i] = num.toUpperCase();
                        }
                        Ordenacao.bolha(palavras);
                        for (int i = 0; i < palavras.length; i++) {
                            saida = saida + palavras[i] + " | ";
                        }
                        JOptionPane.showMessageDialog(null, "Palavras Ordenadas:\n" + saida);
                        ok = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida!\n" + "Tente Novamente");
                        ok = false;
                }
            } while (!ok);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a leitura!");
        }

    }
}

     