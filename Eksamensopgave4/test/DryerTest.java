import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DryerTest {

    // Test for at se om tørretumblerens pris-beregner-metode fungerer
    @Test
    void totalShouldEqualFifty(){

        Dryer d1 = new Dryer();

        assertEquals(50,d1.updatedPrice(100));

    }

}