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
    private final int age;
    private final float width;

    public Card(String name, float width, float size, float weight, int age) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.width = width;
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

    public int getAge() {
        return age;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", weight=" + weight + ", size=" + size + ", age=" + age + ", width=" + width + '}';
    }

    
    
}
