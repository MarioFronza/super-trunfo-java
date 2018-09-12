package br.udesc.ceavi.est.project.controlador;

import br.udesc.ceavi.est.project.interfaces.List;
import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.lists.ArrayQueue;
import br.udesc.ceavi.est.project.lists.DeckList;
import br.udesc.ceavi.est.project.model.Card;
import br.udesc.ceavi.est.project.model.Deck;
import br.udesc.ceavi.est.project.model.User;
import br.udesc.ceavi.est.project.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Classe responsável pelo controle do jogo
 *
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 07/09/2018.
 */
public class Controller {

    private static Controller instancia;

    MainFrame game = MainFrame.getInstance();

    public static Controller getInstance() {
        if (instancia == null) {
            instancia = new Controller();
        }
        return instancia;
    }

    private final Deck deck = new Deck();
    private Card userCard;
    private int userChoice;
    private int positionUserChoice;
    private int positionCompChoice;

    // Fila para os montes
    private final ArrayQueue<Card> queueUser = new ArrayQueue<>(10);
    private final ArrayQueue<Card> queueComp = new ArrayQueue<>(10);

    // Deck list para a mão (ArrayList sem re-ordenação)
    private final ListDeck<Card> handUser = new DeckList<>(5);
    private final ListDeck<Card> handComp = new DeckList<>(5);

    /**
     * Divide o deck para usuário e computador
     *
     * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
     */
    public void criarDeck() {
        int qtd = deck.getDeck().size() / 2;

        int counter = 1;
        while (counter <= qtd) {
            queueUser.enqueue(deck.getDeck().remove(0));
            queueComp.enqueue(deck.getDeck().remove(0));
            counter++;
        }

        for (int i = 0; i < (qtd / 2); i++) {
            handUser.add(i, queueUser.dequeue());
            handComp.add(i, queueComp.dequeue());
        }
    }

    public Card analyzeHandComp() {
        for (int i = 0; i < handComp.size(); i++) {
            if (handComp.get(i).getSize() == deck.getBiggerSize()) {
                positionCompChoice = i;
                return handComp.get(i);
            } else if (handComp.get(i).getSize() > deck.getAverageSize()) {
                positionCompChoice = i;
                return handComp.get(i);
            }

            if (handComp.get(i).getAge() == deck.getBiggerAge()) {
                positionCompChoice = i;
                return handComp.get(i);
            } else if (handComp.get(i).getAge() > deck.getAverageAge()) {
                positionCompChoice = i;
                return handComp.get(i);
            }

            if (handComp.get(i).getWeight() == deck.getBiggerWeight()) {
                positionCompChoice = i;
                return handComp.get(i);
            } else if (handComp.get(i).getWeight() > deck.getAverageWeight()) {
                positionCompChoice = i;
                return handComp.get(i);
            }

            if (handComp.get(i).getWidth() == deck.getBiggerWidth()) {
                positionCompChoice = i;
                return handComp.get(i);
            } else if (handComp.get(i).getWidth() > deck.getAverageWidth()) {
                positionCompChoice = i;
                return handComp.get(i);
            }
        }
        return handComp.get(0);
    }

    private void compareCards() {
        // Control results
        Card compCard = analyzeHandComp(); // Receive the card
        addCompCardGame(compCard.getName(), compCard.getWidth(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        System.out.println(userChoice);
        User user = new User(userCard, compCard, getUserChoice());

        // Control queue and arrayList
        handUser.remove(positionUserChoice);
        handUser.addLast(queueUser.dequeue());
        handComp.remove(positionCompChoice);
        handComp.addLast(queueComp.dequeue());

        // View
        MainFrame.getInstance().getBtnNext().setVisible(false);
        MainFrame.getInstance().getBtnNextRodada().setVisible(true);
        if (user.calculateWinner() == true) {
            MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
            queueUser.enqueue(userCard);
            queueUser.enqueue(compCard);
        } else {
            MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
            queueComp.enqueue(userCard);
            queueComp.enqueue(compCard);
        }
    }

    private ArrayQueue<Card> getQueueUser() {
        return queueUser;
    }

    private ArrayQueue<Card> getQueueComp() {
        return queueComp;
    }

    private ListDeck<Card> getHandUser() {
        return handUser;
    }

    private ListDeck<Card> getHandComp() {
        return handComp;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    // VIEW
    // ------------------------------------------------------------------------
    // Mostra as cartas do usuário na view
    public void showCards() {
        MainFrame.getInstance().getNameCard1().setText(getHandUser().get(0).getName());
        MainFrame.getInstance().getCard1Altura().setText(Float.toString(getHandUser().get(0).getSize()));
        MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(getHandUser().get(0).getWidth()));
        MainFrame.getInstance().getCard1Peso().setText(Float.toString(getHandUser().get(0).getWeight()));
        MainFrame.getInstance().getCard1Viveu().setText(Integer.toString(getHandUser().get(0).getAge()));

        MainFrame.getInstance().getNameCard2().setText(getHandUser().get(1).getName());
        MainFrame.getInstance().getCard2Altura().setText(Float.toString(getHandUser().get(1).getSize()));
        MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(getHandUser().get(1).getWidth()));
        MainFrame.getInstance().getCard2Peso().setText(Float.toString(getHandUser().get(1).getWeight()));
        MainFrame.getInstance().getCard2Viveu().setText(Integer.toString(getHandUser().get(1).getAge()));

        MainFrame.getInstance().getNameCard3().setText(getHandUser().get(2).getName());
        MainFrame.getInstance().getCard3Altura().setText(Float.toString(getHandUser().get(2).getSize()));
        MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(getHandUser().get(2).getWidth()));
        MainFrame.getInstance().getCard3Peso().setText(Float.toString(getHandUser().get(2).getWeight()));
        MainFrame.getInstance().getCard3Viveu().setText(Integer.toString(getHandUser().get(2).getAge()));

        MainFrame.getInstance().getNameCard4().setText(getHandUser().get(3).getName());
        MainFrame.getInstance().getCard4Altura().setText(Float.toString(getHandUser().get(3).getSize()));
        MainFrame.getInstance().getCard4Comprimento().setText(Float.toString(getHandUser().get(3).getWidth()));
        MainFrame.getInstance().getCard4Peso().setText(Float.toString(getHandUser().get(3).getWeight()));
        MainFrame.getInstance().getCard4Viveu().setText(Integer.toString(getHandUser().get(3).getAge()));

        MainFrame.getInstance().getNameCard5().setText(getHandUser().get(4).getName());
        MainFrame.getInstance().getCard5Altura().setText(Float.toString(getHandUser().get(4).getSize()));
        MainFrame.getInstance().getCard5Comprimento().setText(Float.toString(getHandUser().get(4).getWidth()));
        MainFrame.getInstance().getCard5Peso().setText(Float.toString(getHandUser().get(4).getWeight()));
        MainFrame.getInstance().getCard5Viveu().setText(Integer.toString(getHandUser().get(4).getAge()));

        MainFrame.getInstance().getCard1Size().setText(Integer.toString(getQueueUser().size()));
        MainFrame.getInstance().getCardComputerSize().setText(Integer.toString(getQueueComp().size()));
    }

    // Adiciona a carta escolhida do usuário na tela
    private void addUserCardGame(Card card, int position) {
        controlBtnAttributeVisible();
        controlBtnCards();
        userCard = card;
        positionUserChoice = position;
        MainFrame.getInstance().getCardUserNome().setText(card.getName());
        MainFrame.getInstance().getCardUserAltura().setText("Altura: " + Float.toString(card.getSize()));
        MainFrame.getInstance().getCardUserComprimento().setText("Comprimento: " + Float.toString(card.getWidth()));
        MainFrame.getInstance().getCardUserPeso().setText("Peso: " + Float.toString(card.getWeight()));
        MainFrame.getInstance().getCardUserAno().setText("Viveu Há: " + Integer.toString(card.getAge()));
        MainFrame.getInstance().getLblPanel().setText("O computador já escolheu sua carta");
        MainFrame.getInstance().getLblText().setText("Escolha o atributo");
    }

    private void addCompCardGame(String name, float width, float size, float weight, int age) {
        MainFrame.getInstance().getCardComputerNome().setText("Nome: " + name);
        MainFrame.getInstance().getCardComputerAltura().setText("Altura: " + Float.toString(width));
        MainFrame.getInstance().getCardComputerComprimento().setText("Comprimento: " + Float.toString(size));
        MainFrame.getInstance().getCardComputerPeso().setText("Peso: " + Float.toString(weight));
        MainFrame.getInstance().getCardComputerAno().setText("Viveu Há: " + Integer.toString(age));
    }

    private void cleanPanelCards() {
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
    }

    private void showCompCardGame() {
        MainFrame.getInstance().getCardComputerNome().setText("Nome: - ");
        MainFrame.getInstance().getCardComputerAltura().setText("Altura: - ");
        MainFrame.getInstance().getCardComputerComprimento().setText("Comprimento: - ");
        MainFrame.getInstance().getCardComputerPeso().setText("Peso: - ");
        MainFrame.getInstance().getCardComputerAno().setText("Viveu Há: - ");
    }

    private void verifyEndGame() {
        if (handUser.size() == 0) {
            MainFrame.getInstance().getLblPanel().setText("Você venceu o jogo! Parabéns");
            controlBtnAttribute();
            controlBtnCards();
            cleanPanelCards();
        } else if (handComp.size() == 0) {
            MainFrame.getInstance().getLblPanel().setText("O computador venceu o jogo :(");
        }
        
        if (queueComp.size() == 0) {
            MainFrame.getInstance().getCardComputerSize().setText(Integer.toString(getHandComp().size()) + " cartas na mão");
        }
    }

    private void newUserRound() {
        verifyEndGame();
        MainFrame.getInstance().getBtnNextRodada().setVisible(false);
        controlBtnCardsVisible();
        controlBtnAttribute();
        cleanPanelCards();
        showCards();
        MainFrame.getInstance().getLblPanel().setText("Escolha a carta");
        MainFrame.getInstance().getLblText().setText("");
    }

    private void newCompRound() {

    }

    private void controlBtnAttribute() {
        MainFrame.getInstance().getCardUserAltura().setEnabled(false);
        MainFrame.getInstance().getCardUserAno().setEnabled(false);
        MainFrame.getInstance().getCardUserComprimento().setEnabled(false);
        MainFrame.getInstance().getCardUserPeso().setEnabled(false);
    }

    private void controlBtnAttributeVisible() {
        MainFrame.getInstance().getCardUserAltura().setEnabled(true);
        MainFrame.getInstance().getCardUserAno().setEnabled(true);
        MainFrame.getInstance().getCardUserComprimento().setEnabled(true);
        MainFrame.getInstance().getCardUserPeso().setEnabled(true);
    }

    private void controlBtnCards() {
        MainFrame.getInstance().getBtnCard1().setEnabled(false);
        MainFrame.getInstance().getBtnCard2().setEnabled(false);
        MainFrame.getInstance().getBtnCard3().setEnabled(false);
        MainFrame.getInstance().getBtnCard4().setEnabled(false);
        MainFrame.getInstance().getBtnCard5().setEnabled(false);
    }

    private void controlBtnCardsVisible() {
        MainFrame.getInstance().getBtnCard1().setEnabled(true);
        MainFrame.getInstance().getBtnCard2().setEnabled(true);
        MainFrame.getInstance().getBtnCard3().setEnabled(true);
        MainFrame.getInstance().getBtnCard4().setEnabled(true);
        MainFrame.getInstance().getBtnCard5().setEnabled(true);
    }

    // Adiciona o listener para os botõe da view
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
            addUserCardGame(handUser.get(0), 0);
            showCompCardGame();
        }

    }

    private class BtCard2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            addUserCardGame(handUser.get(1), 1);
            showCompCardGame();
        }
    }

    private class BtCard3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            addUserCardGame(handUser.get(2), 2);
            showCompCardGame();
        }
    }

    private class BtCard4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            addUserCardGame(handUser.get(3), 3);
            positionUserChoice = 3;
            showCompCardGame();
        }
    }

    private class BtCard5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            addUserCardGame(handUser.get(4), 4);
            showCompCardGame();
        }
    }

    private class BtCardUserAltura implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: altura");
            setUserChoice(1);
            compareCards();
        }
    }

    private class BtCardUserComprimenro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: comprimento");
            setUserChoice(2);
            compareCards();
        }
    }

    private class BtCardUserPeso implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: peso");
            setUserChoice(3);
            compareCards();
        }
    }

    private class BtCardUserAno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            MainFrame.getInstance().getLblText().setText("Atributo escolhido: ano");
            setUserChoice(4);
            compareCards();
        }
    }

    private class BtCardNextRodada implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            newUserRound();
        }
    }
}
