package gol.formatacao;

public class PopulationEmMatriz {
    private final int height;
    private final String population;

    public PopulationEmMatriz(int height, String population) {
        this.height = height;
        this.population = population;
    }

    public String[][] transformarPopulacaoEmMatriz() {
        String[] populationEmArray = population.split("\n");
        String[][] populationEmMatriz = new String[1][height];

        for (int i = 0; i < populationEmMatriz[0].length; i++) {
            populationEmMatriz[0][i] = ".";
            if (i < populationEmArray.length) populationEmMatriz[0][i] = populationEmArray[i];
            while (populationEmMatriz[0][i].length() < height) populationEmMatriz[0][i] += ".";
        }
        return populationEmMatriz;
    }
}
