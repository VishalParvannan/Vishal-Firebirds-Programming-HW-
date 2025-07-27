import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        int num = 5;
        System.out.println("Part 1: Counting up by 3 until we hit 100 or more:");
        
        do {
            System.out.println(num);
            num += 3;
        } while (num < 100);

        System.out.println(); 

        Scanner input = new Scanner(System.in);
        System.out.print("Part 2: Enter a string to shorten one letter at a time: ");
        String userInput = input.nextLine();

        if (userInput.length() > 0) {
            while (userInput.length() > 0) {
                System.out.println(userInput);
                userInput = userInput.substring(1); 
            }
        } else {
            System.out.println("Error: String must be longer than 0 characters.");
        }

        input.close();
    }
}
