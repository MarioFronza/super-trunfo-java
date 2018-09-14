package br.udesc.ceavi.est.project.model;

import br.udesc.ceavi.est.project.controlador.Controller;
import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.view.MainFrame;

public class UserPlay {

    private final ListDeck<Card> handUser;
    Controller controller = Controller.getInstance();
    private MainFrame game;

    public UserPlay() {
        handUser = controller.getHandUser();
    }

    
}
