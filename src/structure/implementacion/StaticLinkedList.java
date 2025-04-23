package org.uade.structure.implementacion;

import structure.definition.LinkedListADT;

public class StaticLinkedList implements LinkedListADT {

    private static final int CAPACITY = 100;

    private int[] data = new int[CAPACITY];
    private int[] next = new int[CAPACITY];
    private int head = -1;
    private int free = 0;
    private int size = 0;

    public StaticLinkedList() {
        // inicializar lista de nodos libres
        for (int i = 0; i < CAPACITY - 1; i++) {
            next[i] = i + 1;
        }
        next[CAPACITY - 1] = -1;
    }

    @Override
    public void add(int value) {
        insert(size, value);
    }

    @Override
    public void insert(int index, int value) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (free == -1) throw new IllegalStateException("No hay espacio disponible");

        int newIndex = free;
        free = next[free];
        data[newIndex] = value;

        if (index == 0) {
            next[newIndex] = head;
            head = newIndex;
        } else {
            int prev = getIndex(index - 1);
            next[newIndex] = next[prev];
            next[prev] = newIndex;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        int removed;
        if (index == 0) {
            removed = head;
            head = next[head];
        } else {
            int prev = getIndex(index - 1);
            removed = next[prev];
            next[prev] = next[removed];
        }

        // devolver el nodo a la lista libre
        next[removed] = free;
        free = removed;
        size--;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        int nodeIndex = getIndex(index);
        return data[nodeIndex];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private int getIndex(int index) {
        int current = head;
        for (int i = 0; i < index; i++) {
            current = next[current];
        }
        return current;
    }


}
