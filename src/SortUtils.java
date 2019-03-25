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
		int buff;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					buff = array[i];
					array[i] = array[i + 1];
					array[i + 1] = buff;
					isSorted = false;
				}
			}
		}
		return array;
	}

	public static int[] mergeSort(int[] arrayIn1, int[] arrayIn2) {
		int[] array1 = Arrays.copyOf(arrayIn1, arrayIn1.length);
		int[] array2 = Arrays.copyOf(arrayIn2, arrayIn2.length);

		bubbleSort(array1);
		bubbleSort(array2);

		int[] array3 = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		while (i < array1.length && j < array2.length) {
			array3[k++] = array1[i] < array2[j] ? array1[i++] : array2[j++];
		}
		if (i < array1.length) {
			arraycopy(array1, i, array3, k, array1.length - i);
		} else if (j < array2.length) {
			arraycopy(array2, j, array3, k, array2.length - j);
		}
		return array3;
	}
}