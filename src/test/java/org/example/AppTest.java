package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Unit test for simple App.
 */
class AppTest {

    @Test
    void testApp() {
        assertDoesNotThrow(() -> App.main(null));
    }
}
