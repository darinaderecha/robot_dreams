
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] makeAnArray(int arrLength) {
        Random random = new Random();
        if (arrLength <= 0) {
            throw new IllegalArgumentException();

        }
        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int findMinimal(int[] arr) {
        checkArray(arr);
        int length = arr.length;
        mergeSort(arr, length);
        return arr[0];
    }

    public static int findMax(int[] arr) {
        checkArray(arr);
        heapSort(arr, arr.length);
        return arr[arr.length - 1];
    }

    public static int findMiddle(int[] arr) {
        checkArray(arr);
        insertionSort(arr);
        return arr[arr.length / 2];

    }

    public static int findSum(int[] arr) {
        checkArray(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void checkArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
    }


    //there are different types of sorting
    private static void mergeSort(int arr[], int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];

        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(arr, left, right, mid, n - mid);
    }

    static void merge(int[] arr, int[] left, int[] right, int leftInt, int rightInt) {
        int i = 0, j = 0, k = 0;
        while (i < leftInt && j < rightInt) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftInt) {
            arr[k++] = left[i++];
        }
        while (j < rightInt) {
            arr[k++] = right[j++];
        }
    }

    private static void heapSort(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int last = n - 1; last >= 0; last--) {
            int temp = arr[0];
            arr[0] = arr[last];
            arr[last] = temp;

            heapify(arr, last, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int target = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[target]) {
            target = left;
        }
        if (right < n && arr[right] > arr[target]) {
            target = right;
        }
        if (target != i) {
            int temp = arr[i];
            arr[i] = arr[target];
            arr[target] = temp;
            heapify(arr, n, target);
        }

    }

    private static void insertionSort(int [] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
    }
}
