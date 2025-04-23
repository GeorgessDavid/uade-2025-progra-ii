package structure.implementacion;

import structure.definition.QueueADT;
import structure.excepciones.EstructuraVaciaException;

import java.util.NoSuchElementException;

public class DynamicQueueADT implements QueueADT {

    private static class Node {
        int data;
        Node next;

        Node(int data){
             this.data = data;
             this.next = null;
        }
    }

    private Node front;
    private Node last;

    @Override
    public int getElement() {
        if(isEmpty()){
            throw new EstructuraVaciaException();
        }

        return front.data;
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);
        if(isEmpty()){
            front = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }

    @Override
    public void remove() {
        front = front.next;
        if(isEmpty()){
            throw new EstructuraVaciaException();}

        if(front == null){
            last = null;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }
}
