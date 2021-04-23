import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 10;
        int thirdNumber;
        boolean isBetweenNumber = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert whole number");

        thirdNumber = keyboard.nextInt();

        if (thirdNumber < secondNumber && thirdNumber > firstNumber) {
            isBetweenNumber = true;
        } else {
            isBetweenNumber = false; //thirdnumber is true
        }
        if (isBetweenNumber == true) {
            System.out.println("Well done");
        } else {
            System.out.println("Try again later");
        }
}
}