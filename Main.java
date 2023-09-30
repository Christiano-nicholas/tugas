import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variabel dan tipe data
        int num = 5;
        int[] array1D = {1, 2, 3, 4, 5};
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // For loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < num; i++) {
            System.out.print(array1D[i] + " ");
        }

        // If statement
        if (num % 2 == 0) {
            System.out.println("\nNumber is even.");
        } else {
            System.out.println("\nNumber is odd.");
        }

        // While loop
        System.out.print("Using while loop: ");
        int i = 0;
        while (i < num) {
            System.out.print(array1D[i] + " ");
            i++;
        }

        // Do-while loop
        System.out.print("\nUsing do-while loop: ");
        int j = 0;
        do {
            System.out.print(array1D[j] + " ");
            j++;
        } while (j < num);

        // 2D array
        System.out.println("\n2D Array:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}