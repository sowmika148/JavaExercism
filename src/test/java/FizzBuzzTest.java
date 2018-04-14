import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void shouldReturnFizzIfMultipleOfThree() {

        assertEquals("Fizz", new FizzBuzz().checkFizzBuzz(Arrays.asList(3)));

    }

    @Test
    public void shouldReturnBuzzIfMultipleOfFive() {

        assertEquals("Buzz", new FizzBuzz().checkFizzBuzz(Arrays.asList(5)));

    }

    @Test
    public void shouldReturnFizzBuzzIfMultipleOfFiveAndThree() {

        assertEquals("FizzBuzz", new FizzBuzz().checkFizzBuzz(Arrays.asList(15)));

    }

    @Test
    public void shouldReturnNumberIfNotMultipleOfFiveOrThree() {

        assertEquals("8", new FizzBuzz().checkFizzBuzz(Arrays.asList(8)));

    }

    @Test
    public void shouldReturnFizzBuzzForListOfNumbers() {

        List<Integer> listOfNumbers =mockListOfNumbers();
        assertEquals("Fizz,Buzz,FizzBuzz,1", new FizzBuzz().checkFizzBuzz(listOfNumbers));

    }

    private  List<Integer> mockListOfNumbers(){

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(15);
        listOfNumbers.add(1);

        return listOfNumbers;
    }
}
