import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// odd or even
        System.out.println("Enter the number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


//valid to vote or not
        int age;
        System.out.println("Enter the age");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("allowed to vote");
        } else {
            System.out.println("not allowed to vote");
        }
        System.out.println("enter a number");
        int userInput = input.nextInt();
        if (userInput % 3 == 0 && userInput % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (userInput % 5 == 0) {
            System.out.println("Buzz");
        } else if (userInput % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(userInput);
        }
    }
    }