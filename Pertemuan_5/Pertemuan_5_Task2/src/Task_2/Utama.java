package Task_2;

public class Utama {
	public static void main(String[]args) {
		Produk p = new Produk();
		Penjualan pj = new Penjualan();
		
		p.tambahMenuMakanan("Batagor", 5_000, 30);
		p.tambahMenuMakanan("Roti Bakar", 12_000, 40);
		p.tambahMenuMakanan("Indomie+Telor", 10_000, 20);
		p.tambahMenuMakanan("Kwetiaw", 12_000, 50);
		p.tambahMenuMakanan("Nasi Goreng", 12_000, 70);
		p.tambahMenuMakanan("Air Mineral", 3_000, 30);
		p.tambahMenuMakanan("Teh Manis", 4_000, 20);
		p.tambahMenuMakanan("Jus Alpukat", 8_000, 50);
		p.tambahMenuMakanan("Teh Botol", 5_000, 60);
		p.tambahMenuMakanan("Kopi", 3_000, 40);
		
		p.tampilMenu();
													
		pj.pesanMakanan(p);
		
		p.tampilMenu();
	}

}
