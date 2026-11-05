package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @CsvSource({
            "J@va the be$t!123, t@eb eht av$J!123",
            "'', ''",
            "a, a",
            "123 !@#, 123 !@#",
            "abcd, dcba",
            "123aaaa!!!bbbb123, 123bbbb!!!aaaa123",
            "123Pr!ivet, 123te!virP",
            ",''"
    })
    @ParameterizedTest
    void reversing(String input, String exx) {
        String output = Main.reverse(input);
        assertEquals(exx, output);
    }

}