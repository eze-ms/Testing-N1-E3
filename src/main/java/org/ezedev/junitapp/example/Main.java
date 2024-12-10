package org.ezedev.junitapp.example;

public class Main {
    public static void main(String[] args) {
        OutBounds outBounds = new OutBounds();

        try {
            System.out.println("Attempting to access an invalid array index...");
            outBounds.getOutBounds();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
