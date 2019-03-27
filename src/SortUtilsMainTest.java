/*
2.3 Создать отдельный класс SortUtils.java и переделать все сортировки
 в статические методы + перенести их в новосозданный класс для того,
 чтобы было возможно из вызывать непосредственно через класс. Методы не должны быть void.
*/
public class SortUtilsMainTest {

	public static void main(String[] args) {
		int[] arrayForMerge = {5, 6, 7, 8, 12, 15, 3, 4};
		int[] arrayForBubbleSort = {25, 12, 4, 13, 18};

		displayArray(arrayForMerge);
		System.out.println("Merge sort array");
		SortUtils.mergeSort(arrayForMerge, arrayForMerge.length);
		displayArray(arrayForMerge);
		System.out.println();

		displayArray(arrayForBubbleSort);
		System.out.println("Bubble sort array");
		SortUtils.bubbleSort(arrayForBubbleSort);
		displayArray(arrayForBubbleSort);
	}

	public static void displayArray(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}