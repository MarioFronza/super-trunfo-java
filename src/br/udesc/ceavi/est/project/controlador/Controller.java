package br.udesc.ceavi.est.project.controlador;

import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.lists.ArrayQueue;
import br.udesc.ceavi.est.project.lists.DeckList;
import br.udesc.ceavi.est.project.model.Card;
import br.udesc.ceavi.est.project.model.CompPlay;
import br.udesc.ceavi.est.project.model.Deck;
import br.udesc.ceavi.est.project.model.Compare;
import br.udesc.ceavi.est.project.model.UserPlay;
import br.udesc.ceavi.est.project.view.MainFrame;

/**
 * Classe responsável pelo controle do jogo
 *
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 07/09/2018.
 */
public class Controller {

    MainFrame game = MainFrame.getInstance();
    private static Controller instancia;

    public static Controller getInstance() {
        if (instancia == null) {
            instancia = new Controller();
        }
        return instancia;
    }

    private Deck deck;
    private Card userCard;
    private int userChoice;
    private int compChoice;
    private int positionUserChoice;
    private int positionCompChoice;
    private boolean isUserPlay = true;

    // Fila para os montes
    private static ArrayQueue<Card> queueUser = new ArrayQueue<>(15);
    private static ArrayQueue<Card> queueComp = new ArrayQueue<>(15);

    // Deck list para a mão (ArrayList sem re-ordenação)
    private final static ListDeck<Card> handUser = new DeckList<>(5);
    private final static ListDeck<Card> handComp = new DeckList<>(5);

    private UserPlay userPlay;
    private CompPlay compPlay;

    public Controller() {
        deck = new Deck();
    }

    /**
     * Divide o deck para usuário e computador
     *
     * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
     */
    public void initGame() {
        game.getLblPanel().setText("Escolha a carta");
        deck.createDeck();
        deck.getValues();
        deck.shuffle();
        criarDeck();
        showCards();
    }

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

    // Dúvida para melhorar
    public Card analyzeUserPlay() {
        for (int i = 0; i < handComp.size(); i++) {
            if (handComp.get(i).getAverage() == 4) {
                positionCompChoice = i;
                return handComp.get(i);
            }
        }

        for (int i = 0; i < handComp.size(); i++) {
            if (handComp.get(i).getAverage() == 3) {
                positionCompChoice = i;
                return handComp.get(i);
            }
        }

        for (int i = 0; i < handComp.size(); i++) {
            if (handComp.get(i).getAverage() == 2) {
                positionCompChoice = i;
                return handComp.get(i);
            }
        }
        return handComp.get(0);
    }

    public Card analyzeCompPlay() {
        boolean foundTrufo = false; // Defines if the comp found a "supertrufo"
        boolean foundNormal = false;
        for (int i = 0; i < handComp.size(); i++) {
            // Search a "supertrufo"
            if (handComp.get(i).getWeight() == deck.getBiggerWeight()) {
                foundTrufo = true;
                compChoice = 3;
            } else if (handComp.get(i).getAge() == deck.getBiggerAge()) {
                foundTrufo = true;
                compChoice = 4;
            } else if (handComp.get(i).getSize() == deck.getBiggerSize()) {
                foundTrufo = true;
                compChoice = 2;
            } else if (handComp.get(i).getHeight() == deck.getBiggerHeight()) {
                foundTrufo = true;
                compChoice = 1;
            }
            // Search a normal card with good attributes
            float averageAge = handComp.get(i).getPercentageAverageAge();
            float averageSize = handComp.get(i).getPercentageAverageSize();
            float averageHeight = handComp.get(i).getPercentageAverageHeight();
            float averageWeight = handComp.get(i).getPercentageAverageWeight();
            if (averageAge > averageSize && averageAge > averageHeight && averageAge > averageWeight) {
                compChoice = 3;
                foundNormal = true;
            } else if (averageSize > averageAge && averageSize > averageHeight && averageSize > averageWeight) {
                compChoice = 2;
                foundNormal = true;
            } else if (averageHeight > averageAge && averageHeight > averageSize && averageHeight > averageWeight) {
                compChoice = 1;
                foundNormal = true;
            } else if (averageWeight > averageAge && averageWeight > averageSize && averageWeight > averageHeight) {
                compChoice = 4;
                foundNormal = true;
            }
            if (foundTrufo = true) {
                positionCompChoice = i;
                return handComp.get(i);
            }
            if (foundNormal = true) {
                positionCompChoice = i;
                return handComp.get(i);
            }
        }
        positionCompChoice = 1;
        return handComp.get(0);
    }

    public void compareUserHands() {
        Card compCard = analyzeUserPlay(); // Receive the card
        addCompCardGame(compCard.getName(), compCard.getHeight(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        System.out.println(userChoice);
        Compare compare = new Compare(userCard, compCard, getUserChoice(), compChoice);

        if (!handUser.isEmpty()) {
            handUser.remove(positionUserChoice);
        }
        handComp.remove(positionCompChoice);
        handComp.addLast(queueComp.dequeue());

        // View
        MainFrame.getInstance().getBtnNext().setVisible(false);
        MainFrame.getInstance().getBtnNextRodada().setVisible(true);

        if (compare.calculateWinner() == true) {
            MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
            if (handUser.size() < 5) {
                if (handUser.isEmpty()) {
                    handUser.add(0, userCard);
                } else {
                    handUser.addLast(userCard);
                }
                if (handUser.size() == 5) {
                    queueUser.enqueue(compCard);
                } else {
                    handUser.addLast(compCard);
                }
            }
        } else {
            MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
            queueComp.enqueue(userCard);
            queueComp.enqueue(compCard);
        }
    }

    public void compareCompHands() {
        Card compCard = analyzeUserPlay(); // Receive the card
        addCompCardGame(compCard.getName(), compCard.getHeight(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        System.out.println(userChoice);
        Compare compare = new Compare(userCard, compCard, getUserChoice(), compChoice);

        if (!handComp.isEmpty()) {
            handComp.remove(positionCompChoice);
            changeCompHand();
        }
        handUser.remove(positionUserChoice);
        handUser.addLast(queueUser.dequeue());

        // View
        MainFrame.getInstance().getBtnNext().setVisible(false);
        MainFrame.getInstance().getBtnNextRodada().setVisible(true);

        if (compare.calculateWinner() == true) {
            MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
            queueUser.enqueue(userCard);
            queueUser.enqueue(compCard);
        } else {
            MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
            if (handComp.size() < 5) {
                if (handComp.isEmpty()) {
                    handComp.add(0, compCard);
                } else {
                    handComp.addLast(compCard);
                }
                if (handComp.size() == 5) {
                    queueComp.enqueue(userCard);
                } else {
                    handComp.addLast(userCard);
                }
                changeCompHand();
            }
        }
    }

    public void compareCards() {
        controlBtnAttribute();
        // Control results
        Card compCard = analyzeUserPlay(); // Receive the card
        addCompCardGame(compCard.getName(), compCard.getHeight(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        Compare user = new Compare(userCard, compCard, getUserChoice(), compChoice);

        // Control queue and deck list
        handUser.remove(positionUserChoice);
        handUser.addLast(queueUser.dequeue());
        handComp.remove(positionCompChoice);
        handComp.addLast(queueComp.dequeue());

        MainFrame.getInstance().getBtnNextRodada().setVisible(true);
        if (isUserPlay) {
            if (user.calculateWinner() == true) {
                MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
                queueUser.enqueue(userCard);
                queueUser.enqueue(compCard);
            } else {
                MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
                queueComp.enqueue(userCard);
                queueComp.enqueue(compCard);
            }
        } else {
            switch (userChoice) {
                case 1:
                    MainFrame.getInstance().getLblText().setText("O computador escolheu altura como atributo");
                    break;
                case 2:
                    MainFrame.getInstance().getLblText().setText("O computador escolheu comprimento como atributo");
                    break;
                case 3:
                    MainFrame.getInstance().getLblText().setText("O computador escolheu peso como atributo");
                    break;
                case 4:
                    MainFrame.getInstance().getLblText().setText("O computador escolheu ano como atributo");
                    break;
            }
            if (user.calculateWinnerComp() == true) {
                MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
                queueComp.enqueue(userCard);
                queueComp.enqueue(compCard);
            } else {
                MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
                queueUser.enqueue(userCard);
                queueUser.enqueue(compCard);
            }
        }
    }

    public void showCards() {
        switch (handUser.size()) {
            case 5:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                MainFrame.getInstance().getNameCard3().setText(handUser.get(2).getName());
                MainFrame.getInstance().getCard3Altura().setText(Float.toString(handUser.get(2).getSize()));
                MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(handUser.get(2).getHeight()));
                MainFrame.getInstance().getCard3Peso().setText(Float.toString(handUser.get(2).getWeight()));
                MainFrame.getInstance().getCard3Viveu().setText(Float.toString(handUser.get(2).getAge()));
                MainFrame.getInstance().getNameCard4().setText(handUser.get(3).getName());
                MainFrame.getInstance().getCard4Altura().setText(Float.toString(handUser.get(3).getSize()));
                MainFrame.getInstance().getCard4Comprimento().setText(Float.toString(handUser.get(3).getHeight()));
                MainFrame.getInstance().getCard4Peso().setText(Float.toString(handUser.get(3).getWeight()));
                MainFrame.getInstance().getCard4Viveu().setText(Float.toString(handUser.get(3).getAge()));
                MainFrame.getInstance().getNameCard5().setText(handUser.get(4).getName());
                MainFrame.getInstance().getCard5Altura().setText(Float.toString(handUser.get(4).getSize()));
                MainFrame.getInstance().getCard5Comprimento().setText(Float.toString(handUser.get(4).getHeight()));
                MainFrame.getInstance().getCard5Peso().setText(Float.toString(handUser.get(4).getWeight()));
                MainFrame.getInstance().getCard5Viveu().setText(Float.toString(handUser.get(4).getAge()));
                break;
            case 4:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                MainFrame.getInstance().getNameCard3().setText(handUser.get(2).getName());
                MainFrame.getInstance().getCard3Altura().setText(Float.toString(handUser.get(2).getSize()));
                MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(handUser.get(2).getHeight()));
                MainFrame.getInstance().getCard3Peso().setText(Float.toString(handUser.get(2).getWeight()));
                MainFrame.getInstance().getCard3Viveu().setText(Float.toString(handUser.get(2).getAge()));
                MainFrame.getInstance().getNameCard4().setText(handUser.get(3).getName());
                MainFrame.getInstance().getCard4Altura().setText(Float.toString(handUser.get(3).getSize()));
                MainFrame.getInstance().getCard4Comprimento().setText(Float.toString(handUser.get(3).getHeight()));
                MainFrame.getInstance().getCard4Peso().setText(Float.toString(handUser.get(3).getWeight()));
                MainFrame.getInstance().getCard4Viveu().setText(Float.toString(handUser.get(3).getAge()));
                break;
            case 3:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                MainFrame.getInstance().getNameCard3().setText(handUser.get(2).getName());
                MainFrame.getInstance().getCard3Altura().setText(Float.toString(handUser.get(2).getSize()));
                MainFrame.getInstance().getCard3Comprimento().setText(Float.toString(handUser.get(2).getHeight()));
                MainFrame.getInstance().getCard3Peso().setText(Float.toString(handUser.get(2).getWeight()));
                MainFrame.getInstance().getCard3Viveu().setText(Float.toString(handUser.get(2).getAge()));
                break;
            case 2:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(handUser.get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(handUser.get(0).getAge()));
                MainFrame.getInstance().getNameCard2().setText(handUser.get(1).getName());
                MainFrame.getInstance().getCard2Altura().setText(Float.toString(handUser.get(1).getSize()));
                MainFrame.getInstance().getCard2Comprimento().setText(Float.toString(handUser.get(1).getHeight()));
                MainFrame.getInstance().getCard2Peso().setText(Float.toString(handUser.get(1).getWeight()));
                MainFrame.getInstance().getCard2Viveu().setText(Float.toString(handUser.get(1).getAge()));
                break;
            case 1:
                MainFrame.getInstance().getNameCard1().setText(handUser.get(0).getName());
                MainFrame.getInstance().getCard1Altura().setText(Float.toString(handUser.get(0).getSize()));
                MainFrame.getInstance().getCard1Comprimento().setText(Float.toString(handUser.get(0).getHeight()));
                MainFrame.getInstance().getCard1Peso().setText(Float.toString(getHandUser().get(0).getWeight()));
                MainFrame.getInstance().getCard1Viveu().setText(Float.toString(getHandUser().get(0).getAge()));
                break;
            default:
                break;
        }
        MainFrame.getInstance().getCard1Size().setText(Float.toString(getQueueUser().size()));
        MainFrame.getInstance().getCardComputerSize().setText(Float.toString(getQueueComp().size()));
    }

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

    private void controlBtnCardsVisible() {
        MainFrame.getInstance().getBtnCard1().setEnabled(true);
        MainFrame.getInstance().getBtnCard2().setEnabled(true);
        MainFrame.getInstance().getBtnCard3().setEnabled(true);
        MainFrame.getInstance().getBtnCard4().setEnabled(true);
        MainFrame.getInstance().getBtnCard5().setEnabled(true);
    }

    public void newUserRound() {
        if (!verifyEndGame()) {
            isUserPlay = false;
            changeUserHand();
            changeCompHand();
            verifyEndGame();
            MainFrame.getInstance().getBtnNextRodada().setVisible(true);
            controlBtnCardsVisible();
            controlBtnAttribute();
            cleanPanelCards();
            MainFrame.getInstance().getLblPanel().setText("Escolha a carta");
            MainFrame.getInstance().getLblText().setText("");
        }
        showCards();
    }

    public void addUserCardGame(Card card, int position) {
        setPositionUserChoice(position);
        setUserCard(card);
        controlBtnCards();
        MainFrame.getInstance().getCardUserNome().setText(card.getName());
        MainFrame.getInstance().getCardUserAltura().setText("Altura: " + Float.toString(card.getSize()));
        MainFrame.getInstance().getCardUserComprimento().setText("Comprimento: " + Float.toString(card.getHeight()));
        MainFrame.getInstance().getCardUserPeso().setText("Peso: " + Float.toString(card.getWeight()));
        MainFrame.getInstance().getCardUserAno().setText("Viveu Há: " + Float.toString(card.getAge()));
        MainFrame.getInstance().getLblPanel().setText("O computador já escolheu sua carta");
    }

    public void addCompCardGame(String name, float width, float size, float weight, float age) {
        MainFrame.getInstance().getCardComputerNome().setText("Nome: " + name);
        MainFrame.getInstance().getCardComputerAltura().setText("Altura: " + Float.toString(width));
        MainFrame.getInstance().getCardComputerComprimento().setText("Comprimento: " + Float.toString(size));
        MainFrame.getInstance().getCardComputerPeso().setText("Peso: " + Float.toString(weight));
        MainFrame.getInstance().getCardComputerAno().setText("Viveu Há: " + Float.toString(age));
    }

    public void showCompCardGame() {
        MainFrame.getInstance().getLblText().setText("Escolha o atributo");
        MainFrame.getInstance().getCardComputerNome().setText("Nome: - ");
        MainFrame.getInstance().getCardComputerAltura().setText("Altura: - ");
        MainFrame.getInstance().getCardComputerComprimento().setText("Comprimento: - ");
        MainFrame.getInstance().getCardComputerPeso().setText("Peso: - ");
        MainFrame.getInstance().getCardComputerAno().setText("Viveu Há: - ");
        if (isUserPlay) {
            controlBtnAttributeVisible();
        } else {
            Card card = analyzeCompPlay();
            addCompCardGame(card.getName(), card.getHeight(), card.getSize(), card.getWeight(), card.getAge());
            if (queueUser.isEmpty()) {
                compareUserHands();
            } else if (queueComp.isEmpty()) {
                compareCompHands();
            } else {
                compareCards();
            }
        }
    }

    private boolean verifyEndGame() {
        if (handUser.size() == 0) {
            MainFrame.getInstance().getLblPanel().setText("O computador venceu o jogo :(");
            MainFrame.getInstance().getBtnNextRodada().setVisible(false);
            MainFrame.getInstance().getLblText().setVisible(false);
            controlBtnAttribute();
            controlBtnCards();
            cleanPanelCards();
            return true;
        } else if (handComp.size() == 0) {
            MainFrame.getInstance().getLblPanel().setText("Você venceu o jogo! Parabéns");
            MainFrame.getInstance().getLblText().setVisible(false);
            MainFrame.getInstance().getBtnNextRodada().setVisible(false);
            controlBtnAttribute();
            controlBtnCards();
            cleanPanelCards();
            return true;
        }
        return false;
    }

    public void newCompRound() {
        if (!verifyEndGame()) {
            isUserPlay = true;
            changeUserHand();
            changeCompHand();
            controlBtnAttribute();
            MainFrame.getInstance().getLblPanel().setText("O computador já escolheu sua carta");
            MainFrame.getInstance().getLblText().setText("Escolha a sua carta");
            MainFrame.getInstance().getBtnNextRodada().setVisible(false);
            controlBtnCardsVisible();
            controlBtnAttribute();
            cleanPanelCards();
        }
        showCards();
    }

    // Adiciona o listener para os botõe da view
    public void changeUserHand() {
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

    public void changeCompHand() {
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
        MainFrame.getInstance().getBtnNextRodada().setVisible(false);
    }

    public ArrayQueue<Card> getQueueUser() {
        return queueUser;
    }

    public ArrayQueue<Card> getQueueComp() {
        return queueComp;
    }

    public ListDeck<Card> getHandUser() {
        return handUser;
    }

    public ListDeck<Card> getHandComp() {
        return handComp;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public int getPositionUserChoice() {
        return positionUserChoice;
    }

    public void setPositionUserChoice(int positionUserChoice) {
        this.positionUserChoice = positionUserChoice;
    }

    public int getPositionCompChoice() {
        return positionCompChoice;
    }

    public void setPositionCompChoice(int positionCompChoice) {
        this.positionCompChoice = positionCompChoice;
    }

    public Card getUserCard() {
        return userCard;
    }

    public void setUserCard(Card userCard) {
        this.userCard = userCard;
    }

    public boolean isIsUserPlay() {
        return isUserPlay;
    }

    public void setIsUserPlay(boolean isUserPlay) {
        this.isUserPlay = isUserPlay;
    }
}
