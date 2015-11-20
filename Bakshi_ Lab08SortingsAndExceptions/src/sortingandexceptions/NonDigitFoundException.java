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
public class NonDigitFoundException extends Exception {

    /**
     * Creates a new instance of <code>NonDigitFoundException</code> without
     * detail message.
     */
    public NonDigitFoundException() {
    }

    /**
     * Constructs an instance of <code>NonDigitFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NonDigitFoundException(String msg) {
        super(msg);
    }
}
