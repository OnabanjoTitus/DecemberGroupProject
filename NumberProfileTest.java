import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumberProfileTest {
    NumberProfile numberProfile;
    @BeforeEach
    void setUp() {
        numberProfile = new NumberProfile();
    }

    @AfterEach
    void tearDown() {
        numberProfile = null;
    }
    @Test
    void testForNumberCanBeEntered(){
        numberProfile.setNumber(23);
        assertEquals(23,numberProfile.getNumber());
    }
    @Test
    void testForNumberIsAnEvenNumber(){
        numberProfile.setNumber(6);
       assertTrue(numberProfile.getEvenNumber());
    }
    @Test
    void testForNumberIsAnOddNumber(){
        numberProfile.setNumber(3);
        assertTrue(numberProfile.getOddNumber());
    }
    @Test
    void testForNumberIsAPerfectSquare(){
        numberProfile.setNumber(9);
        assertTrue(numberProfile.isAPerfectSquare());
    }
    @Test
    void testForNumberIsAPrimeNumber(){
        numberProfile.setNumber(13);
        assertTrue(numberProfile.isPrimeNumber());
    }
    @Test
    void testForMultiplesOFANumber(){
        numberProfile.setNumber(4);
        int [] array={4,8,12,16,20};
        assertArrayEquals(array,numberProfile.getMultiples());
    }
    @Test
    void testForFactorsOfANumber(){
        numberProfile.setNumber(8);
        ArrayList<Integer>array =new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(8);
        assertEquals(array,numberProfile.getFactors());
    }
    @Test
    void testForNumberProfileGeneration(){
        numberProfile.setNumber(12);
        System.out.printf(numberProfile.getNumberProfile());
    }
}