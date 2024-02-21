package gol.mediacao;

import gol.atributos.Settings;
import gol.formatacao.JuntarTudo;
import gol.formatacao.RetirarValorBruto;
import gol.validacao.VerificarExistencia;
import gol.validacao.VerificarValor;
import gol.formatacao.FormatarArgumentos;

import java.util.ArrayList;

public class Hub {
    private int height;
    private int width;
    private int generations;
    private int speed;
    private String population;
    private final String[] argumentos;

    public Hub(String[] args) {
        this.argumentos = args;
    }

    public void verificarErrosVariaveis() {
        VerificarExistencia existencia = new VerificarExistencia(argumentos);
        RetirarValorBruto retirarValorBruto = new RetirarValorBruto();
        VerificarValor valor = new VerificarValor(argumentos);
        FormatarArgumentos formatarArgumentos = new FormatarArgumentos(argumentos);
        EnviarPraSettings enviarPraSettings = new EnviarPraSettings();

        existencia.verificarExistencia();
        valor.verificarValor();
        formatarArgumentos.formatarArgs();

        ArrayList<String> errosExistencia = existencia.acessarArray();
        ArrayList<String> errosValores = valor.acessarArray();
        String[] argumentosFormatados = formatarArgumentos.acessarArray();

        JuntarTudo juntarTudo = new JuntarTudo(argumentosFormatados, errosValores, errosExistencia);

        juntarTudo.juntarTudo();

        String[] argumentosCompletos = juntarTudo.acessarArray();

        if (juntarTudo.podeProsseguir()) {
            System.out.println("Não prosseguiremos pois faltam argumentos!");
        } else {
            armazenarVariaveis(retirarValorBruto, argumentosCompletos, enviarPraSettings);
            HubLogica hubLogica = new HubLogica(height, width, generations, speed, population);
            hubLogica.executarGameOfLife();
        }
    }

    public void armazenarVariaveis(RetirarValorBruto retirarValorBruto, String[] argumentosCompletos, EnviarPraSettings enviarPraSettings) {
        String[] valorBruto = retirarValorBruto.inteirosBrutos(argumentosCompletos);
        Settings settings = enviarPraSettings.enviarArgumentosProntos(valorBruto);
        System.out.println(settings);

        this.height = settings.getHeight();
        this.width = settings.getWidth();
        this.generations = settings.getGenerations();
        this.speed = settings.getSpeed();
        this.population = settings.getPopulation();
    }
}
