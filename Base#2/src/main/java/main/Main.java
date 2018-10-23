package main;

import array.ArraySummaterException;
import array.SimpleSummater;

/**
 * Demonstrate work of IArraySummater
 */
public class Main {     // What?
    /**
     * Main class
     * @param args - console arg
     * @throws ArraySummaterException - custom exception
     */
    public static void main(final String[] args) throws ArraySummaterException {
        SimpleSummater simpleSum = new SimpleSummater();
        int[] arr = {1, 2};
        System.out.println(simpleSum.sum(arr));
    }
}
