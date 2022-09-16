//This was an example I followed along from on youtube
//Link to youtube video: https://www.youtube.com/watch?v=vZm0lHciFsQ

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(9,calculator.add(3,3));
    }
}