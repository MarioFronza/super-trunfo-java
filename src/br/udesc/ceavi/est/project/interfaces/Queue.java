package br.udesc.ceavi.est.project.interfaces;

/**
 * Interface para filas
 * @author João Pedro Schmitz, Mário Fronza, Leonardo Steinke
 * @version 1.0
 * @since 03/09/2018.
 */
public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
}
