package strings;

public class formatString {

	public static void main(String[] args) {
		String A = "hello";
		String B = "hava";
		
//		Jumlah panjang dari variabel A dan B
		int jumlahKarakter = A.length() + B.length();
		System.out.println(jumlahKarakter);
		
//		Membandingkan string dengan konsep lexicographically
		if(A.compareTo(B) < 0) {
			System.out.println("No");
		}else if(A.compareTo(B) == 0) {
			System.out.println("Same");
		}else {
			System.out.println("Yes");
		}
		
//		Mengubah setiap huruf pertama menjadi uppercase dan menggabungkan variabel A & B
		String firstCapitalA = A.substring(0,1).toUpperCase() + A.substring(1);
		String firstCapitalB = B.substring(0,1).toUpperCase() + B.substring(1);
		String joinKata = firstCapitalA + " " + firstCapitalB;
		System.out.println(joinKata);

	}

}
