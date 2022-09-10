package soal_7;

public class MDArrayJava {

	public static void main(String[] args) {
		//One Dimensional Arrays
		 int[] fisrtArray = {2, 5, 3}; 
		 int[] secondArray = {9, 5, 3}; 
		 int[] thirdArray = {2, 4, 9}; 
		 int[] fourthArray = {10, 11, 12}; 
		 int[] fifthArray = {13, 14, 15}; 
		 int[] sixthArray = {16, 17, 18}; 
		 int[] seventhArray = {19, 20, 21}; 
		 int[] eighthArray = {22, 23, 24}; 
		 int[] ninthArray = {25, 26, 27}; 
		 
		 //Two Dimensional Arrays
		 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
		 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		 
		 //Three Dimensional Array
		 int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		 
		 //
		 int indexArrayOneDimension;
		 int indexArrayTwoDimension;
		 int indexArrayThreeDimension;
		 
		 for(indexArrayThreeDimension = 0; indexArrayThreeDimension < threeDimensionalArray.length; indexArrayThreeDimension++) {
			 System.out.print("{");
			 for(indexArrayTwoDimension = 0; indexArrayTwoDimension < twoDimensionalArray1.length; indexArrayTwoDimension++) {
				 System.out.print(" {");
				 for(indexArrayOneDimension = 0; indexArrayOneDimension < fisrtArray.length; indexArrayOneDimension++) {
					 System.out.printf(" %d ", threeDimensionalArray[indexArrayThreeDimension][indexArrayTwoDimension][indexArrayOneDimension]);
				 }
				 System.out.print("} ");
			 }
			 System.out.println("}");
		 }
	}

}
