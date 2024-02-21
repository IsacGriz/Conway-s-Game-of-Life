package gol.validacao;

import java.util.ArrayList;

public class VerificarValor {
    private final ArrayList<String> erros;
    private final String[] args;

    public VerificarValor(String[] args) {
        this.args = args;
        this.erros = new ArrayList<>();
        this.erros.add(null);
        this.erros.add(null);
        this.erros.add(null);
        this.erros.add(null);
        this.erros.add(null);
    }

    public void verificarValor() {
        for (String arg : args) {
            if (arg.charAt(0) == 'w' || args[0].charAt(0) == 'h' || args[0].charAt(0) == 's' || args[0].charAt(0) == 'g') {
                retornarErroInteiro(arg);
            } else if (arg.charAt(0) == 'p') {
                retornarErroString(arg);
            }
        }
    }

    public void retornarErroInteiro(String argumento) {
        int valor;
        char parametro = argumento.charAt(0);

        String erro = parametro + " = [Valor Inválido]";
        String[] argumentoSplitado = argumento.split("=");

        try {
            valor = Integer.parseInt(argumentoSplitado[1]);
        } catch (Exception NumberFormatException) {
            if (parametro == 'h') erros.add(0, erro);
            if (parametro == 'w') erros.add(1, erro);
            if (parametro == 'g') erros.add(2, erro);
            if (parametro == 's') erros.add(3, erro);
            return;
        }

        if (parametro == 'h' && valor != 10 && valor != 20 && valor != 40 && valor != 80) erros.add(0, erro);
        else if (parametro == 'h') erros.add(0, null);
        if (parametro == 'w' && valor != 10 && valor != 20 && valor != 40) erros.add(1, erro);
        else if (parametro == 'w') erros.add(1, null);
        if (parametro == 'g' && valor < 0) erros.add(2, erro);
        else if (parametro == 'g') erros.add(2, null);
        if (parametro == 's' && valor < 250 || valor > 1000) erros.add(3, erro);
        else if (parametro == 's') erros.add(3, null);
    }

    public void retornarErroString(String argumento) {
        String[] argumentoSplitado = argumento.split("=");

        if (!argumentoSplitado[1].equals("#") && !argumentoSplitado[1].equals("0") && !argumentoSplitado[1].equals("1")) {
            erros.addLast(argumentoSplitado[0] + " = [Valor Inválido]");
        }
        erros.addLast(null);
    }

    public ArrayList<String> acessarArray() {
        return erros;
    }
}