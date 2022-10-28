import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PayDayTest {

    @Test
    public void testPay()
    {
        PayDay firstPayDay = new PayDay();
        String krisPay = firstPayDay.pay("Kris", 21.5, 10.0, 0.05);
        assertEquals("Kris 215.00 10.75 204.25", krisPay);
    }
}