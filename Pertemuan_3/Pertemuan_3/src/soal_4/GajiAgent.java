package soal_4;

import java.util.*; 

public class GajiAgent {

	public static void main(String[] args) {
//		Gaji Pokok = 500.000
//		Bonus = 25% jika minimal penjualan 40 item 
//		Bonus = 35% jika minimal minimal 80 item
//		Jika menjual kurang dari 15 item = pemotongan 15
//		Harga item = 50.000
		
		Scanner input = new Scanner(System.in);
		
		double Gaji = 500000;
		double bonus;
		
		System.out.print("Laporan Penjualan : ");
		int item = input.nextInt();
		System.out.println("Jumlah item yang terjual : " + item );
		
		if(item >= 40)
		{
			bonus = 50000 * 0.25;
			System.out.println("Bonus yang diterima : " + (int)bonus);
			System.out.println("Total Gaji : " + (int)((bonus * item) + Gaji));
		}
		else if (item > 80 )
		{
			bonus = 50000 * 0.35;
			System.out.println("Bonus yang diterima : " + (int)bonus);
			System.out.println("Total Gaji : " + (int)((bonus * item) + Gaji));
		}
		else if (item < 15)
		{
			bonus = 50000 * 0.15;
			item = 15 - item;
			System.out.println("Pemotongan gaji : " + (int)bonus);
			System.out.println("Total Gaji : " + (int)(Gaji - (bonus * item)));
		}
		else {
			bonus = 50000 * 0.1 ;
			System.out.println("Total gaji : " + (int)((bonus * item) + Gaji));
		}
		
		input.close();

	}

}
