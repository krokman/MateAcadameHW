import java.util.Arrays;

import static java.lang.System.arraycopy;

/*
2.3 Создать отдельный класс SortUtils.java и переделать все сортировки
в статические методы + перенести их в новосозданный класс для того,
чтобы было возможно из вызывать непосредственно через класс. Методы не должны быть void.
*/
public class SortUtils {
	public static int[] bubbleSort(int[] array) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(i, i + 1, array);
					isSorted = false;
				}
			}
		}
		return array;
	}

	public static void mergeSort(int[] array, int arrayLenght) {
		if (arrayLenght < 2) {
			return;
		}
		int mid = arrayLenght / 2;
		int[] arrayFirstHalf = new int[mid];
		int[] arraySecondHalf = new int[arrayLenght - mid];

		for (int i = 0; i < mid; i++) {
			arrayFirstHalf[i] = array[i];
		}
		for (int i = mid; i < arrayLenght; i++) {
			arraySecondHalf[i - mid] = array[i];
		}
		mergeSort(arrayFirstHalf, mid);
		mergeSort(arraySecondHalf, arrayLenght - mid);

		merge(array, arrayFirstHalf, arraySecondHalf, mid, arrayLenght - mid);
	}

	public static void merge(
			int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	public static void swap(int firstNumberIndex, int secondNumberIndex, int[] array) {
		int buffer = array[firstNumberIndex];
		array[firstNumberIndex] = array[secondNumberIndex];
		array[secondNumberIndex] = buffer;
	}
}