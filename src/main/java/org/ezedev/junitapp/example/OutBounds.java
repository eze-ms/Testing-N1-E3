package org.ezedev.junitapp.example;

public class OutBounds {
    private final int[] array = new int[]{1, 2, 3};

    public int getOutBounds() throws IndexOutOfBoundsException {
        return array[array.length];
    }
}
