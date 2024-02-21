package gol;

import gol.GolGenerator;
import gol.GolSettings;
import gol.SwingRenderer;
import gol.logica.GerarGeracoes;

public class Renderizar {
    private final int height;
    private final int width;
    private final int generations;
    private final int speed;
    private String population = "";
    private final String[][] populationEmMatriz;
    GerarGeracoes gerarGeracoes = new GerarGeracoes();

    public Renderizar(int height, int width, int generations, int speed, String[][] populationEmMatriz) {
        this.height = height;
        this.width = width;
        this.generations = generations;
        this.speed = speed;
        this.populationEmMatriz = populationEmMatriz;
    }

    public void mandarProSwing() {
        final GolGenerator generator = new GolGenerator() {
            @Override
            public String getNextGenerationAsString(long generation) {
                population = "";

                for (int i = 0; i < populationEmMatriz[0].length; i++) {
                    for (int j = 0; j < populationEmMatriz[0][i].length(); j++) {
                        population += gerarGeracoes.criarNovaGeracao(populationEmMatriz[0], i, j);
                    }
                    population += "\n";
                }

                populationEmMatriz[0] = population.split("\n");

                return population;
            }
        };

        SwingRenderer.render(generator, new GolSettings(height, width, speed, generations));
    }
}
