package gol.logica;

import java.util.Objects;

public class GerarGeracoes {

    public String criarNovaGeracao(String[] matriz, int height, int width) {
        StringBuilder vizinho = new StringBuilder();

        for (int i = height - 1; i <= height + 1; i++) {
            for (int j = width - 1; j <= width + 1; j++) {
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length() && (i != height || j != width)) {
                    if (Objects.equals(matriz[i].charAt(j), 'X')) vizinho.append(matriz[i].charAt(j));
                }
            }
        }

        if (vizinho.length() > 3 || vizinho.length() < 2) return ".";
        else if (vizinho.length() == 3) return "X";
        return String.valueOf(matriz[height].charAt(width));
    }
}
