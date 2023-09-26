package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcRestServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000"
    })
    public void test1(int expected, int income, int expenses, int threshold) {
        CalcRestService service = new CalcRestService();
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
