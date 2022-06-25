package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcUnderLimit() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOverLimit() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200);

        Assertions.assertEquals(expected, actual);
    }
}
