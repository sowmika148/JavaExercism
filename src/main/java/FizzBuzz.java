import java.util.List;

public class FizzBuzz {


    private static String checkNumberFizzBuzz(int checkNumber) {

        String returnValue = "";
        if (checkNumber % 15 == 0) {
            returnValue += "FizzBuzz";
        } else if (checkNumber % 3 == 0) {
            returnValue += "Fizz";
        } else if (checkNumber % 5 == 0) {
            returnValue += "Buzz";
        } else {
            returnValue += checkNumber;
        }

        return returnValue;
    }

    public String checkFizzBuzz(List<Integer> listOfNumbers) {

        String returnValue = "";
        for (Integer number : listOfNumbers) {
            returnValue += checkNumberFizzBuzz(number);
            returnValue += ',';
        }


        return returnValue.substring(0, returnValue.length() - 1);
    }

}
