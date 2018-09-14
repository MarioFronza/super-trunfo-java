package br.udesc.ceavi.est.project.listeners;

import br.udesc.ceavi.est.project.controlador.Controller;
import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.model.Card;
import br.udesc.ceavi.est.project.model.CompPlay;
import br.udesc.ceavi.est.project.model.UserPlay;
import br.udesc.ceavi.est.project.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ListenerMainFrame {

    MainFrame game = MainFrame.getInstance();
    Controller controller = Controller.getInstance();
    private final ListDeck<Card> handUser;
    private final UserPlay userPlay;
    private final CompPlay compPlay;

    public ListenerMainFrame() {
        handUser = controller.getHandUser();
        userPlay = new UserPlay();
        compPlay = new CompPlay();
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
            controller.addUserCardGame(handUser.get(0), 0);
            controller.showCompCardGame();
            controller.changeUserHand();
        }
    }

    private class BtCard2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controller.addUserCardGame(handUser.get(1), 1);
            controller.showCompCardGame();
            controller.changeUserHand();
        }
    }

    private class BtCard3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controller.addUserCardGame(handUser.get(2), 2);
            controller.showCompCardGame();
            controller.changeUserHand();
        }
    }

    private class BtCard4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controller.addUserCardGame(controller.getHandUser().get(3), 3);
            controller.showCompCardGame();
            controller.changeUserHand();
        }
    }

    private class BtCard5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            controller.addUserCardGame(controller.getHandUser().get(4), 4);
            controller.showCompCardGame();
            controller.changeUserHand();
        }
    }

    private class BtCardUserAltura implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: altura");
            controller.setUserChoice(1);
            if (controller.getQueueUser().isEmpty()) {
                controller.compareUserHands();
            } else if (controller.getQueueComp().isEmpty()) {
                controller.compareCompHands();
            } else {
                controller.compareCards();
            }
        }
    }

    private class BtCardUserComprimenro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: comprimento");
            controller.setUserChoice(2);
            if (controller.getQueueUser().isEmpty()) {
                controller.compareUserHands();
            } else if (controller.getQueueComp().isEmpty()) {
                controller.compareCompHands();
            } else {
                controller.compareCards();
            }
        }
    }

    private class BtCardUserPeso implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: peso");
            controller.setUserChoice(3);
            if (controller.getQueueUser().isEmpty()) {
                controller.compareUserHands();
            } else if (controller.getQueueComp().isEmpty()) {
                controller.compareCompHands();
            } else {
                controller.compareCards();
            }
        }
    }

    private class BtCardUserAno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: ano");
            controller.setUserChoice(4);
            System.out.println(controller.getQueueUser().isEmpty());
            if (controller.getQueueUser().isEmpty()) {
                controller.compareUserHands();
            } else if (controller.getQueueComp().isEmpty()) {
                controller.compareCompHands();
            } else {
                controller.compareCards();
            }
        }
    }

    private class BtCardNextRodada implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (controller.isIsUserPlay()) {
                controller.newUserRound();
            } else {
                controller.newCompRound();
            }
        }
    }
}
