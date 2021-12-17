public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();
        System.out.println(tester.fizzBuzz(9));
        System.out.println(tester.fizzBuzz(10));
        System.out.println(tester.fizzBuzz(15));
        System.out.println(tester.fizzBuzz(16));
        System.out.println(tester.fizzBuzz(2));
        
        
        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }
        /*
        This is an alternative way to write and do the above for loop.
        public static void FizzBuzzTest() {
        for(int i = 0; i < 100; i++) {
            String result = fizzBuzz(i);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        */
        
        System.out.println(tester.fizzBuzz(9, "Fizz", "Buzz", "FizzBuzz"));
        System.out.println(tester.fizzBuzz(10, "Fizz", "Buzz", "FizzBuzz"));
        System.out.println(tester.fizzBuzz(15, "Fizz", "Buzz", "FizzBuzz"));
        System.out.println(tester.fizzBuzz(16, "Fizz", "Buzz", "FizzBuzz"));
        System.out.println(tester.fizzBuzz(2, "Fizz", "Buzz", "FizzBuzz"));
    }
}