package Sortirovki.sortextends;

public class Bubble extends FillArray{
	public int[] sortBubble(int[] arrayToSort) {//puzirkovaya sortirovka
		int temp;
		if (arrayToSort.length == 0) return arrayToSort;
		for (int i =0; i < arrayToSort.length;i++){
			for (int j =0; j < arrayToSort.length-1-i;j++){
				if (arrayToSort[j] > arrayToSort[j+1]){
					temp = arrayToSort[j+1];
					arrayToSort[j+1] = arrayToSort[j];
					arrayToSort[j]= temp;
				}
			}
		}
		return arrayToSort;
	}
}
