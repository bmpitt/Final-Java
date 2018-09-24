import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Players free-throw percentage: ");
		int percentage = input.nextInt();
		
		System.out.println("Game 1: ");
		int madeCount1 = 0;
		
		int [] game1Array = new int[10];
		for (int i = 0; i < game1Array.length; i++) {
			game1Array[i] = (int) (Math.random() * 100);
			if (game1Array[i] < percentage) {
				
				System.out.print("IN ");
				madeCount1++;
			}
			else {
				System.out.print("OUT ");
			}
		}
		System.out.print("\nFree Throws Made: " + madeCount1 + " out of 10 \n");		
		System.out.println();
		
		System.out.println("Game 2: ");
		int madeCount2 = 0;
		
		int [] game2Array = new int[10];
		for (int i = 0; i < game2Array.length; i++) {
			game2Array[i] = (int) (Math.random() * 100);
			if (game2Array[i] < percentage) {
				
				System.out.print("IN ");
				madeCount2++;
			}
			else {
				System.out.print("OUT ");
			}
		}
		System.out.print("\nFree Throws Made: " + madeCount2 + " out of 10 \n");		
		System.out.println();
		
		System.out.println("Game 3: ");
		int madeCount3 = 0;
		
		int [] game3Array = new int[10];
		for (int i = 0; i < game3Array.length; i++) {
			game3Array[i] = (int) (Math.random() * 100);
			if (game3Array[i] < percentage) {
				
				System.out.print("IN ");
				madeCount3++;
			}
			else {
				System.out.print("OUT ");
			}
		}
		System.out.print("\nFree Throws Made: " + madeCount3 + " out of 10 \n");		
		System.out.println();
		
		System.out.println("Game 4: ");
		int madeCount4 = 0;
		
		int [] game4Array = new int[10];
		for (int i = 0; i < game4Array.length; i++) {
			game4Array[i] = (int) (Math.random() * 100);
			if (game4Array[i] < percentage) {
				
				System.out.print("IN ");
				madeCount4++;
			}
			else {
				System.out.print("OUT ");
			}
		}
		System.out.print("\nFree Throws Made: " + madeCount4 + " out of 10 \n");		
		System.out.println();
		
		System.out.println("Game 5: ");
		int madeCount5 = 0;
		
		int [] game5Array = new int[10];
		for (int i = 0; i < game5Array.length; i++) {
			game5Array[i] = (int) (Math.random() * 100);
			if (game5Array[i] < percentage) {
				
				System.out.print("IN ");
				madeCount5++;
			}
			else {
				System.out.print("OUT ");
			}
		}
		System.out.print("\nFree Throws Made: " + madeCount5 + " out of 10 \n");		
		
		System.out.println("\nSummary: ");
				
		//Make "madeCount" Array..calculate max/min/total/average from array
		
		int [] madeArray = {madeCount1, madeCount2, madeCount3, madeCount4, madeCount5};
		
		System.out.println("Best Game: Free-Throws Made: " + maxValue(madeArray));
		System.out.println("Worst Game: Free-Throws Made: " + minValue(madeArray));
		System.out.println("Total Free-Throws Made: " + total(madeArray) + " out of 50");
		System.out.println("Five-Game Average Percentage: " + average(madeArray) + ('%'));
		
	}
	public static int maxValue(int[] myArray) {
			
		int maxValue = myArray [0];
			
		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] > maxValue) {
			maxValue = myArray[i];
			}
		}
		return maxValue;
	}
	
	public static int minValue(int[] myArray) {
		
		int minValue = myArray[0];
		
		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] < minValue) {
			minValue = myArray[i];
			}
		}
		return minValue;
	}
	
	public static int total(int[] myArray) {
		
		int total = 0;
		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}
		return total;
	}
	
	public static double average(int[] myArray) {
		double total = 0;
		double average = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i];
			average = total / myArray.length * 10;
		}
		return average;
	}
}