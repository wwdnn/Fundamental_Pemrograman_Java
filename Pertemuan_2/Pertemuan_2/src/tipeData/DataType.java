package tipeData;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		double data = inputUser.nextDouble();
		
		if((data >= Long.MIN_VALUE && data <= Long.MAX_VALUE)) {
			System.out.println((long)data + " Can be fitted in: ");
			if (data >= Byte.MIN_VALUE && data <= Byte.MAX_VALUE) {
				System.out.println("Byte");
			}
			if (data >= Short.MIN_VALUE && data <= Short.MAX_VALUE) {
				System.out.println("Short");
			}
			if (data >= Integer.MIN_VALUE && data <= Integer.MAX_VALUE) {
				System.out.println("Integer");
			}
			
			System.out.println("Long");
			
		} else {
			System.out.println(data + " can't be fitted anywhere");
		}
		
		inputUser.close();

	}

}
