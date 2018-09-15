package br.udesc.ceavi.est.project.interfaces;

/**
 * Interface para listas de deck
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 10/09/2018.
 */
public interface ListDeck<E> {
    int size(); // Tamanho da lista
    boolean isEmpty(); // Verifica se está vazio
    E get(int i) throws IndexOutOfBoundsException; // Retorna um elemento da lista
    E set(int i, E e) throws IndexOutOfBoundsException; // Define um elemento em alguma posição
    void add(int i, E e) throws IndexOutOfBoundsException; // Adiciona um elemento em algum posição
    void addLast(E e) throws IndexOutOfBoundsException;
    E remove(int i) throws IndexOutOfBoundsException; // Remove um elemento de uma determinada posição
}
