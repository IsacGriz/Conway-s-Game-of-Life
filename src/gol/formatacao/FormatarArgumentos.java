package gol.formatacao;

public class FormatarArgumentos {
    private final String[] argumentos = new String[5];
    private final String[] args;

    public FormatarArgumentos(String[] args) {
        this.args = args;
    }
    public void formatarArgs() {
        for (String argumento : args) {
            String[] argumentoSplitado = argumento.split("=");
            if (argumentoSplitado.length == 2) teste(argumentoSplitado);
        }
    }

    public void teste(String[] argumentoSplitado) {
        switch (argumentoSplitado[0]){
            case "h" -> argumentos[0] = "Height = [" + argumentoSplitado[1] + "]";
            case "w" -> argumentos[1] = "Width = [" + argumentoSplitado[1] + "]";
            case "g" -> argumentos[2] = "Generations = [" + argumentoSplitado[1] + "]";
            case "s" -> argumentos[3] = "Speed = [" + argumentoSplitado[1] + "]";
            case "p" -> argumentos[4] = "Population = [\"" + argumentoSplitado[1] + "\"]";
        }
    }

    public String[] acessarArray() {
        return argumentos;
    }
}