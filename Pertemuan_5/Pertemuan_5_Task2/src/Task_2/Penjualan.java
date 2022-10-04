package Task_2;
import java.util.Scanner;

public class Penjualan {
	private String nama_produk;
	private int quantity;
	private double harga_total = 0;
	private int [] idPesanan;
	private int id2 = 0;
	
	public Penjualan() {
		idPesanan = new int[10];
	}
	
	public void pesanMakanan(Produk produk) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("----Form Pemesanan Makanan----");
		
		while(true) {
			System.out.print("Apakah anda yakin ingin memesan ? (y/n) :");
		    String pesanan = sc.next();
		    
		    if(pesanan.equalsIgnoreCase("n")) {
		    	break;
		    } else {
		    	id2 += 1;
		       
		        System.out.print("No. Makanan : ");
		        idPesanan [id2] = sc.nextInt();
		       
		        nama_produk = produk.getNama_produk(idPesanan[id2]);
		        System.out.println("Nama Makanan : " + nama_produk);
		        
		        System.out.println("Harga Makanan : " + produk.getHarga(idPesanan[id2]));
		        
		     
		        System.out.print("Jumlah Pesan : ");
		        quantity = sc.nextInt();
		        produk.setQty(idPesanan[id2], quantity);
		        
		        
		        harga_total = quantity * produk.getHarga(idPesanan[id2]);
		        System.out.println("Total Harga : " + harga_total);

		    }
		    System.out.println();
		}
		sc.close();
	}
}
