package com.java.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DeuqueInputTest {
    private DeuqueInput depInput = new DeuqueInput();

    @Test
    void getDequeTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            depInput.getDeque();
        });
    }
}