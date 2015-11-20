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
public class IncorrectYearsException extends Exception {

    /**
     * Creates a new instance of <code>IncorrectYearsException</code> without
     * detail message.
     */
    public IncorrectYearsException() {
    }

    /**
     * Constructs an instance of <code>IncorrectYearsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectYearsException(String msg) {
        super(msg);
    }
}
