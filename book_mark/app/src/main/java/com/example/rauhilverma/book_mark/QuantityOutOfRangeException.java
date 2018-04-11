package com.example.rauhilverma.book_mark;

/**
 * Created by RauhilVerma on 04-04-2018.
 */

public class QuantityOutOfRangeException extends RuntimeException {
    private static final long serialVersionUID = 44L;

    private static final String DEFAULT_MESSAGE = "Quantity is out of range";

    public QuantityOutOfRangeException() {
        super(DEFAULT_MESSAGE);
    }

    public QuantityOutOfRangeException(String message) {
        super(message);
    }
}
