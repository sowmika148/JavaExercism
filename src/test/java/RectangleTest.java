import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void shouldReturnSixWithSidesTwoThree() {
        assertEquals(6, new Rectangle(2, 3).calculateArea());
    }

    @Test
    public void shouldReturnAreaAsGivenForGivenSides() {
        assertEquals(12, new Rectangle(4, 3).calculateArea());
    }

}

