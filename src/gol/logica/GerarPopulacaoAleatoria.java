package gol.logica;

import java.util.Random;

public class GerarPopulacaoAleatoria {
    private final int height;
    private final int width;

    public GerarPopulacaoAleatoria(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public String criarGridAleatorio() {
        var random  = new Random();
        StringBuilder populacaoEmArray = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                populacaoEmArray.append(random.nextBoolean() ? "X" : ".");
            }
            populacaoEmArray.append("\n");
        }

        return populacaoEmArray.toString();
    }
}
