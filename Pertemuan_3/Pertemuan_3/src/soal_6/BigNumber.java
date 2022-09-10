package soal_6;

import java.math.BigInteger;
import java.util.*;

public class BigNumber {

	public static void main(String[] args) {
		
		BigInteger angka1, angka2;
		
		Scanner input = new Scanner(System.in);
		
		angka1 = input.nextBigInteger();
		angka2 = input.nextBigInteger();
		
		
		System.out.println("Hasil Jumlah: " + angka1.add(angka2));
		System.out.println("Hasil Kali: " + angka1.multiply(angka2));
		
		input.close();

	}

}
