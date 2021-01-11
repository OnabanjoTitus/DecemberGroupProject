import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    void testForIfStringsAreAccepted(){
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.setInput();
        assertEquals("1+1",stringCalculator.getInput());
    }
    @Test
    void testForIfStringsCanBeSeparated(){
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.setInput();
        assertEquals(2,stringCalculator.getValue());
    }
}