package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(8, app.add(5,3));
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(2, app.subtract(5,3));
    }

}
