/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;

/**
 *
 * @author Ronak Bakshi
 * @param <E>
 */
public class AStack<E> {

    private ArrayDeque<E> myStack;

    public AStack() {
        myStack = new ArrayDeque<>();
    }

    public void push(E element) {
        myStack.addFirst(element);
    }

    public E pop() {
        return myStack.removeFirst();
    }

    public E peek() {
        return myStack.peekFirst();
    }

    public int size() {
        return myStack.size();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }
}
