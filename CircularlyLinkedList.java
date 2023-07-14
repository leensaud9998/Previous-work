/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class CircularlyLinkedList<E> {
    private Node<E> tail;
    private int size;

    public CircularlyLinkedList() {
        tail = null;
        this.size = 0;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {

        return size;
    }

    public E first() {
        if (empty())
            return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (empty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        if (empty()) {
            tail = new Node(e, null);
            tail.setNext(tail);
        } else {
            Node node = new Node(e, tail.getNext());
            tail.setNext(node);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (empty())
            return null;
        Node<E> temp = tail.getNext();
        if (size == 1) {
            tail = null;
        } else {
            tail.setNext(tail.getNext().getNext());
        }

        size--;
        return temp.getElement();
    }

    public void print() {
        Node<E> curr = tail.getNext();
        for (int i = 0; i < size; i++) {
            System.out.println(curr.getElement());
            curr = curr.getNext();
        }

    }
}
