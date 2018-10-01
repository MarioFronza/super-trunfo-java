package br.udesc.ceavi.est.project.listeners;

import br.udesc.ceavi.est.project.controller.ControlGamePlay;
import br.udesc.ceavi.est.project.controller.ControlMainFrame;
import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.model.Card;
import br.udesc.ceavi.est.project.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Classe responsável pelos listeneres da view 
 *
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 13/09/2018.
 */
public class ListenerMainFrame {

    ControlMainFrame controlMainFrame = ControlMainFrame.getInstance();
    ControlGamePlay controlGamePlay = ControlGamePlay.getInstance();
    MainFrame game = MainFrame.getInstance();
    private final ListDeck<Card> handUser;

    public ListenerMainFrame() {
        handUser = controlGamePlay.getHandUser();
    }

    public void addActionListener() {
        JButton botao;
        botao = game.getBtnCard1();
        botao.addActionListener(new BtCard1());

        botao = game.getBtnCard2();
        botao.addActionListener(new BtCard2());

        botao = game.getBtnCard3();
        botao.addActionListener(new BtCard3());

        botao = game.getBtnCard4();
        botao.addActionListener(new BtCard4());

        botao = game.getBtnCard5();
        botao.addActionListener(new BtCard5());

        botao = game.getCardUserAltura();
        botao.addActionListener(new BtCardUserAltura());

        botao = game.getCardUserComprimento();
        botao.addActionListener(new BtCardUserComprimenro());

        botao = game.getCardUserPeso();
        botao.addActionListener(new BtCardUserPeso());

        botao = game.getCardUserAno();
        botao.addActionListener(new BtCardUserAno());

        botao = game.getBtnNextRodada();
        botao.addActionListener(new BtCardNextRodada());
    }

    // Classes internar para controle do evento de click
    public class BtCard1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controlGamePlay.showUserCardGame(handUser.get(0), 0);
            controlGamePlay.showCompCardGame();
            controlMainFrame.changeUserHand(handUser);
        }
    }

    private class BtCard2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controlGamePlay.showUserCardGame(handUser.get(1), 1);
            controlGamePlay.showCompCardGame();
            controlMainFrame.changeUserHand(handUser);
        }
    }

    private class BtCard3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controlGamePlay.showUserCardGame(handUser.get(2), 2);
            controlGamePlay.showCompCardGame();
            controlMainFrame.changeUserHand(handUser);
        }
    }

    private class BtCard4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controlGamePlay.showUserCardGame(controlGamePlay.getHandUser().get(3), 3);
            controlGamePlay.showCompCardGame();
            controlMainFrame.changeUserHand(handUser);
        }
    }

    private class BtCard5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controlGamePlay.showUserCardGame(controlGamePlay.getHandUser().get(4), 4);
            controlGamePlay.showCompCardGame();
            controlMainFrame.changeUserHand(handUser);
        }
    }

    private class BtCardUserAltura implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: altura");
            controlGamePlay.setUserChoice(1);
            if (controlGamePlay.getQueueUser().isEmpty()) {
                controlGamePlay.compareUserHands();
            } else if (controlGamePlay.getQueueComp().isEmpty()) {
                controlGamePlay.compareCompHands();
            } else {
                controlGamePlay.compareCards();
            }
        }
    }

    private class BtCardUserComprimenro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: comprimento");
            controlGamePlay.setUserChoice(2);
            if (controlGamePlay.getQueueUser().isEmpty()) {
                controlGamePlay.compareUserHands();
            } else if (controlGamePlay.getQueueComp().isEmpty()) {
                controlGamePlay.compareCompHands();
            } else {
                controlGamePlay.compareCards();
            }
        }
    }

    private class BtCardUserPeso implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: peso");
            controlGamePlay.setUserChoice(3);
            if (controlGamePlay.getQueueUser().isEmpty()) {
                controlGamePlay.compareUserHands();
            } else if (controlGamePlay.getQueueComp().isEmpty()) {
                controlGamePlay.compareCompHands();
            } else {
                controlGamePlay.compareCards();
            }
        }
    }

    private class BtCardUserAno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: ano");
            controlGamePlay.setUserChoice(4);
            if (controlGamePlay.getQueueUser().isEmpty()) {
                controlGamePlay.compareUserHands();
            } else if (controlGamePlay.getQueueComp().isEmpty()) {
                controlGamePlay.compareCompHands();
            } else {
                controlGamePlay.compareCards();
            }
        }
    }

    private class BtCardNextRodada implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (controlGamePlay.isIsUserPlay()) {
                controlGamePlay.newUserRound();
            } else {
                controlGamePlay.newCompRound();
            }
        }
    }
}
