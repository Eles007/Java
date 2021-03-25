package homewok;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		//количество n натуральных чисел
		int n = 6;
		double S = 0;
		double M = 1.0;
		Scanner in = new Scanner(System.in);
		
		for(int i = 1; i <= n; i++) {
        System.out.print("Введите " + i + " число: ");
        double number = in.nextDouble();
        S+=number;
        M*=number;
		}
		System.out.println("Сумма чисел: S = " + S);
		System.out.println("Умножение всех чисел: M = " + M);
    }
}
