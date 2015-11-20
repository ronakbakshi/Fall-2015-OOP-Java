/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.NoSuchElementException;

/**
 *
 * @author Ronak Bakshi
 */
public class Bakshi_ALinkedList<E> {

    private Node<E> listStart;
    private int listLength;

    /**
     * Constructor Creates an empty linked list with the head of the list
     * pointing to null. Initializes the length of the list to 0.
     */
    public Bakshi_ALinkedList() {
        // LinkedList<E> list = new LinkedList<>();
        listStart = new Node(null);
        listLength = 0;
    }

    /**
     * Returns true if the list is empty; false otherwise.
     *
     * @return true if the list is empty; false otherwise.
     */
    public boolean isEmpty() {
        return listLength == 0;
    }

    /**
     * Adds an object to the beginning of the list.
     *
     * @param myObject The object to be added to the beginning of the list.
     */
    public void addFirst(E myObject) {
        if (listStart == null) {
            listStart = new Node(myObject);
        }
        Node curr = new Node(myObject);
        curr.nextNode = listStart;
        listStart = curr;
        listLength++;
    }

    /**
     * Removes the first object from the list.
     *
     * @return the node that was removed from the list.
     * @throws NoSuchElementException if the list is empty
     */
    public Node<E> removeFirst() throws NoSuchElementException {
        Node curr;
        if (listStart == null) {
            throw new NoSuchElementException();
        } else {
            curr = listStart;
            listStart = listStart.nextNode;
        }
        listLength--;
        return curr;
    }

    /**
     * Returns the number of nodes in the list.
     *
     * @return the number of nodes in the list.
     */
    public int size() {
        return listLength;
    }

    /**
     * Returns a string representation of the linked list. The string
     * representation consists of each node in the list, printed using the
     * toString method of the Node class, with each node printed on a new line.
     *
     * @return a string representation of the linked list.
     */
    @Override
    public String toString() {
        String str = "";
        Node curr = listStart;
        while (curr.nextNode != null) {
            str += curr.data + "\n";
            curr = curr.nextNode;
        }
        return str;
    }
}
