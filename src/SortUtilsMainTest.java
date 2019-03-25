/*
2.3 Создать отдельный класс SortUtils.java и переделать все сортировки
 в статические методы + перенести их в новосозданный класс для того,
 чтобы было возможно из вызывать непосредственно через класс. Методы не должны быть void.
*/
public class SortUtilsMainTest {

	public static void main(String[] args){
		int[] array1 = {5,6,7,8,12,15,3,4};
		int[] array2 = {1,2,25,17,18,23};
		int[] array3;
		int[] array4 = {25,12,4,13,18};

		array3 = SortUtils.mergeSort(array1, array2);
		for(int x : array3){System.out.print(x + " ");}

		System.out.println();
		for(int x : array1){System.out.print(x + " ");}

		System.out.println();
		SortUtils.bubbleSort(array4);
		for(int x : array4){System.out.print(x + " ");}

	}
}