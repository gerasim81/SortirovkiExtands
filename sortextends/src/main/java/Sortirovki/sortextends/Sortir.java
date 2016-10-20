package Sortirovki.sortextends;

import java.util.Random;

public class Sortir extends BubbleBrushShakerEvenOdd{
	final static int MYCONST = 30;
	
	@Override
	public String toString(){
		String s = "Sortirovki";
		return s;
	}
	
	public static void main(String[] args){
		final Random random = new Random();
		int razmer = random.nextInt(MYCONST);
		//razmer = 20;
		
		
		int [] array1 = new int[razmer];//razmer massiva auto

		Sortir myA = new Sortir();
				
		//----------------------------
		//razmer = random.nextInt(MYCONST);
		array1 = new int[razmer];
		array1 = myA.randomFill(array1, 1234567890);
		array1 = myA.sortBubble(array1);
		for (int dig1 : array1){
			System.out.print(dig1 + " ");
		}
		System.out.println();
		//----------------------------
		//razmer = random.nextInt(MYCONST);
		array1 = new int[razmer];
		array1 = myA.randomFill(array1, 1234567890);
		array1 = myA.sortBrush(array1);
		for (int dig1 : array1){
			System.out.print(dig1 + " ");
		}
		System.out.println();
		//----------------------------
		//razmer = random.nextInt(MYCONST);
		array1 = new int[razmer];
		array1 = myA.randomFill(array1, 1234567890);
		array1 = myA.sortShaker(array1);
		for (int dig1 : array1){
			System.out.print(dig1 + " ");
		}
		System.out.println();
		//----------------------------
		//razmer = random.nextInt(MYCONST);
		array1 = new int[razmer];
		array1 = myA.randomFill(array1, 1234567890);
		array1 = myA.sortEvenOdd(array1);
		for (int dig1 : array1){
			System.out.print(dig1 + " ");
		}		
		System.out.println();
		System.out.println(myA);
		
	}
}
