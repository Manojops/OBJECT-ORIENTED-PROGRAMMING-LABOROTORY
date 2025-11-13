
import java.util.Random;

// Thread 1: Generates random numbers
class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();

        while (true) {
            int num = rand.nextInt(100);  // Generate a random integer (0–99)
            System.out.println("\nGenerated Number: " + num);

            // If number is even → Square thread
            if (num % 2 == 0) {
                new SquareThread(num).start();
            }
            // If number is odd → Cube thread
            else {
                new CubeThread(num).start();
            }

            try {
                Thread.sleep(1000);  // wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread 2: Computes square of even numbers
class SquareThread extends Thread {
    int number;

    SquareThread(int num) {
        this.number = num;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " = " + square);
    }
}

// Thread 3: Computes cube of odd numbers
class CubeThread extends Thread {
    int number;

    CubeThread(int num) {
        this.number = num;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " = " + cube);
    }
}

// Main class
public class MultiThreadExample {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();  // Start the number generator thread
    }
}

