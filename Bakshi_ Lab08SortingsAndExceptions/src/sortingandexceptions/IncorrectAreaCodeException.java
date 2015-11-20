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
public class IncorrectAreaCodeException extends Exception {

    /**
     * Creates a new instance of <code>IncorrectAreaCodeException</code> without
     * detail message.
     */
    public IncorrectAreaCodeException() {
    }

    /**
     * Constructs an instance of <code>IncorrectAreaCodeException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectAreaCodeException(String msg) {
        super(msg);
    }
}
