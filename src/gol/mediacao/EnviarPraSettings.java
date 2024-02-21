package gol.mediacao;

import gol.atributos.Settings;

public class EnviarPraSettings {
    public Settings enviarArgumentosProntos(String[] argumentos) {
        int height = Integer.parseInt(argumentos[0]);
        int width = Integer.parseInt(argumentos[1]);
        int generation = Integer.parseInt(argumentos[2]);
        int speed = Integer.parseInt(argumentos[3]);
        String population = argumentos[4];

        return new Settings(height, width, generation, speed, population);
    }
}
