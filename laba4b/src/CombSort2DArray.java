import java.util.Arrays;
import java.util.Scanner;
public class CombSort2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        combSort(arr);
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zero] = arr[i];
                zero++;
            }
        }
        int[] result = Arrays.copyOfRange(arr, 0, zero);
        System.out.println("Отсортированный массив без нулей: " + Arrays.toString(result));
    }
    public static void combSort(int[] arr) {
        double factor = 1.247;
        int step = arr.length - 1;
        boolean swapped = true;

        while (step >= 1 || swapped) {
            step = (int) (step / factor);
            swapped = false;

            for (int i = 0; i + step < arr.length; i++) {
                if (arr[i] > arr[i + step]) {
                    swap(arr, i, i + step);
                    swapped = true;
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}