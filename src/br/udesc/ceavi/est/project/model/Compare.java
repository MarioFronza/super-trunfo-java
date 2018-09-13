package br.udesc.ceavi.est.project.model;

/**
 * Classe para gerenciar a vez do usuário jogar
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Compare {
    private Card cardUser;
    private Card cardComp;
    private int userChoice;

    public Compare() {}

    public Compare(Card cardUser, Card carComp, int userChoice) {
        this.cardUser = cardUser;
        this.cardComp = carComp;
        this.userChoice = userChoice;
    }
    
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
}
