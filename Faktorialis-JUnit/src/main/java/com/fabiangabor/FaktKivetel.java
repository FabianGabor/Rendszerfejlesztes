package com.fabiangabor;
public class FaktKivetel extends Exception {
    public FaktKivetel() {
    }

    /**
     *
     * @param message Az uzenet, amita kivetelosztaly general
     * @see FaktKivetel osztaly
     */
    public FaktKivetel(String message) {
        super(message);
    }
}
