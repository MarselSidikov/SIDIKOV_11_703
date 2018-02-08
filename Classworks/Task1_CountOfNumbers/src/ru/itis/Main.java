package ru.itis;

public class Main {

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    // 4627 -> {7, 2, 6, 4}
    public static int[] toArray(int number) {
        // количество цифр в массиве + количество элементов массива
        int countOfDigits = 0;
        // массив для хранения результата
        int result[] = new int[10];

        // пока исходное число не равно нулю
        while (number != 0) {
            // кладем в массив a[0] самое правое число
            // потом в массив a[1] кладем почти самое правое число
            // и т.д.
            result[countOfDigits] = number % 10;
            number = number / 10;
            countOfDigits++;
        }

        int copy[] = new int[countOfDigits];

        for (int i = 0; i < countOfDigits; i++) {
            copy[i] = result[i];
        }

        return copy;
    }
    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static int calcCountOfNumber(int number[]) {
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] < number[j]) {
                    result = result + fact(number.length - 1 - i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 4627;

        int numberAsArray[] = toArray(number);
        reverse(numberAsArray);
        int result = calcCountOfNumber(numberAsArray);
        System.out.println(result == 15);
    }

}
