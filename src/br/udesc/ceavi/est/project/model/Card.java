package br.udesc.ceavi.est.project.model;

/**
 * Classe para gerenciar as cartas e seus atributos
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Card {
    private final String name;
    private final float weight;
    private final float size;
    private final int brood;
    private final int timeLife;

    public Card(String name, float weight, float size, int brood, int timeLife) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.brood = brood;
        this.timeLife = timeLife;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getSize() {
        return size;
    }

    public int getBrood() {
        return brood;
    }

    public int getTimeLife() {
        return timeLife;
    }
}
