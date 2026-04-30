

public class RandomTen_Huffman {

	public static void main(String[] args) {

		int[] values= new int [10];

		for (int i = 0; i < values.length; i++) {
			values[i] = (int)(Math.random()*20);
		}

		System.out.print("All array elemetns: ");		
		for (int element : values) {
			System.out.print(element + " ");

		}
		System.out.print("\nEven index elements: ");

		for(int i = 0; i < values.length; i = i+2){
			System.out.print(values[i] + " ");
		}

		System.out.print("\nEven elements: ");
		for (int element : values) {
			if(element % 2 == 0 ){
				System.out.print(element + " ");
			}

		}

		System.out.print("\nReversed Array: ");
		for(int i = values.length-1 ; i >= 0; i--){
			System.out.print(values[i] + " ");
		}

		System.out.print("\nFirst element: " + values[0]);
		System.out.print("\nLast element: "+ values[values.length-1]);

		int highest = 0;
		for(int element : values){
			if(element > highest){
				highest = element;
			}
		}
		System.out.print("\nHighest element: " + highest);

		int lowest = 999;
		for(int element : values){
			if(element < lowest){
				lowest = element;
			}
		}
		System.out.print("\nLowest element: " + lowest);
	}
}	

