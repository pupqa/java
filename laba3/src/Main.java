import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        bubbleSort(arr);
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
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
