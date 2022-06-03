
package com.mycompany.testlinkedlist;


public class SinglyLinkedList<E> {
    
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
        
        private Node<E> head = null;
        private Node<E> tail = null;
        int size = 0;
        
        public SinglyLinkedList() {
            
        }
        
        public int size() {
            return size;
        }
        
        public boolean isEmpty() {
            return size == 0;
        }
        
        public E first() {
            return head.getElement();
        }
        
        public E last() {
            return tail.getElement();
        }
        
        public void addFirst(E e) {
            head = new Node<>(e,head);
            if(isEmpty() {
                tail = head;
            }
            size++;
        }
        
        public void addLast(E e) {
            Node<E> newest = new Node<>(e,null);
            if(isEmpty()) {
                head = newest;
            }
            else {
                tail.setNextNode(newest);
            }
            tail = newest;
            size++;
        }
        
        public E removeFirst() {
            if(isEmpty()) {
                return null;
            }
            E answer = head.getElement();
            head = head.getNext();
            size--;
            if(isEmpty()) {
                tail = null;
            }
            return answer;
        }
       
   
}
