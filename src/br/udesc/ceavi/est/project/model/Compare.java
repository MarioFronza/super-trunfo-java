package br.udesc.ceavi.est.project.model;

/**
 * Classe para gerenciar a vez do usuário jogar
 *
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Compare {

    private Card cardUser;
    private Card cardComp;
    private int userChoice;
    private int compChoice;

    // Construtor vazio
    public Compare() {
    }

    // Construtor padrão usado no código
    public Compare(Card cardUser, Card carComp, int userChoice, int compChoice) {
        this.cardUser = cardUser;
        this.cardComp = carComp;
        this.userChoice = userChoice;
        this.compChoice = compChoice;
    }

    // Usado para realizar as comparações quando o usuário escolhe a carta/atributo
    public boolean calculateWinner() {
        float valueChoiceUser = 0;
        float valueChoiceComp = 0;

        switch (userChoice) {
            case 1:
                valueChoiceUser = this.cardUser.getHeight();
                valueChoiceComp = this.cardComp.getHeight();
                break;
            case 2:
                valueChoiceUser = this.cardUser.getSize();
                valueChoiceComp = this.cardComp.getSize();
                break;
            case 3:
                valueChoiceUser = this.cardUser.getWeight();
                valueChoiceComp = this.cardComp.getWeight();
                break;
            case 4:
                valueChoiceUser = this.cardUser.getAge();
                valueChoiceComp = this.cardComp.getAge();
                break;
        }
        return valueChoiceUser > valueChoiceComp;
    }

    // Usado para realizar as comparações quando o computador escolhe a carta/atributo
    public boolean calculateWinnerComp() {
        float valueChoiceUser = 0;
        float valueChoiceComp = 0;
        switch (compChoice) {
            case 1:
                valueChoiceUser = this.cardUser.getHeight();
                valueChoiceComp = this.cardComp.getHeight();
                break;
            case 2:
                valueChoiceUser = this.cardUser.getSize();
                valueChoiceComp = this.cardComp.getSize();
                break;
            case 3:
                valueChoiceUser = this.cardUser.getWeight();
                valueChoiceComp = this.cardComp.getWeight();
                break;
            case 4:
                valueChoiceUser = this.cardUser.getAge();
                valueChoiceComp = this.cardComp.getAge();
                break;
        }
        return valueChoiceComp > valueChoiceUser;
    }

    public String getComputerChoice(int computerChoice) {
        switch (compChoice) {
            case 1:
                return "O computador escolheu altura como atributo";
            case 2:
                return "O computador escolheu comprimento como atributo";
            case 3:
                return "O computador escolheu peso como atributo";
            case 4:
                return "O computador escolheu ano como atributo";
        }
        return null;
    }
}
