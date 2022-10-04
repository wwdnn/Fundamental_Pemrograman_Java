package Task_1;

public class Restaurant {
	private String [] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;
	
	public Restaurant() {
		nama_makanan = new String [10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	
//	Setter
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}

//	Getter
	public void tampilMenuMakanan() {
		for(int i = 0; i<=id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
			}
		}
	}
	
	private boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
	
	public void pesanMakanan(String namaMakanan, int jumlahPesanan) {
		for(int i=0; i<=id; i++) {			
			if (this.nama_makanan[i].equalsIgnoreCase(namaMakanan)) {
				System.out.print("Makanan tersedia");
				if(!isOutOfStock(i) && jumlahPesanan <= this.stok[i]) {
					this.stok[i] -= jumlahPesanan;
					System.out.println(", Jumlah Bayaran: " + (jumlahPesanan*this.harga_makanan[i]));
				} else if(isOutOfStock(i)) {
					System.out.println(", tapi stoknya tidak ada");
				} else {
					System.out.println(". Maaf, jumlah pesanan anda melebihi stok");
				}
			}
			
		}
	}
}