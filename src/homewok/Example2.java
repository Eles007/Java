package homewok;
import java.util.Scanner;
import java.math.BigInteger;

public class Example2 {

	public static void main(String[] args) {
			

			BigInteger C[][];
			Scanner input = new Scanner(System.in);
			System.out.print("Введите степень: ");
			int power = input.nextInt(); 

				C = new BigInteger[power + 1][power + 1];
				for (int n = 0; n <= power; n++) {
					//первый и последний элемент в строке равен 1
					C[n][0] = C[n][n] = BigInteger.ONE;
					//далее вычисляем внутреннюю часть
					for (int k = 1; k < n; k++) {
						C[n][k] = C[n-1][k-1].add(C[n-1][k]);
					}			
				}
			
				for (int n = 0; n <= power; n++) {
					for (int k = 0; k <= n; k++) {
						System.out.print(C[n][k] + " ");
					}
					System.out.println();
				}
			}
			
}