package homewok;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		int count = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите длину массива: Size = ");
		int size = input.nextInt(); 
		int[] arrayNumber = new int[size];
		System.out.println("Заполните массив из " + size + " значений:");
		for(int i = 0; i < size; i++) {
			System.out.print("a[" + i + "] = ");
			arrayNumber[i] = input.nextInt();
		}
		
		System.out.print ("Массив: a[" + (size-1) + "] = [ ");
	    for (int i = 0; i < size; i++) {
	        System.out.print (arrayNumber[i] + ", ");
	    }
	    System.out.println ("]");
	    
	    for(int i = 1; i < size ; i++) {
	    	
	    	if(arrayNumber[i-1] != arrayNumber[i]) {
	    		count++;
	    	}
	    }
	    System.out.print ("Количество различный значений в массиве: " + count);
	    
    }
}
