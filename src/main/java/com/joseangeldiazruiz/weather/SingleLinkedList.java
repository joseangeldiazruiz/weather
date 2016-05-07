package com.joseangeldiazruiz.weather;


import java.util.Optional;

public class SingleLinkedList<T>{
    Node<T> head;
    Node<T> tail;

    public void add(T element){
        Node<T> node = new Node<T>(element);
        if (head == null){
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Optional<T> NthElementFromTheEnd(int n){
        if (n < 1) {
            throw new IllegalArgumentException("N must be greater than 0");
        }

        if (head == null){
            return Optional.empty();
        }

        int counter = 1;
        Node<T> currentNode = head;
        Node<T> nFromTheEnd = null;
        while(currentNode != null){
            if (counter == n){
                nFromTheEnd = head;
            }else if (counter > n) {
                nFromTheEnd = nFromTheEnd.getNext();
            }
            currentNode = currentNode.getNext();
            counter++;
        }

        if (nFromTheEnd == null) {
            return Optional.empty();
        }

        return Optional.of(nFromTheEnd.getValue());
    }

    public Optional<T> fifthElementFromTheEnd(){
        return NthElementFromTheEnd(5);
    }
}
