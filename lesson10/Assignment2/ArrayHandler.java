package Assignment2;

import java.util.Random;

/*
There are possible four ways to make array: by calling empty constructor with setting array ,
by setting length and there is array initializes,
by length constructor with initialization in constructor,
by ordinary constructor with array as parameter
 */
public class ArrayHandler {

    private int[] array;
    private int arrayLength;

    public ArrayHandler() {
    }

    public ArrayHandler(int arrayLength) {
        this.arrayLength = arrayLength;
        if (arrayLength > 0) {
            array = new int[arrayLength];
        }
    }

    public ArrayHandler(int[] array) {
        this.array = array;
    }

    public int[] initializeArray() {
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);

        }
        return array;
    }

    public void ascendingSorting() {
        if (array == null) {
            throw new IllegalArgumentException("array is empty");
        }
        if (array.length == 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }

    public void descendingSorting() {
        if (array == null) {
            throw new IllegalArgumentException("array is empty");
        }
        if (array.length == 1) {
            return;
        }
        for (int i = arrayLength - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }


    public void printArray() {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
        if (arrayLength > 0) {
            array = new int[arrayLength];
        }
    }

    public int getArrayLength() {
        return arrayLength;
    }


}
