package gol.mediacao;

import gol.formatacao.PopulationEmMatriz;
import gol.logica.GerarPopulacaoAleatoria;
import gol.Renderizar;

public class HubLogica {
    private final int height;
    private final int width;
    private final int generations;
    private final int speed;
    private String population;

    public HubLogica(int height, int width, int generations, int speed, String population) {
        this.height = height;
        this.width = width;
        this.generations = generations;
        this.speed = speed;
        this.population = population.replaceAll("#", "\n").replaceAll("0", ".")
                .replaceAll("1", "X");
    }

    public void executarGameOfLife() {
        if (population.equalsIgnoreCase("RND")) {
            GerarPopulacaoAleatoria gerarPopulacaoAleatoria = new GerarPopulacaoAleatoria(height, width);
            population = gerarPopulacaoAleatoria.criarGridAleatorio();
        }

        PopulationEmMatriz populationEmMatriz = new PopulationEmMatriz(height, population);
        String[][] populationMatriz = populationEmMatriz.transformarPopulacaoEmMatriz();

        Renderizar renderizar = new Renderizar(height, width, generations, speed, populationMatriz);
        renderizar.mandarProSwing();
    }
}
