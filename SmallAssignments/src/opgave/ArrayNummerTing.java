package opgave;

public class ArrayNummerTing {

	public static void main(String[] args) {
		int[] array = {3, 1, 2, 5, 5, 1, 6, 1, 2, 5, 4};
		int[] target = {1, 2, 5};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target[0] && array[i+1] == target[1] && array[i+2] == target[2]) {
				System.out.println("target found: index = " + i);
			}
		}
	}
}
