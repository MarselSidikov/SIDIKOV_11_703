package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 08.11.2017
 * MainTask1
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainTask1 {

    public static int[] findMinsInColumns(int matrix[][], int N, int M) {
        int mins[] = new int[matrix[0].length];
        int countMins = 0;
        for (int i = 0; i < M; i++) {
            int min = matrix[0][i];
            for (int j = 0; j < N; j++) {
                if (matrix[j][i] < min) {
                    min = matrix[j][i];
                }
            }
            mins[countMins] = min;
            countMins++;
        }

        return mins;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        int matrix[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int mins[] = findMinsInColumns(matrix, N, M);
        System.out.println(Arrays.toString(mins));


    }
}
