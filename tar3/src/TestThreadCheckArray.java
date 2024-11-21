
import java.util.ArrayList;
import java.util.Scanner;

public class TestThreadCheckArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Thread thread1, thread2;

            // Input array size
            System.out.println("Enter array size");
            int num = input.nextInt();

            // Create an ArrayList for the input
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println("Enter numbers for array");

            for (int index = 0; index < num; index++) {
                arrayList.add(input.nextInt()); // Add elements to the ArrayList
            }

            // Input target number
            System.out.println("Enter number");
            num = input.nextInt();

            // Create SharedData object
            SharedData sd = new SharedData(arrayList, num);

            // Create threads
            thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
            thread2 = new Thread(new ThreadCheckArray(sd), "thread2");

            // Start threads
            thread1.start();
            thread2.start();

            // Wait for threads to finish
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check the result
            if (!sd.getFlag()) {
                System.out.println("Sorry");
                return;
            }

            // Print results
            System.out.println("Solution for b : " + sd.getB() + ", n = " + sd.getArrayList().size());

            System.out.print("I:    ");
            for (int index = 0; index < sd.getArrayList().size(); index++)
                System.out.print(index + "    ");
            System.out.println();

            System.out.print("A:    ");
            for (int index : sd.getArrayList()) {
                System.out.print(index);
                int counter = 5;
                while (true) {
                    index = index / 10;
                    counter--;
                    if (index == 0)
                        break;
                }
                for (int i = 0; i < counter; i++)
                    System.out.print(" ");
            }

            System.out.println();
            System.out.print("C:    ");
            for (boolean index : sd.getWinArray()) {
                if (index)
                    System.out.print("1    ");
                else
                    System.out.print("0    ");
            }
        }
    }
}
