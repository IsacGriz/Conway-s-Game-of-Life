package gol.formatacao;

public class RetirarValorBruto {
    public String[] inteirosBrutos(String[] argumentos) {
        argumentos[0] = argumentos[0].substring(10, argumentos[0].length() - 1);
        argumentos[1] = argumentos[1].substring(9, argumentos[1].length() - 1);
        argumentos[2] = argumentos[2].substring(15, argumentos[2].length() - 1);
        argumentos[3] = argumentos[3].substring(9, argumentos[3].length() - 1);
        argumentos[4] = (argumentos[4].substring(15, argumentos[4].length() - 2));

        return argumentos;
    }
}
