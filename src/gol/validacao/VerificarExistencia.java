package gol.validacao;

import java.util.ArrayList;

public class VerificarExistencia {
    private final String[] args;
    private final ArrayList<String> erros = new ArrayList<>();

    public VerificarExistencia(String[] args) {
        this.args = args;
    }
    public void verificarExistencia() {
        String carcateres = "";
        for (String argumento : args) {
            carcateres += argumento.charAt(0);
        }

        if(!carcateres.contains("h")) erros.add("Height = [Não presente]");
        else erros.add(null);
        if(!carcateres.contains("w")) erros.add("Width = [Não presente]");
        else erros.add(null);
        if(!carcateres.contains("g")) erros.add("Generations = [Não presente]");
        else erros.add(null);
        if(!carcateres.contains("s")) erros.add("Speed = [Não presente]");
        else erros.add(null);
        if(!carcateres.contains("p")) erros.add("Population = [Não presente]");
        else erros.add(null);
    }
    public ArrayList<String> acessarArray() {
        return erros;
    }
}