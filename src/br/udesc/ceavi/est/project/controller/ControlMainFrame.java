package br.udesc.ceavi.est.project.controller;

import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.lists.ArrayQueue;
import br.udesc.ceavi.est.project.model.Card;
import br.udesc.ceavi.est.project.view.MainFrame;

/**
 * Classe responsável por controlar a view durante o jogo
 *
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 15/09/2018.
 */
public class ControlMainFrame {

    private static ControlMainFrame instancia;

    public static ControlMainFrame getInstance() {
        if (instancia == null) {
            instancia = new ControlMainFrame();
        }
        return instancia;
    }

    public void cleanPanelCards() {
        MainFrame.getInstance().getCardUserNome().setText(" - ");
        MainFrame.getInstance().getCardUserAltura().setText(" - ");
        MainFrame.getInstance().getCardUserComprimento().setText(" - ");
        MainFrame.getInstance().getCardUserPeso().setText(" - ");
        MainFrame.getInstance().getCardUserAno().setText(" - ");
        MainFrame.getInstance().getCardComputerNome().setText(" - ");
        MainFrame.getInstance().getCardComputerAltura().setText(" - ");
        MainFrame.getInstance().getCardComputerComprimento().setText(" - ");
        MainFrame.getInstance().getCardComputerPeso().setText(" - ");
        MainFrame.getInstance().getCardComputerAno().setText(" - ");
        MainFrame.getInstance().getBtnNextRodada().setVisible(false);
    }

    public void addCompCardView(String name, float height, float size, float weight, float age) {
        MainFrame.getInstance().getCardComputerNome().setText("Nome: " + name);
        MainFrame.getInstance().getCardComputerAltura().setText("Altura: " + Float.toString(height));
        MainFrame.getInstance().getCardComputerComprimento().setText("Comprimento: " + Float.toString(size));
        MainFrame.getInstance().getCardComputerPeso().setText("Peso: " + Float.toString(weight));
        MainFrame.getInstance().getCardComputerAno().setText("Viveu Há: " + Float.toString(age));
    }
    
    public void showUserHandCards(ListDeck<Card> handUser, ArrayQueue<Card> queueUser, ArrayQueue<Card> queueComp) {
        switch (handUser.size()) {
            case 5:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                MainFrame.getInstance().getNameCard3().setText(handUser.get(2).getName());
                MainFrame.getInstance().getCard3Altura().setText(Float.toString(handUser.get(2).getHeight()));
                MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(handUser.get(2).getSize()));
                MainFrame.getInstance().getCard3Peso().setText(Float.toString(handUser.get(2).getWeight()));
                MainFrame.getInstance().getCard3Viveu().setText(Float.toString(handUser.get(2).getAge()));
                MainFrame.getInstance().getNameCard4().setText(handUser.get(3).getName());
                MainFrame.getInstance().getCard4Altura().setText(Float.toString(handUser.get(3).getHeight()));
                MainFrame.getInstance().getCard4Comprimento().setText(Float.toString(handUser.get(3).getSize()));
                MainFrame.getInstance().getCard4Peso().setText(Float.toString(handUser.get(3).getWeight()));
                MainFrame.getInstance().getCard4Viveu().setText(Float.toString(handUser.get(3).getAge()));
                MainFrame.getInstance().getNameCard5().setText(handUser.get(4).getName());
                MainFrame.getInstance().getCard5Altura().setText(Float.toString(handUser.get(4).getHeight()));
                MainFrame.getInstance().getCard5Comprimento().setText(Float.toString(handUser.get(4).getSize()));
                MainFrame.getInstance().getCard5Peso().setText(Float.toString(handUser.get(4).getWeight()));
                MainFrame.getInstance().getCard5Viveu().setText(Float.toString(handUser.get(4).getAge()));
                break;
            case 4:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                MainFrame.getInstance().getNameCard3().setText(handUser.get(2).getName());
                MainFrame.getInstance().getCard3Altura().setText(Float.toString(handUser.get(2).getHeight()));
                MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(handUser.get(2).getSize()));
                MainFrame.getInstance().getCard3Peso().setText(Float.toString(handUser.get(2).getWeight()));
                MainFrame.getInstance().getCard3Viveu().setText(Float.toString(handUser.get(2).getAge()));
                MainFrame.getInstance().getNameCard4().setText(handUser.get(3).getName());
                MainFrame.getInstance().getCard4Altura().setText(Float.toString(handUser.get(3).getHeight()));
                MainFrame.getInstance().getCard4Comprimento().setText(Float.toString(handUser.get(3).getSize()));
                MainFrame.getInstance().getCard4Peso().setText(Float.toString(handUser.get(3).getWeight()));
                MainFrame.getInstance().getCard4Viveu().setText(Float.toString(handUser.get(3).getAge()));
                break;
            case 3:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                MainFrame.getInstance().getNameCard3().setText(handUser.get(2).getName());
                MainFrame.getInstance().getCard3Altura().setText(Float.toString(handUser.get(2).getHeight()));
                MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(handUser.get(2).getSize()));
                MainFrame.getInstance().getCard3Peso().setText(Float.toString(handUser.get(2).getWeight()));
                MainFrame.getInstance().getCard3Viveu().setText(Float.toString(handUser.get(2).getAge()));
                break;
            case 2:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                break;
            case 1:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                break;
            default:
                break;
        }
        MainFrame.getInstance().getCard1Size().setText(Integer.toString(queueUser.size()));
        MainFrame.getInstance().getCardComputerSize().setText(Integer.toString(queueComp.size()));
    }
    
    public void changeUserHand(ListDeck<Card> handUser) {
        switch (handUser.size()) {
            case 0:
                MainFrame.getInstance().getBtnCard1().setVisible(false);
                MainFrame.getInstance().getBtnCard2().setVisible(false);
                MainFrame.getInstance().getBtnCard3().setVisible(false);
                MainFrame.getInstance().getBtnCard4().setVisible(false);
                MainFrame.getInstance().getBtnCard5().setVisible(false);
                MainFrame.getInstance().getPanelUser1().setVisible(false);
                MainFrame.getInstance().getPanelUser2().setVisible(false);
                MainFrame.getInstance().getPanelUser3().setVisible(false);
                MainFrame.getInstance().getPanelUser4().setVisible(false);
                MainFrame.getInstance().getPanelUser5().setVisible(false);
                break;
            case 1:
                MainFrame.getInstance().getBtnCard1().setVisible(true);
                MainFrame.getInstance().getBtnCard2().setVisible(false);
                MainFrame.getInstance().getBtnCard3().setVisible(false);
                MainFrame.getInstance().getBtnCard4().setVisible(false);
                MainFrame.getInstance().getBtnCard5().setVisible(false);
                MainFrame.getInstance().getPanelUser1().setVisible(true);
                MainFrame.getInstance().getPanelUser2().setVisible(false);
                MainFrame.getInstance().getPanelUser3().setVisible(false);
                MainFrame.getInstance().getPanelUser4().setVisible(false);
                MainFrame.getInstance().getPanelUser5().setVisible(false);
                break;
            case 2:
                MainFrame.getInstance().getBtnCard1().setVisible(true);
                MainFrame.getInstance().getBtnCard2().setVisible(true);
                MainFrame.getInstance().getBtnCard3().setVisible(false);
                MainFrame.getInstance().getBtnCard4().setVisible(false);
                MainFrame.getInstance().getBtnCard5().setVisible(false);
                MainFrame.getInstance().getPanelUser1().setVisible(true);
                MainFrame.getInstance().getPanelUser2().setVisible(true);
                MainFrame.getInstance().getPanelUser3().setVisible(false);
                MainFrame.getInstance().getPanelUser4().setVisible(false);
                MainFrame.getInstance().getPanelUser5().setVisible(false);
                break;
            case 3:
                MainFrame.getInstance().getBtnCard1().setVisible(true);
                MainFrame.getInstance().getBtnCard2().setVisible(true);
                MainFrame.getInstance().getBtnCard3().setVisible(true);
                MainFrame.getInstance().getBtnCard4().setVisible(false);
                MainFrame.getInstance().getBtnCard5().setVisible(false);
                MainFrame.getInstance().getPanelUser1().setVisible(true);
                MainFrame.getInstance().getPanelUser2().setVisible(true);
                MainFrame.getInstance().getPanelUser3().setVisible(true);
                MainFrame.getInstance().getPanelUser4().setVisible(false);
                MainFrame.getInstance().getPanelUser5().setVisible(false);
                break;
            case 4:
                MainFrame.getInstance().getBtnCard1().setVisible(true);
                MainFrame.getInstance().getBtnCard2().setVisible(true);
                MainFrame.getInstance().getBtnCard3().setVisible(true);
                MainFrame.getInstance().getBtnCard4().setVisible(true);
                MainFrame.getInstance().getBtnCard5().setVisible(false);
                MainFrame.getInstance().getPanelUser1().setVisible(true);
                MainFrame.getInstance().getPanelUser2().setVisible(true);
                MainFrame.getInstance().getPanelUser3().setVisible(true);
                MainFrame.getInstance().getPanelUser4().setVisible(true);
                MainFrame.getInstance().getPanelUser5().setVisible(false);
                break;
            case 5:
                MainFrame.getInstance().getBtnCard1().setVisible(true);
                MainFrame.getInstance().getBtnCard2().setVisible(true);
                MainFrame.getInstance().getBtnCard3().setVisible(true);
                MainFrame.getInstance().getBtnCard4().setVisible(true);
                MainFrame.getInstance().getBtnCard5().setVisible(true);
                MainFrame.getInstance().getPanelUser1().setVisible(true);
                MainFrame.getInstance().getPanelUser2().setVisible(true);
                MainFrame.getInstance().getPanelUser3().setVisible(true);
                MainFrame.getInstance().getPanelUser4().setVisible(true);
                MainFrame.getInstance().getPanelUser5().setVisible(true);
                break;
        }
    }

    public void changeCompHand(ListDeck<Card> handComp) {
        switch (handComp.size()) {
            case 0:
                MainFrame.getInstance().getPanel1().setVisible(false);
                MainFrame.getInstance().getPanel2().setVisible(false);
                MainFrame.getInstance().getPanel3().setVisible(false);
                MainFrame.getInstance().getPanel4().setVisible(false);
                MainFrame.getInstance().getPanel5().setVisible(false);
                break;
            case 1:
                MainFrame.getInstance().getPanel1().setVisible(true);
                MainFrame.getInstance().getPanel2().setVisible(false);
                MainFrame.getInstance().getPanel3().setVisible(false);
                MainFrame.getInstance().getPanel4().setVisible(false);
                MainFrame.getInstance().getPanel5().setVisible(false);
                break;
            case 2:
                MainFrame.getInstance().getPanel1().setVisible(true);
                MainFrame.getInstance().getPanel2().setVisible(true);
                MainFrame.getInstance().getPanel3().setVisible(false);
                MainFrame.getInstance().getPanel4().setVisible(false);
                MainFrame.getInstance().getPanel5().setVisible(false);
                break;
            case 3:
                MainFrame.getInstance().getPanel1().setVisible(true);
                MainFrame.getInstance().getPanel2().setVisible(true);
                MainFrame.getInstance().getPanel3().setVisible(true);
                MainFrame.getInstance().getPanel4().setVisible(false);
                MainFrame.getInstance().getPanel5().setVisible(false);
                break;
            case 4:
                MainFrame.getInstance().getPanel1().setVisible(true);
                MainFrame.getInstance().getPanel2().setVisible(true);
                MainFrame.getInstance().getPanel3().setVisible(true);
                MainFrame.getInstance().getPanel4().setVisible(true);
                MainFrame.getInstance().getPanel5().setVisible(false);
                break;
            case 5:
                MainFrame.getInstance().getPanel1().setVisible(true);
                MainFrame.getInstance().getPanel2().setVisible(true);
                MainFrame.getInstance().getPanel3().setVisible(true);
                MainFrame.getInstance().getPanel4().setVisible(true);
                MainFrame.getInstance().getPanel5().setVisible(true);
                break;
        }
    }
    
    // Control btn status for cards and attributes
    public void controlBtnAttribute() {
        MainFrame.getInstance().getCardUserAltura().setEnabled(false);
        MainFrame.getInstance().getCardUserAno().setEnabled(false);
        MainFrame.getInstance().getCardUserComprimento().setEnabled(false);
        MainFrame.getInstance().getCardUserPeso().setEnabled(false);
    }

    public void controlBtnAttributeVisible() {
        MainFrame.getInstance().getCardUserAltura().setEnabled(true);
        MainFrame.getInstance().getCardUserAno().setEnabled(true);
        MainFrame.getInstance().getCardUserComprimento().setEnabled(true);
        MainFrame.getInstance().getCardUserPeso().setEnabled(true);
    }

    public void controlBtnCards() {
        MainFrame.getInstance().getBtnCard1().setEnabled(false);
        MainFrame.getInstance().getBtnCard2().setEnabled(false);
        MainFrame.getInstance().getBtnCard3().setEnabled(false);
        MainFrame.getInstance().getBtnCard4().setEnabled(false);
        MainFrame.getInstance().getBtnCard5().setEnabled(false);
    }

    public void controlBtnCardsVisible() {
        MainFrame.getInstance().getBtnCard1().setEnabled(true);
        MainFrame.getInstance().getBtnCard2().setEnabled(true);
        MainFrame.getInstance().getBtnCard3().setEnabled(true);
        MainFrame.getInstance().getBtnCard4().setEnabled(true);
        MainFrame.getInstance().getBtnCard5().setEnabled(true);
    }
}
