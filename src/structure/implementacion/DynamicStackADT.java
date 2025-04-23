package structure.implementacion;

import structure.definition.StackADT;
import structure.excepciones.ElementoNoExistenteException;
import structure.excepciones.EstructuraVaciaException;

import java.util.NoSuchElementException;

public class DynamicStackADT implements StackADT {

    private static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public DynamicStackADT() {
        top = null;
    }

    @Override
    public int getElement() {
        if(isEmpty()){
            throw new EstructuraVaciaException();
        }

        return top.data;
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    @Override
    public void remove() {
        if(isEmpty()){
            throw new EstructuraVaciaException();}

        top = top.next;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

}
