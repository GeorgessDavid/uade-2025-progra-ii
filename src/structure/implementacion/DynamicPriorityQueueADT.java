package structure.implementacion;

import structure.definition.PriorityQueueADT;
import structure.excepciones.EstructuraVaciaException;

public class DynamicPriorityQueueADT implements PriorityQueueADT {

    private static class Node {
        int data;
        int priority;
        Node next;

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }
    }

    private Node head;

    public DynamicPriorityQueueADT() {
        head = null;
    }

    @Override
    public void add(int value, int priority) {
        Node newNode = new Node(value, priority);

        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    @Override
    public int getElement() {
        if (isEmpty()) throw new EstructuraVaciaException();
        return head.data;
    }

    @Override
    public int getPriority() {
        if (isEmpty()) throw new EstructuraVaciaException();
        return head.priority;
    }

    @Override
    public void remove() {
        if (isEmpty()) throw new EstructuraVaciaException();
        head = head.next;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}

