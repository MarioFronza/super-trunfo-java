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

    public Deck() {
        
    }
    
    public void createDeck() {
        Card card;
        card = new Card("Peteinossauro", 0.3f, 0.6f, 0.1f, 210);
        deck.add(card);
        card = new Card("Oftamossauro", 1.3f, 5, 3000, 165);
        deck.add(card);
        card = new Card("Alossauro", 5.2f, 14, 3600, 151);
        deck.add(card);
        card = new Card("Globidens", 1.1f, 6, 400, 150);
        deck.add(card);
        card = new Card("Barionix", 8, 12, 2000, 125);
        deck.add(card);
        card = new Card("Triceratopo", 6, 9, 6000, 68);
        deck.add(card);
        card = new Card("Ultrassauro", 22, 38, 90000, 154);
        deck.add(card);
        card = new Card("Tiranossauro (T)", 5.6f, 14, 7000, 68);
        deck.add(card);
        card = new Card("Patagossauro", 8, 18, 16000, 169);
        deck.add(card);
        card = new Card("Brachiossauro", 15, 28, 50000, 156);
        deck.add(card);
        card = new Card("Pterodactilo", 0.1f, 1, 1, 140);
        deck.add(card);
        card = new Card("Velociraptor", 1, 2, 80, 80);
        deck.add(card);
        card = new Card("Estegossauro", 4, 9, 4000, 159);
        deck.add(card);
        card = new Card("Dilofossauro", 2.5f, 7, 450, 206);
        deck.add(card);
        card = new Card("Diplodoco", 5, 27, 20000, 157);
        deck.add(card);
        card = new Card("Melanorossauro", 12, 15, 8000, 220);
        deck.add(card);
        card = new Card("Compsognato", 0.7f, 1, 2.5f, 170);
        deck.add(card);
        card = new Card("Baptornis", 0.8f, 1, 7, 83);
        deck.add(card);
        card = new Card("Psitacossauro", 0.7f, 2, 25, 125);
        deck.add(card);
        card = new Card("Procompsognato", 0.3f, 1.2f, 1, 222);
        deck.add(card);
        deck = shuffle();
        calculateAverage();
        biggerAge = biggerAge();
        biggerSize = biggerSize();
        biggerHeight = biggerWidth();
        biggerWeight = biggerWeight();
        calculatePercentageAverage();
        showAverage();
    }
    
    private float biggerWeight() {
        this.biggerWeight = deck.get(0).getWeight();
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getWeight() > this.biggerWeight) {
                this.biggerWeight = deck.get(i).getWeight();
            }
        }
        return biggerWeight;
    }

    private float biggerWidth() {
        this.biggerHeight = deck.get(0).getHeight();
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getHeight()> this.biggerHeight) {
                this.biggerHeight = deck.get(i).getHeight();
            }
        }
        return biggerHeight;
    }

    private float biggerSize() {
        this.biggerSize = deck.get(0).getSize();
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getSize()> this.biggerSize) {
                this.biggerSize = deck.get(i).getSize();
            }
        }
        return biggerSize;
    }

    private float biggerAge() {
        this.biggerAge = deck.get(0).getAge();
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getAge() > this.biggerAge) {
                this.biggerAge = deck.get(i).getAge();
            }
        }
        return biggerAge;
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
    
    private void showAverage() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println("Nome: " + deck.get(i).getName() + " | Valor carta: " + deck.get(i).getAverage());
        }
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
