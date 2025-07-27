package Logic1;

public class fizzString2 {
    public String fizzString2(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz && buzz)
            return "FizzBuzz!";
        if (fizz)
            return "Fizz!";
        if (buzz)
            return "Buzz!";
        return n + "!";
    }
}
