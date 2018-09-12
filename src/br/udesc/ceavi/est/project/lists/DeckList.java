package br.udesc.ceavi.est.project.lists;

import br.udesc.ceavi.est.project.interfaces.ListDeck;

public class DeckList<E> implements ListDeck<E> {

    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public DeckList() {
        this(CAPACITY);
    }

    public DeckList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int i) {
        checkIndex(i, size);
        return data[i];
    }

    @Override
    public E set(int i, E e) {
        checkIndex(i, size);
        E temp = data[i];
        data[i] = e;
        return temp;
    }

    @Override
    public void add(int i, E e) {
        checkIndex(i, size + 1);
        for (int k = size - 1; k >= i; k--) {
            data[k + 1] = data[k];
        }
        data[i] = e;
        size++;
    }

    public void addLast(E e) {
        add(size - 1, e);
    }

    @Override
    public E remove(int i) {
        checkIndex(i, size);
        E temp = data[i];
        data[i] = data[size - 1];
        data[size - 1] = null;
        size--;
        return temp;
    }

    protected void checkIndex(int i, int n) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException("Illegal index: " + i);
        }
    }

    @Override
    public String toString() {
        System.out.println("Printando ArrayList");
        StringBuilder sb = new StringBuilder("(");
        for (int j = 0; j < size; j++) {
            if (j > 0) {
                sb.append(", ");
            }
            sb.append(data[j]);
        }
        sb.append(")");
        return sb.toString();
    }
}
