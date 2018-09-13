package br.udesc.ceavi.est.project.model;

/**
 * Classe para gerenciar as cartas e seus atributos
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public class Card {
    private final String name;
    private final float age; // Ano
    private final float size; // Comprimento
    private final float height; // Altura
    private final float weight;  // Peso
    private float percentageAverageAge;
    private float percentageAverageSize;
    private float percentageAverageHeight;
    private float percentageAverageWeight;
    private int average;

    public Card(String name, float height, float size, float weight, float age) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.height = height;
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

    public float getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getPercentageAverageAge() {
        return percentageAverageAge;
    }

    public float getPercentageAverageWeight() {
        return percentageAverageWeight;
    }

    public float getPercentageAverageSize() {
        return percentageAverageSize;
    }

    public float getPercentageAverageHeight() {
        return percentageAverageHeight;
    }
    
    public void setPercentageAverageAge(float percentageAverageAge) {
        this.percentageAverageAge = percentageAverageAge;
    }

    public void setPercentageAverageWeight(float percentageAverageWeight) {
        this.percentageAverageWeight = percentageAverageWeight;
    }

    public void setPercentageAverageSize(float percentageAverageSize) {
        this.percentageAverageSize = percentageAverageSize;
    }

    public void setPercentageAverageHeight(float percentageAverageHeight) {
        this.percentageAverageHeight = percentageAverageHeight;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
