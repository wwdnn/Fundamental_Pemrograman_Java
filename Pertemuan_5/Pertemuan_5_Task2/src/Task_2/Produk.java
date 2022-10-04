package Task_2;

public class Produk {
	private int idProduk = 0;
	private String [] nama_produk;
	private double [] harga;
	private int [] qty;
	
	public Produk() {
		nama_produk = new String[11];
		harga = new double[11];
		qty = new int[11];
	}
	
	public void setQty (int index, int jumlah) {
		this.qty[index] -= jumlah;
	}
	
	public String getNama_produk(int index) {
		return nama_produk[index];
	}



	public double getHarga(int index) {
		return harga[index];
	}



	public void tambahMenuMakanan(String nama, double harga, int stok) {
		idProduk += 1;
		this.nama_produk[idProduk] = nama;
		this.harga[idProduk] = harga;
		this.qty[idProduk] = stok;
	}
	
	void tampilMenu() {
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println(" Data Makanan     ");
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 System.out.println("NoNama Makanan  Harga JumlahProduk ");
		 System.out.println("------------------------------------------------------");
		 for (int a=1;a<=idProduk;a++ )
		 {
		   System.out.println(a +" " + nama_produk[a]+"  "+harga[a] + " " + qty[a]);
		 }
		 System.out.println("------------------------------------------------------");
	}
	
}
