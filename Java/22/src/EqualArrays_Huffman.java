
public class EqualArrays_Huffman {

	public static boolean compare( int[] arr1, int[] arr2){
		if (arr1.length != arr2.length){
			return false;
		}

		for (int i = 0; i < arr1.length; i++){
			if (arr1[i]==arr2[i]){
				continue;
			} else {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
	
		int[] values1 = { 1, 2, 3, 4};
		int[] values2 = { 1, 2, 3, 4};
		int[] values3 = { 1, 2, 3, 4, 5, 6};
		int[] values4 = { 5, 6, 7, 8};

		
		if (compare(values1,values2)) {
			System.out.println("Array 1 and 2 are equal");
		}else{
			System.out.println("Array 1 and 2 are not equal");
			
		}
			
		if (compare(values1,values3)) {
			System.out.println("Array 1 and 3 are equal");
		}else{
			System.out.println("Array 1 and 3 are not equal");
			
		}	
			
		if (compare(values1,values4)) {
			System.out.println("Array 1 and 4 are equal");
		}else{
			System.out.println("Array 1 and 4 are not equal");
			
		}
	
		}
}