package br.udesc.ceavi.est.project.controller;

import br.udesc.ceavi.est.project.interfaces.ListDeck;
import br.udesc.ceavi.est.project.lists.ArrayQueue;
import br.udesc.ceavi.est.project.lists.DeckList;
import br.udesc.ceavi.est.project.model.Card;
import br.udesc.ceavi.est.project.model.Compare;
import br.udesc.ceavi.est.project.model.Deck;
import br.udesc.ceavi.est.project.view.MainFrame;

/**
 * Classe responsável pelo controle do jogo
 *
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 07/09/2018.
 */
public class ControlGamePlay {

    MainFrame game = MainFrame.getInstance();
    private static ControlGamePlay instancia;

    public static ControlGamePlay getInstance() {
        if (instancia == null) {
            instancia = new ControlGamePlay();
        }
        return instancia;
    }

    private Deck deck;
    private int userChoice;
    private int compChoice;
    private int positionUserChoice;
    private int positionCompChoice;
    private boolean isUserPlay = true;
    private Card compCard;
    private Card userCard;

    // Fila para os montes
    private static ArrayQueue<Card> queueUser = new ArrayQueue<>(15);
    private static ArrayQueue<Card> queueComp = new ArrayQueue<>(15);

    // Deck list para a mão (ArrayList sem re-ordenação)
    private final static ListDeck<Card> handUser = new DeckList<>(5);
    private final static ListDeck<Card> handComp = new DeckList<>(5);

    // Get the view controller
    ControlMainFrame controlMainFrame = ControlMainFrame.getInstance();

    public ControlGamePlay() {
        deck = new Deck();
    }

    public void initGame() {
        deck.createDeck();
        deck.getValues();
        deck.shuffle();
        separateDeck();
        controlMainFrame.showUserHandCards(handUser, queueUser, queueComp);
    }

    public void separateDeck() {
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

    public Card analyzeUserPlay() {
        int bestAverage = -1;

        for (int i = 0; i < handComp.size(); i++) {
            if (handComp.get(i).getAverage() > bestAverage) {
                bestAverage = handComp.get(i).getAverage();
                positionCompChoice = i;
            }
        }
        return handComp.get(positionCompChoice);
    }

    public Card analyzeCompPlay() {
        boolean foundTrunfo = false; // Defines if the comp found a "supertrunfo"
        float bestValue = 0;
        for (int i = 0; i < handComp.size(); i++) {
            // Search a "supertrufo"
            if (handComp.get(i).getWeight() == deck.getBiggerWeight()) {
                foundTrunfo = true;
                compChoice = 3;
                positionCompChoice = i;
            }

            if (handComp.get(i).getAge() == deck.getBiggerAge()) {
                foundTrunfo = true;
                compChoice = 4;
                positionCompChoice = i;
            }

            if (handComp.get(i).getSize() == deck.getBiggerSize()) {
                foundTrunfo = true;
                compChoice = 2;
                positionCompChoice = i;
            }

            if (handComp.get(i).getHeight() == deck.getBiggerHeight()) {
                foundTrunfo = true;
                compChoice = 1;
                positionCompChoice = i;
            }

            if (foundTrunfo == true) {
                return handComp.get(positionCompChoice);
            }

            // Search a normal card with good attributes
            float averageAge = handComp.get(i).getPercentageAverageAge();
            float averageSize = handComp.get(i).getPercentageAverageSize();
            float averageHeight = handComp.get(i).getPercentageAverageHeight();
            float averageWeight = handComp.get(i).getPercentageAverageWeight();

            if (averageAge > averageSize && averageAge > averageHeight && averageAge > averageWeight && averageAge > bestValue) {
                compChoice = 4;
                bestValue = averageAge;
                positionCompChoice = i;
            }
            if (averageSize > averageAge && averageSize > averageHeight && averageSize > averageWeight && averageAge > bestValue) {
                compChoice = 2;
                bestValue = averageSize;
                positionCompChoice = i;
            }
            if (averageHeight > averageAge && averageHeight > averageSize && averageHeight > averageWeight && averageAge > bestValue) {
                compChoice = 1;
                bestValue = averageHeight;
                positionCompChoice = i;
            }
            if (averageWeight > averageAge && averageWeight > averageSize && averageWeight > averageHeight && averageAge > bestValue) {
                compChoice = 3;
                bestValue = averageWeight;
                positionCompChoice = i;
            }
        }
        bestValue = 0;
        return handComp.get(positionCompChoice);
    }

    public void compareCards() {
        compCard = null;
        positionCompChoice = 0;
        controlMainFrame.controlBtnAttribute();
        if (isUserPlay) {
            compCard = analyzeUserPlay();
        } else {
            compCard = analyzeCompPlay();
        }
        controlMainFrame.addCompCardView(compCard.getName(), compCard.getHeight(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        Compare compare = new Compare(userCard, compCard, userChoice, compChoice);

        handUser.remove(positionUserChoice);
        handComp.remove(positionCompChoice);
        handUser.addLast(queueUser.dequeue());
        handComp.addLast(queueComp.dequeue());

        MainFrame.getInstance().getBtnNextRodada().setVisible(true);
        if (isUserPlay) {
            if (compare.calculateWinnerUser() == true) {
                MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
                queueUser.enqueue(userCard);
                queueUser.enqueue(compCard);
            } else {
                MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
                queueComp.enqueue(userCard);
                queueComp.enqueue(compCard);
            }
        } else {
            if (compare.calculateWinnerComp() == true) {
                MainFrame.getInstance().getLblText().setText(compare.getComputerChoice());
                MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
                queueComp.enqueue(userCard);
                queueComp.enqueue(compCard);
            } else {
                MainFrame.getInstance().getLblText().setText(compare.getComputerChoice());
                MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
                queueUser.enqueue(userCard);
                queueUser.enqueue(compCard);
            }
        }

    }

    public void compareUserHands() {
        compCard = null;
        positionCompChoice = 0;
        if (isUserPlay) {
            compCard = analyzeUserPlay();
        } else {
            compCard = analyzeCompPlay();
        } // Receive the card
        controlMainFrame.addCompCardView(compCard.getName(), compCard.getHeight(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        Compare compare = new Compare(userCard, compCard, getUserChoice(), compChoice);

        if (!handUser.isEmpty()) {
            handUser.remove(positionUserChoice);
        }
        handComp.remove(positionCompChoice);
        handComp.addLast(queueComp.dequeue());

        // View
        MainFrame.getInstance().getBtnNextRodada().setVisible(true);
        if (isUserPlay) {
            if (compare.calculateWinnerUser() == true) {
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
        } else {
            if (compare.calculateWinnerComp()) {
                MainFrame.getInstance().getLblText().setText(compare.getComputerChoice());
                MainFrame.getInstance().getLblPanel().setText("O computador venceu a rodada!");
                queueComp.enqueue(userCard);
                queueComp.enqueue(compCard);
            } else {
                MainFrame.getInstance().getLblText().setText(compare.getComputerChoice());
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
            }
        }
    }

    public void compareCompHands() {
        compCard = null;
        positionCompChoice = 0;
        if (isUserPlay) {
            compCard = analyzeUserPlay();
        } else {
            compCard = analyzeCompPlay();
        } // Receive the card
        controlMainFrame.addCompCardView(compCard.getName(), compCard.getHeight(), compCard.getSize(), compCard.getWeight(), compCard.getAge());
        Compare compare = new Compare(userCard, compCard, getUserChoice(), compChoice);

        if (!handComp.isEmpty()) {
            handComp.remove(positionCompChoice);
            controlMainFrame.changeCompHand(handComp);
        }
        handUser.remove(positionUserChoice);
        handUser.addLast(queueUser.dequeue());

        // View
        MainFrame.getInstance().getBtnNextRodada().setVisible(true);
        if (isUserPlay) {
            if (compare.calculateWinnerUser() == true) {
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
                }
            }
        } else {
            if (compare.calculateWinnerComp() == true) {
                MainFrame.getInstance().getLblText().setText(compare.getComputerChoice());
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
                }
            } else {
                MainFrame.getInstance().getLblText().setText(compare.getComputerChoice());
                MainFrame.getInstance().getLblPanel().setText("Você venceu a rodada!");
                queueUser.enqueue(userCard);
                queueUser.enqueue(compCard);
            }
        }

    }

    public void showUserCardGame(Card card, int position) {
        setPositionUserChoice(position); // Qual a 
        setUserCard(card); // Recebe a carta escolhida e salva em um atributo
        controlMainFrame.controlBtnCards(); // View
        MainFrame.getInstance().getCardUserNome().setText(card.getName());
        MainFrame.getInstance().getCardUserAltura().setText("Altura: " + Float.toString(card.getHeight()));
        MainFrame.getInstance().getCardUserComprimento().setText("Comprimento: " + Float.toString(card.getSize()));
        MainFrame.getInstance().getCardUserPeso().setText("Peso: " + Float.toString(card.getWeight()));
        MainFrame.getInstance().getCardUserAno().setText("Viveu Há: " + Float.toString(card.getAge()));
        MainFrame.getInstance().getLblPanel().setText("O computador já escolheu sua carta");
    }

    public void showCompCardGame() {
        if (isUserPlay) {
            controlMainFrame.controlBtnAttributeVisible();
        } else {
            Card card = analyzeCompPlay();
            controlMainFrame.addCompCardView(card.getName(), card.getHeight(), card.getSize(), card.getWeight(), card.getAge());
            if (queueUser.isEmpty()) {
                compareUserHands();
            } else if (queueComp.isEmpty()) {
                compareCompHands();
            } else {
                compareCards();
            }
        }
    }

    public void newCompRound() {
        controlMainFrame.changeUserHand(handUser);
        controlMainFrame.changeCompHand(handComp);
        if (!verifyEndGame()) {
            isUserPlay = true;
            MainFrame.getInstance().getLblPanel().setText("Escolha a sua carta");
            MainFrame.getInstance().getLblText().setText("");
            MainFrame.getInstance().getBtnNextRodada().setVisible(false);
            controlMainFrame.controlBtnCardsVisible();
            controlMainFrame.controlBtnAttribute();
            controlMainFrame.cleanPanelCards();
        }
        controlMainFrame.showUserHandCards(handUser, queueUser, queueComp);
    }

    public void newUserRound() {
        controlMainFrame.changeUserHand(handUser);
        controlMainFrame.changeCompHand(handComp);
        if (!verifyEndGame()) {
            isUserPlay = false;
            verifyEndGame();
            MainFrame.getInstance().getBtnNextRodada().setVisible(true);
            controlMainFrame.controlBtnCardsVisible();
            controlMainFrame.controlBtnAttribute();
            controlMainFrame.cleanPanelCards();
            MainFrame.getInstance().getLblPanel().setText("Escolha a sua carta");
            MainFrame.getInstance().getLblText().setText("");
        }
        controlMainFrame.showUserHandCards(handUser, queueUser, queueComp);
    }

    private boolean verifyEndGame() {
        if (handUser.size() == 0) {
            MainFrame.getInstance().getLblPanel().setText("O computador venceu o jogo :(");
            MainFrame.getInstance().getBtnNextRodada().setVisible(false);
            MainFrame.getInstance().getLblText().setVisible(false);
            controlMainFrame.controlBtnAttribute();
            controlMainFrame.controlBtnCards();
            controlMainFrame.cleanPanelCards();
            return true;
        } else if (handComp.size() == 0) {
            MainFrame.getInstance().getLblPanel().setText("Você venceu o jogo! Parabéns");
            MainFrame.getInstance().getBtnNextRodada().setVisible(false);
            MainFrame.getInstance().getLblText().setVisible(false);
            controlMainFrame.controlBtnAttribute();
            controlMainFrame.controlBtnCards();
            controlMainFrame.cleanPanelCards();
            return true;
        }
        return false;
    }

    // getters and setters for ControlGamePlay
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
