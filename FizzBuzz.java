public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.format("%s", number);
        }
    }
}