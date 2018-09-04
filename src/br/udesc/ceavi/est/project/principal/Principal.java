package br.udesc.ceavi.est.project.principal;

import br.udesc.ceavi.est.project.view.GameInit;

/**
 * Utilizada para iniciar o jogo
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Principal {

    public static void main(String[] args) {
        GameInit startGame = new GameInit();
        startGame.run();
    }
}
