package org.ezedev.junitapp.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutBoundsTest {

    @Test
    @DisplayName("Should throw ArrayIndexOutOfBoundsException when accessing invalid index")
    void testArrayIndexOutOfBounds() {
        OutBounds outBounds = new OutBounds();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                outBounds::getOutBounds,
                "Expected ArrayIndexOutOfBoundsException to be thrown, but it wasn't."
        );
    }
}