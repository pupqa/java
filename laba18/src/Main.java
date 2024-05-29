import java.util.*;

interface Sor {
    boolean sort(int a, int b);
}

public class Main {
    public static int[] sortArr(int[] arr, Sor asort) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { //цикл от 1 до n-1
            int k = arr[i]; //сохраняем текущий элемент в переменную k
            int j = i - 1; //начинаем с предыдущего элемента
            while (j >= 0 && asort.sort(arr[j], k)) { //пока j >= 0 и arr[j] удовлетворяет условию сортировки
                arr[j + 1] = arr[j]; //сдвиг элемента вправо
                j = j - 1; //переход к следующему элементу слева
            }
            arr[j + 1] = k; //вставляем k на нужное место
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] p = {2, 5, 1, 4, 3, 6, 7, 9};
        Sor sortVost = (a, b) -> a > b;
        Sor sortUb = (a, b) -> a < b;
        System.out.println("массив по возрастанию: "+ Arrays.toString(sortArr(p, sortVost)));
        System.out.println("массив по убыванию: "+ Arrays.toString(sortArr(p, sortUb)));
    }
}
