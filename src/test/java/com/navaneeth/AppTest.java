package com.navaneeth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAdd() {
        App app = new App();

        assertEquals(10, app.add(5, 5));
    }
}