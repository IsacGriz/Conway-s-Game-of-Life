package gol.atributos;

public class Settings {
    private final int height;
    private final int width;
    private final int generations;
    private final int speed;
    private final String population;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getGenerations() {
        return generations;
    }

    public int getSpeed() {
        return speed;
    }

    public String getPopulation() {
        return population;
    }

    public Settings(int height, int width, int generations, int speed, String population){
        this.height = height;
        this.width = width;
        this.generations = generations;
        this.speed = speed;
        this.population = population;
    }
    public String toString() {
        return String.format("""
                Height = [%d]
                Width = [%d]
                Generations = [%d]
                Speed = [%d]
                Population = [%s]
                """, height, width, generations, speed, population);
    }
}
