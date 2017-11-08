package ru.itis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void readMatrix(int matrix[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
	    int matrix[][];
	    // объявил массив из пяти элементов
        // где каждый элемент - массив
	    matrix = new int[5][];

	    for (int i = 0; i < matrix.length; i++) {
	        // создал строку размерности 0-5
	        matrix[i] = new int[random.nextInt(5) + 1];
        }

        showMatrix(matrix);

	    int otherMatrix[][] = new int[5][5];
        System.out.println("пампам");
        showMatrix(otherMatrix);

        int sizeOfMatrix;
        sizeOfMatrix = scanner.nextInt();

        int fromConsoleMatrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        readMatrix(fromConsoleMatrix);

        System.out.println("пампам");
        showMatrix(fromConsoleMatrix);
    }
}
