public class Node<E> {
    private E element; // reference to the element stored at this node
    private Node<E> prev; // reference to the previous node in the list
    private Node<E> next; // reference to the subsequent node in the list

    public Node(E e, Node<E> p, Node<E> n) {
        element = e;
        prev = p;
        next = n;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setPrev(Node<E> p) {
        prev = p;
    }

    public void setNext(Node<E> n) {
        next = n;
    }
}
