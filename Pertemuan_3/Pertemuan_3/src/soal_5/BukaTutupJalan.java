package soal_5;

import java.util.*;

public class BukaTutupJalan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String mobil1 = input.next();
		String mobil2 = input.next();
		String mobil3 = input.next();
		String mobil4 = input.next();
		
		input.close();
		
		String gabungMobil = (mobil1.concat(mobil2).concat(mobil3).concat(mobil4));
		double hasilGabung = ((Double.parseDouble(gabungMobil))-999999)% 5;
		
		if(hasilGabung == 0) {
			System.out.println("Jalan");
		}
		else {
			System.out.println("Berhenti");
		}
		
		
	}

}
