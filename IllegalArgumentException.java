/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eviro.assessment.grad001;

/**
 *
 * @author JMLekhase
 */
public class IllegalArgumentException extends Exception {

    /**
     * Creates a new instance of <code>WithdrawalAmountTooLargeException</code>
     * without detail message.
     */
    public IllegalArgumentException() {
    }

    /**
     * Constructs an instance of <code>WithdrawalAmountTooLargeException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalArgumentException(String msg) {
        super(msg);
    }
}
