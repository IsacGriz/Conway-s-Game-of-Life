package gol.formatacao;

import java.util.ArrayList;

public class JuntarTudo {
    private final String[] argumentos = new String[5];
    private final String[] args;
    private final ArrayList<String> errosValores;
    private final ArrayList<String> errosExistencia;
    private boolean temErro = false;

    public JuntarTudo(String[] args, ArrayList<String> errosValores, ArrayList<String> errosExistencia) {
        this.args = args;
        this.errosValores = errosValores;
        this.errosExistencia = errosExistencia;
    }

    public void juntarTudo() {
        for (int i = 0; i < 5; i++) {
            if (errosExistencia.get(i) == null && errosValores.get(i) == null) {
                argumentos[i] = args[i];
            } else if (errosValores.get(i) == null) {
                if (i != 4) {
                    argumentos[i] = errosExistencia.get(i);
                    temErro = true;
                } else argumentos[i] = "Population = [\"RND\"]";
            } else {
                if (i != 4) {
                    temErro = true;
                    argumentos[i] = errosValores.get(i);
                } else argumentos[i] = "Population = [\"RND\"]";
            }
        }
    }

    public String[] acessarArray() {
        return argumentos;
    }

    public boolean podeProsseguir() {
        return temErro;
    }
}
