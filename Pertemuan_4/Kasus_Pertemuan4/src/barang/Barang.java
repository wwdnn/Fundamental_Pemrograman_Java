package barang;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	
	public int getStok() {
		return stok;
	}


	public void tambahStok(int stok) {
		this.stok += stok;
	}


	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		this.stok = stk;
	}

}
