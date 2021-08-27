import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NumberFormatterTest {

    @Test
    void numberFormatTranslatorMethod1() {
        assertEquals(13, NumberFormatter.parseInt("12") +1);
    }

    @Test
    void numberFormatTranslatorMethod2() {
        assertEquals(-11, NumberFormatter.parseInt("-10") -1);
    }

    @Test
    void numberFormatTranslatorMethod3() {
        assertEquals(12345, NumberFormatter.parseInt("12345"));
    }

    @Test
    void numberFormatTranslatorMethod4() {
        assertEquals(6, NumberFormatter.parseInt("12") /2);
    }

    @Test
    void numberFormatTranslatorMethod5() {
        assertEquals(-24, NumberFormatter.parseInt("-12") * 2);
    }
}