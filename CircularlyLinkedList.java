public class CircularlyLinkedList<E> {

    public static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;

        }

        public Node<E> getNext() {
            return next;
        }

        public void setNextNode(Node<E> next) {
            this.next = next;
        }
    }
    
    private Node<E> tail = null;
    private int size = 0;
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public E first() {
        if(isEmpty()) {
            return null;
        }
        else {
            return tail.getNext().getElement();
        }
    }
    
    public E last() {
        if(isEmpty()) {
            return null;
        }
        else {
            return tail.getElement();
        }
    }
    
    public void addFirst(E e) {
        if(isEmpty()) {
            tail = new Node<>(e,null);
            tail.setNextNode(tail);
        }
        else {
            Node<E> newest = new Node<>(e,tail.getNext());
            tail.setNextNode(newest);
        }
        size++;
    }
    
    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }
    
    public E removeFirst(E e) {
        if(isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if(head == tail) {
            tail = null;
        }
        else {
            tail.setNextNode(head.getNext());
        }
        size--;
        return head.getElement();
    }
    
    
}
