public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself. 
        // Hint: You can use a String method to cast the int to a String.
        if(number % 15 == 0){
            return "FizzBuzz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        } else { return number + " not divisible";} // This is implicit casting of int number to string. 

        /*
        how the solution on the plaform did it. 
        if(number % 5 == 0 && number % 3 == 0) This is what I originally had written, however since at first it was my last else if check, it never ran, because anything devisible by either would run first and exit the if statement
            return "FizzBuzz";
        if(number % 5 == 0)
            return "Fizz";
        if(number % 3 == 0)
            return "Buzz";
        return Integer.toString(number); -- This is explicit casting of int number to string.
        */

    } 
    
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(int number, String multOf3word, String multOf5word, String multOf15word) {
        // Implement the same logic, but replace "Fizz", "Buzz" and 
        // "Fizzbuzz" with the given words
        if(number % 15 == 0){
            return multOf15word;
        }
        else if(number % 3 == 0){
            return multOf3word;
        }
        else if(number % 5 == 0){
            return multOf5word;
        } else { return number + " not divisible";}
    }
}



