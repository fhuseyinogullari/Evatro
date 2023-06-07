package level2;


public class FibonacciPrime {

    public static int getFibonacciPrime(int number) {
        int theFibonacci = biggerFibonacciNumber(number);
        if(isPrime(theFibonacci)) {
            return theFibonacci;
        }
        return getFibonacciPrime(theFibonacci);
    }
    public static int biggerFibonacciNumber(int number) {
        int value = 0;
        int counter = 0;

        while (true) {
            value = isFibonacci(counter);
            counter++;
            if (value > number) {
                break;
            }
        }
        return value;
    }
    public static int isFibonacci(int number) {
        if(number <= 1) {
            return number;
        }

        return isFibonacci(number - 1) + isFibonacci(number - 2);
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }
    public static int primeDivisorOfNumberPlusOne(int number) {
        number++;
        int sum  = 0;
        int fibonacciNumber = 0;
        int counter = 1;
        while(fibonacciNumber <= number){
            fibonacciNumber = isFibonacci(counter);
            if(isPrime(fibonacciNumber) && number%fibonacciNumber == 0){
                sum+=fibonacciNumber;
            }
            counter++;
        }
        return sum;
    }
}
