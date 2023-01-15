import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DollarTest {

    @Test
    void testThatMultiplicationFiveDollarsOnTwoReturnsTen () {
        //given
        Dollar five = new Dollar(5);
        //when
        five.times(2);
        //then
        assertEquals(10, five.amount);

    }
}
