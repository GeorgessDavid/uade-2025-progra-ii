package structure.implementacion;

import structure.definition.LinkedListADT;
import structure.excepciones.IndiceFueraRangoException;

public class DynamicLinkedList implements LinkedListADT {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    @Override
    public void add(int value) {
        insert(size, value);
    }

    @Override
    public void insert(int index, int value) {
        if (index < 0 || index > size) throw new IndiceFueraRangoException(index);

        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndiceFueraRangoException(index);

        if (index == 0) {
            head = head.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = prev.next.next;
        }
        size--;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndiceFueraRangoException(index);
        return getNode(index).data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }

}
