package br.udesc.ceavi.est.project.principal;

import br.udesc.ceavi.est.project.controller.ControlGamePlay;
import br.udesc.ceavi.est.project.listeners.ListenerMainFrame;
import br.udesc.ceavi.est.project.view.MainFrame;

/**
 * Utilizada para iniciar o jogo
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Principal {
    
    public static void main(String[] args) {
        ListenerMainFrame listener = new ListenerMainFrame();
        ControlGamePlay controller = new ControlGamePlay();
        // Show the view
        MainFrame game = MainFrame.getInstance();
        game.setVisible(true);
        // Initiate game
        controller.initGame();
        // Add listeners
        listener.addActionListener();
    }
}
