package br.udesc.ceavi.est.project.model;

import br.udesc.ceavi.est.project.lists.ArrayList;
import java.util.Random;

/**
 * Classe para gerenciar o baralho
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Deck {
    
    private ArrayList<Card> deck = new ArrayList<>(20);
    private float averageWeight;
    private float averageHeight;
    private float averageSize;
    private float averageAge;
    private float biggerWeight;
    private float biggerHeight;
    private float biggerSize;
    private float biggerAge;

    // Construtor
    public Deck() {
        
    }
    
    // Cria o deck com as cartas
    public void createDeck() {
        Card card;
        card = new Card("Peteinossauro", 0.3f, 0.6f, 0.1f, 210.0f);
        deck.add(card);
        card = new Card("Oftamossauro", 1.3f, 5.0f, 3000.0f, 165.0f);
        deck.add(card);
        card = new Card("Alossauro", 5.2f, 14.0f, 3600.0f, 151.0f);
        deck.add(card);
        card = new Card("Globidens", 1.1f, 6.0f, 400.0f, 150.0f);
        deck.add(card);
        card = new Card("Barionix", 8.0f, 12.0f, 2000.0f, 125.0f);
        deck.add(card);
        card = new Card("Triceratopo", 6.0f, 9.0f, 6000.0f, 68.0f);
        deck.add(card);
        card = new Card("Ultrassauro", 22.0f, 38.0f, 90000.0f, 154.0f);
        deck.add(card);
        card = new Card("Tiranossauro (T)", 5.6f, 14.0f, 7000.0f, 68.0f);
        deck.add(card);
        card = new Card("Patagossauro", 8.0f, 18.0f, 16000.0f, 169.0f);
        deck.add(card);
        card = new Card("Brachiossauro", 15.0f, 28.0f, 50000.0f, 156.0f);
        deck.add(card);
        card = new Card("Pterodactilo", 0.1f, 1.0f, 1.0f, 140.0f);
        deck.add(card);
        card = new Card("Velociraptor", 1.0f, 2.0f, 80.0f, 80.0f);
        deck.add(card);
        card = new Card("Estegossauro", 4.0f, 9.0f, 4000.0f, 159.0f);
        deck.add(card);
        card = new Card("Dilofossauro", 2.5f, 7.0f, 450.0f, 206.0f);
        deck.add(card);
        card = new Card("Diplodoco", 5.0f, 27.0f, 20000.0f, 157.0f);
        deck.add(card);
        card = new Card("Melanorossauro", 12.0f, 15.0f, 8000.0f, 220.0f);
        deck.add(card);
        card = new Card("Compsognato", 0.7f, 1.0f, 2.5f, 170.0f);
        deck.add(card);
        card = new Card("Baptornis", 0.8f, 1.0f, 7.0f, 83.0f);
        deck.add(card);
        card = new Card("Psitacossauro", 0.7f, 2.0f, 25.0f, 125.0f);
        deck.add(card);
        card = new Card("Procompsognato", 0.3f, 1.2f, 1.0f, 222.0f);
        deck.add(card);
    }
    
    // Pega os maiores valores, calcula média e calcula a porcentagem de cada carta acima da média
    public void getValues() {
        deck = shuffle();
        biggestValues();
        calculateAverage();
        calculatePercentageAverage();
    }
    
    // Pega o maior valor
    private void biggestValues() {
        this.biggerWeight = deck.get(0).getWeight();
        this.biggerHeight = deck.get(0).getHeight();
        this.biggerSize = deck.get(0).getSize();
        this.biggerAge = deck.get(0).getAge();
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getWeight() > this.biggerWeight) {
                this.biggerWeight = deck.get(i).getWeight();
            }
            if (deck.get(i).getHeight()> this.biggerHeight) {
                this.biggerHeight = deck.get(i).getHeight();
            }
            if (deck.get(i).getSize()> this.biggerSize) {
                this.biggerSize = deck.get(i).getSize();
            }
            if (deck.get(i).getAge() > this.biggerAge) {
                this.biggerAge = deck.get(i).getAge();
            }
        }
    }

    public ArrayList<Card> shuffle() {
        Random random = new Random();
        int size = deck.size();
        for (int i = 0; i < size; i++) {
            int r = random.nextInt(size);
            Card temp = deck.get(i);
            deck.set(i, deck.get(r));
            deck.set(r, temp);
        }
        return deck;
    }
    
    private void calculateAverage() {
        int size = deck.size();
        for (int i = 0; i < size; i++) {
            this.averageAge += deck.get(i).getAge(); 
            this.averageSize += deck.get(i).getSize();
            this.averageHeight += deck.get(i).getHeight();
            this.averageWeight += deck.get(i).getWeight();
        }
        this.averageAge = (this.averageAge / size);
        this.averageSize = (this.averageSize / size);
        this.averageHeight = (this.averageHeight / size);
        this.averageWeight = (this.averageWeight / size);
    }
    
    private void calculatePercentageAverage() {
        for (int i = 0; i < deck.size(); i++) {
            if (calculatePercentageAboveAverage(averageAge, deck.get(i).getAge()) > 0) {
                deck.get(i).setPercentageAverageAge(calculatePercentageAboveAverage(averageAge, deck.get(i).getAge()));
                deck.get(i).setAverage(deck.get(i).getAverage() + 1);
            }
            if (calculatePercentageAboveAverage(averageSize, deck.get(i).getSize()) > 0) {
                deck.get(i).setPercentageAverageSize(calculatePercentageAboveAverage(averageSize, deck.get(i).getSize()));
                deck.get(i).setAverage(deck.get(i).getAverage() + 1);
            }
            if (calculatePercentageAboveAverage(averageHeight, deck.get(i).getHeight()) > 0) {
                deck.get(i).setPercentageAverageHeight(calculatePercentageAboveAverage(averageHeight, deck.get(i).getHeight()));
                deck.get(i).setAverage(deck.get(i).getAverage() + 1);
            }
            if (calculatePercentageAboveAverage(averageWeight, deck.get(i).getWeight()) > 0) {
                deck.get(i).setPercentageAverageWeight(calculatePercentageAboveAverage(averageWeight, deck.get(i).getWeight()));
                deck.get(i).setAverage(deck.get(i).getAverage() + 1);
            }
        }
    }
    
    private float calculatePercentageAboveAverage(float average, float value) {
        return (((value - average) / average) * 100) > 0 ? (((value - average) / average) * 100) : 0;
    }
    
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    public float getAverageWeight() {
        return averageWeight;
    }

    public float getAverageHeight() {
        return averageHeight;
    }

    public float getAverageSize() {
        return averageSize;
    }

    public float getAverageAge() {
        return averageAge;
    }

    public float getBiggerWeight() {
        return biggerWeight;
    }

    public float getBiggerHeight() {
        return biggerHeight;
    }

    public float getBiggerSize() {
        return biggerSize;
    }

    public float getBiggerAge() {
        return biggerAge;
    }
}
