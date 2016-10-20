package Sortirovki.sortextends;

public class BubbleBrush extends Bubble{
	public int[] sortBrush(int[] arrayToSort) {//sortirovka rascheskoy
		int temp;
		int step = (int)(arrayToSort.length/1.24);
		boolean changeFlg = false;
		if (arrayToSort.length == 0) return arrayToSort;
		while (true){
			for (int i = 0;i <arrayToSort.length - step;i++){
				if(arrayToSort[i] > arrayToSort[i+step]){
					temp = arrayToSort[i+step];
					arrayToSort[i+step] = arrayToSort[i];
					arrayToSort[i]= temp;
					changeFlg = true;
				}
			}
			if (step > 1){
				step = (int)(step/1.24);

			}
			else {
				if (!changeFlg) break;
			}
			changeFlg = false;
		}
		//System.out.println("counter = " + counter); debug
		return arrayToSort;
	}	
}
