/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingandexceptions;

/**
 *
 * @author Ronak Bakshi
 */
public class IncorrectLengthException extends Exception {

    /**
     * Creates a new instance of <code>IncorrectLengthException</code> without
     * detail message.
     */
    public IncorrectLengthException() {
    }

    /**
     * Constructs an instance of <code>IncorrectLengthException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectLengthException(String msg) {
        super(msg);
    }
}
