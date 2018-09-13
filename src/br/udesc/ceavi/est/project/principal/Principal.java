package br.udesc.ceavi.est.project.principal;

import br.udesc.ceavi.est.project.controlador.Controller;
import br.udesc.ceavi.est.project.view.MainFrame;

/**
 * Utilizada para iniciar o jogo
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Principal {
    
    
    public static void main(String[] args) {
        Controller controller = new Controller();
        MainFrame game = MainFrame.getInstance();
        game.setVisible(true);
        controller.initGame();
    }
}
