package homewok;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите количество строк: Line = ");
		int line = input.nextInt(); 
		System.out.print("Введите количество столбцов: Column = ");
		int column = input.nextInt(); 
		int[][] arrayMatrix = new int[line][column];
		
		System.out.println("Заполняем Matrix["+ line + "] [" +column+ "] значениями:");
		for (int i = 0; i < arrayMatrix.length; i++) {
			for (int j = 0; j < arrayMatrix[i].length; j++) {
				System.out.print("a["+i+"]"+"["+j+"] = ");
				arrayMatrix[i][j] = input.nextInt(); 
			}
		}
		
		System.out.println("Неизмененный массив:");
		for (int i = 0; i < arrayMatrix.length; i++) {
			for (int j = 0; j < arrayMatrix[i].length; j++) {
				System.out.print(arrayMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		int k = 0;
		for (int i = 1; i < arrayMatrix.length; i++) {
			for (int j = 0; j < arrayMatrix[i].length; j++) {
				if(arrayMatrix[i - 1][j] > arrayMatrix[i][j]) {
					k = arrayMatrix[i - 1][j]; 
					arrayMatrix[i - 1][j] = arrayMatrix[i][j];
					arrayMatrix[i][j] = k;
				}
			}
		}
		
		System.out.println("Измененный массив:");
		for (int i = 0; i < arrayMatrix.length; i++) {
			for (int j = 0; j < arrayMatrix[i].length; j++) {
				System.out.print(arrayMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
}
