import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random random = new Random();
        int listSize = 50;

        for (int i = 0; i < listSize; i++) {
            int randomNumber = random.nextInt(1,100);
            numbers.add(randomNumber);
        }

        for (int i = 0; i < listSize; i++) {
            int number = numbers.get(i);
            if (number % 2 == 1) {
                oddNumbers.add(number);
            }else {
                evenNumbers.add(number);
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: "+ evenNumbers);
    }
}