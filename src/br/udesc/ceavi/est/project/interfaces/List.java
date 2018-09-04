package br.udesc.ceavi.est.project.interfaces;

/**
 * Interface para listas
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public interface List<E> {
    int size(); // Tamanho da lista
    boolean isEmpty(); // Verifica se está vazio
    E get(int i) throws IndexOutOfBoundsException; // Retorna um elemento da lista
    E set(int i, E e) throws IndexOutOfBoundsException; // Define um elemento em alguma posição
    void add(int i, E e) throws IndexOutOfBoundsException; // Adiciona um elemento em algum posição
    E remove(int i) throws IndexOutOfBoundsException; // Remove um elemento de uma determinada posição
}
