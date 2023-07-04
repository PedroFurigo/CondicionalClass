/**
 * The class "App" represents an application that performs various calculations and prints the results.
 */
public class App {
    public static void main(String[] args){
        int sum = 0;
        int factorial = 1;
        double factorial5 = 1;
        int fibonacci = 1;
        int previousNumber = 0;

        System.out.println("From 150 to 300");
        for(int i = 150; i < 301; i++){
            System.out.println(i);
        }
        
        System.out.println("Sum from 1 to 1000:");
        for(int i = 1; i< 1001; i++){
            sum += i;
            System.out.println(sum);
        }

        System.out.println("Multiples of 3:");
        for(int i = 0; i < 101; i+=3){
            System.out.println(i);
        }

        System.out.println("Factorial:");
        for(int i = 1; i < 11; i++){
            factorial *= i;
            System.out.println("The factorial of " + i + " is (" + i + "!) " + factorial);
        }

        System.out.println("Factorial up to 40:");
        for(int i = 1; i < 41; i++){
            factorial5 *= i;
            System.out.println("The factorial of " + i + " is (" + i + "!) " + factorial5);
        }
        
        System.out.println("Fibonacci");

        System.out.println("The sequence is: ");
        System.out.println(previousNumber);
        System.out.println(fibonacci); 

        while(fibonacci < 100){
            int sequence = fibonacci + previousNumber;
            if(sequence >= 100){
                break;
            }
            System.out.println(sequence);
            previousNumber = fibonacci;
            fibonacci = sequence;
        }
        
    }
}
