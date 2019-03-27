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

	public static int[] mergeSort(int[] firstArray, int[] secondArray) {
		int[] copyOfFirstArray = Arrays.copyOf(firstArray, firstArray.length);
		int[] copyOfSecondArray = Arrays.copyOf(secondArray, secondArray.length);

		bubbleSort(copyOfFirstArray);
		bubbleSort(copyOfSecondArray);

		int[] outArray = new int[copyOfFirstArray.length + copyOfSecondArray.length];
		int firstArrayNumberIndex = 0;
		int secondArrayNumberIndex = 0;
		int outArrayNumberIndex = 0;
		while (firstArrayNumberIndex < copyOfFirstArray.length && secondArrayNumberIndex < copyOfSecondArray.length) {
			outArray[outArrayNumberIndex++] = copyOfFirstArray[firstArrayNumberIndex] <
					copyOfSecondArray[secondArrayNumberIndex] ?
					copyOfFirstArray[firstArrayNumberIndex++] : copyOfSecondArray[secondArrayNumberIndex++];
		}
		if (firstArrayNumberIndex < copyOfFirstArray.length) {
			arraycopy(copyOfFirstArray, firstArrayNumberIndex, outArray,
					outArrayNumberIndex, copyOfFirstArray.length - firstArrayNumberIndex);
		} else if (secondArrayNumberIndex < copyOfSecondArray.length) {
			arraycopy(copyOfSecondArray, secondArrayNumberIndex, outArray,
					outArrayNumberIndex, copyOfSecondArray.length - secondArrayNumberIndex);
		}
		return outArray;
	}

	public static void swap(int firstNumberIndex, int secondNumberIndex, int[] array) {
		int buffer = array[firstNumberIndex];
		array[firstNumberIndex] = array[secondNumberIndex];
		array[secondNumberIndex] = buffer;
	}
}