package br.udesc.ceavi.est.project.lists;

import br.udesc.ceavi.est.project.interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {

    public static final int CAPACITY = 1000;
    private E[] data;
    private int f = 0;
    private int sz = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return (sz == 0);
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) {
            throw new IllegalStateException("Queue is full");
        }

        int avail = f + sz;
        if (avail >= data.length) {
            avail -= data.length;
        }

        data[avail] = e;
        sz++;
    }

    @Override
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return data[f];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[f];
        data[f] = null;

        f = (f + 1);
        if (f >= data.length) {
            f = 0;
        }

        sz--;
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        int k = f;
        for (int j = 0; j < sz; j++) {
            if (j > 0) {
                sb.append(", ");
            }
            sb.append(data[k]);
            k = (k + 1) % data.length;
        }
        sb.append(")");
        return sb.toString();
    }
}
