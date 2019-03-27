/*
2.3 Создать отдельный класс SortUtils.java и переделать все сортировки
 в статические методы + перенести их в новосозданный класс для того,
 чтобы было возможно из вызывать непосредственно через класс. Методы не должны быть void.
*/
public class SortUtilsMainTest {

	public static void main(String[] args) {
		int[] array1 = {5, 6, 7, 8, 12, 15, 3, 4};
		int[] array2 = {1, 2, 25, 17, 18, 23};
		int[] array3;
		int[] array4 = {25, 12, 4, 13, 18};

		System.out.println("Merge sort array");
		array3 = SortUtils.mergeSort(array1, array2);
		displayArray(array3);
		System.out.println();

		System.out.println("Bubble sort array");
		displayArray(array1);
		System.out.println();

		System.out.println("Bubble sort array");
		SortUtils.bubbleSort(array4);
		displayArray(array4);

	}

	public static void displayArray(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
	}
}