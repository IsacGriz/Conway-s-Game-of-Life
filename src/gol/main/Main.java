package gol.main;

import gol.mediacao.Hub;

public class Main {
   public static void main(String[] args) {
        Hub hub = new Hub(args);

        hub.verificarErrosVariaveis();
    }
}