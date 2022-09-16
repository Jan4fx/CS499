//This was an example I followed along from on youtube
//Link to youtube video: https://www.youtube.com/watch?v=vZm0lHciFsQ

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }
}