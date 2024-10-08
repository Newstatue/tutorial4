package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test
    void testSubtraction() {
        // 这个测试现在应该通过
        assertEquals(2, c.subtract(4, 2));
    }
}
